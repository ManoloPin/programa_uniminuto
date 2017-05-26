name "calc2"
;-----------------------------------------------------------------------------------------;
; (+, -, *, /) para el 8086.
; Ejemplo de cálculo:
; Entrada 1 <- numero: 10
; Entrada 2 <- operador: -
; Entrada 3 <- numero: 5
; Unesdoc.unesco.org unesdoc.unesco.org
; 10 - 5 = 5
; Salida -> número: 5
;-----------------------------------------------------------------------------------------;





; ----------------------------------------------------------------------------------------
;Esta macro se copia desde emu8086.inc; Esta macro imprime f un carácter en AL y avanza
; La posición actual del cursor:
;-----------------------------------------------------------------------------------------;

PUTC    MACRO   char
        PUSH    AX
        MOV     AL, char
        MOV     AH, 0Eh
        INT     10h     
        POP     AX
ENDM
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;





org 100h

jmp start


; Definir variables:

msg0 db "Note: la calculadora funciona solo con valores enteros.",0Dh,0Ah
     db "Para aprender a producir el resultado de una divisin de flotador, vea float.asm en ejemplos",0Dh,0Ah,'$'
msg1 db 0Dh,0Ah, 0Dh,0Ah, 'Introduzca el primer numero y enter: $'
msg2 db "enter en primer el operador:    +  -  *  /     : $"
msg3 db "Introduzca el segundo numero y enter : $"
msg4 db  0dh,0ah , 'El resultado aproximado de mis cálculos es: $' 
msg5 db  0dh,0ah ,'Gracias por usar la calculadora! presiona cualquier tecla... ', 0Dh,0Ah, '$'
err1 db  "Operador equivocado!", 0Dh,0Ah , '$'
smth db  " Y algo $"

; Operador puede ser: '+', '-', '*', '/' or 'q' para salir en el medio.
opr db '?'

; Primer y segundo numero:
num1 dw ?
num2 dw ?


start:
mov dx, offset msg0
mov ah, 9
int 21h


lea dx, msg1
mov ah, 09h    ;Cadena de salida en ds: dx
int 21h  


; Obtener el numero de firma de varios dígitos
; Desde el teclado y almacenar
; El resultado en cx registro:

call scan_num

; Almacenar el primer numero:
mov num1, cx 



; new line:
putc 0Dh
putc 0Ah




lea dx, msg2
mov ah, 09h     ; Cadena de salida en ds: dx
int 21h  


; Obtener operador:
mov ah, 1   ; Entrada unica de char a AL.
int 21h
mov opr, al



; nueva línea:
putc 0Dh
putc 0Ah


cmp opr, 'q'      ; q- salida en el medio.
je exit

cmp opr, '*'
jb wrong_opr
cmp opr, '/'
ja wrong_opr






; Salida de una cadena en ds: dx
lea dx, msg3
mov ah, 09h
int 21h  


; Obtener el numero de firma de varios dígitos
; Desde el teclado y almacenar
; El resultado en cx register:

call scan_num


; Almacene el segundo número:

mov num2, cx 




lea dx, msg4
mov ah, 09h      ; Cadena de salida en ds: dx

int 21h  




;calcular:





cmp opr, '+'
je do_plus

cmp opr, '-'
je do_minus

cmp opr, '*'
je do_mult

cmp opr, '/'
je do_div


; Ninguna de las anteriores....

wrong_opr:
lea dx, err1
mov ah, 09h     ; Cadena de salida en ds: dx
int 21h  


exit:

; Salida de una cadena en ds: dx
lea dx, msg5
mov ah, 09h
int 21h  


;Espere cualquier tecla ...

mov ah, 0
int 16h


ret  ; Regresa a os.












do_plus:


mov ax, num1
add ax, num2
call print_num    ; Imprime el valor de ax.


jmp exit



do_minus:

mov ax, num1
sub ax, num2
call print_num    ; Imprime el valor de ax.
.

jmp exit




do_mult:

mov ax, num1
imul num2 ; (dx ax) = ax * num2. 
call print_num    ; Imprime el valor de ax.
; Dx se ignora (calc funciona solo con numeros diminutos).

jmp exit




do_div:
; dx se ignora (calc funciona solo con numeros diminutos).
mov dx, 0
mov ax, num1
idiv num2  ; ax = (dx ax) / num2.
cmp dx, 0
jnz approx
call print_num    ; Imprime el valor de ax.
jmp exit
approx:
call print_num    ; Imprime el valor de ax.
lea dx, smth
mov ah, 09h    ; Cadena de salida en ds: dx
int 21h  
jmp exit


; Obtiene el número de varios dígitos SIGNED desde el teclado,
; Y almacena el resultado en el registro CX:

SCAN_NUM        PROC    NEAR
        PUSH    DX
        PUSH    AX
        PUSH    SI
        
        MOV     CX, 0

        ; Bandera de restablecimiento:
        MOV     CS:make_minus, 0

next_digit:

        ; Obtener caracteres del teclado
        ; dentro del  AL:
        MOV     AH, 00h
        INT     16h
        ; imprimirlo:
        MOV     AH, 0Eh
        INT     10h

        ; Compruebe MENOS:

        CMP     AL, '-'
        JE      set_minus

        ; Compruebe la tecla ENTER:
        CMP     AL, 0Dh  ; carriage return?
        JNE     not_cr
        JMP     stop_input
not_cr:


        CMP     AL, 8                   ; 'RETROCESO' presionado?

        JNE     backspace_checked
        MOV     DX, 0                   ; Quitar el último dígito por
        MOV     AX, CX                  ; division:
        DIV     CS:ten                  ; AX = DX:AX / 10 (DX-rem).
        MOV     CX, AX
        PUTC    ' '                     ; Posicion cLara.
        PUTC    8                       ; Retroceder de nuevo.
        JMP     next_digit
backspace_checked:


        ; Permitir solo digitos:
        CMP     AL, '0'
        JAE     ok_AE_0
        JMP     remove_not_digit
ok_AE_0:        
        CMP     AL, '9'
        JBE     ok_digit
remove_not_digit:       
        PUTC    8       ; backspace.
        PUTC    ' '     ; clear last entered not digit.
        PUTC    8       ; backspace again.        
        JMP     next_digit ; wait for next input.       
ok_digit:


        ; multiply CX by 10 (first time the result is zero)
        PUSH    AX
        MOV     AX, CX
        MUL     CS:ten                  ; DX:AX = AX*10
        MOV     CX, AX
        POP     AX

        ; check if the number is too big
        ; (result should be 16 bits)
        CMP     DX, 0
        JNE     too_big

        ; convert from ASCII code:
        SUB     AL, 30h

        ; add AL to CX:
        MOV     AH, 0
        MOV     DX, CX      ; backup, in case the result will be too big.
        ADD     CX, AX
        JC      too_big2    ; jump if the number is too big.

        JMP     next_digit

set_minus:
        MOV     CS:make_minus, 1
        JMP     next_digit

too_big2:
        MOV     CX, DX      ; restore the backuped value before add.
        MOV     DX, 0       ; DX was zero before backup!
too_big:
        MOV     AX, CX
        DIV     CS:ten  ; reverse last DX:AX = AX*10, make AX = DX:AX / 10
        MOV     CX, AX
        PUTC    8       ; backspace.
        PUTC    ' '     ; clear last entered digit.
        PUTC    8       ; backspace again.        
        JMP     next_digit ; wait for Enter/Backspace.
        
        
stop_input:
        ; check flag:
        CMP     CS:make_minus, 0
        JE      not_minus
        NEG     CX
not_minus:

        POP     SI
        POP     AX
        POP     DX
        RET
make_minus      DB      ?       ; used as a flag.
SCAN_NUM        ENDP





; this procedure prints number in AX,
; used with PRINT_NUM_UNS to print signed numbers:
PRINT_NUM       PROC    NEAR
        PUSH    DX
        PUSH    AX

        CMP     AX, 0
        JNZ     not_zero

        PUTC    '0'
        JMP     printed

not_zero:
        ; the check SIGN of AX,
        ; make absolute if it's negative:
        CMP     AX, 0
        JNS     positive
        NEG     AX

        PUTC    '-'

positive:
        CALL    PRINT_NUM_UNS
printed:
        POP     AX
        POP     DX
        RET
PRINT_NUM       ENDP



; this procedure prints out an unsigned
; number in AX (not just a single digit)
; allowed values are from 0 to 65535 (FFFF)
PRINT_NUM_UNS   PROC    NEAR
        PUSH    AX
        PUSH    BX
        PUSH    CX
        PUSH    DX

        ; flag to prevent printing zeros before number:
        MOV     CX, 1

        ; (result of "/ 10000" is always less or equal to 9).
        MOV     BX, 10000       ; 2710h - divider.

        ; AX is zero?
        CMP     AX, 0
        JZ      print_zero

begin_print:

        ; check divider (if zero go to end_print):
        CMP     BX,0
        JZ      end_print

        ; avoid printing zeros before number:
        CMP     CX, 0
        JE      calc
        ; if AX<BX then result of DIV will be zero:
        CMP     AX, BX
        JB      skip
calc:
        MOV     CX, 0   ; set flag.

        MOV     DX, 0
        DIV     BX      ; AX = DX:AX / BX   (DX=remainder).

        ; print last digit
        ; AH is always ZERO, so it's ignored
        ADD     AL, 30h    ; convert to ASCII code.
        PUTC    AL


        MOV     AX, DX  ; get remainder from last div.

skip:
        ; calculate BX=BX/10
        PUSH    AX
        MOV     DX, 0
        MOV     AX, BX
        DIV     CS:ten  ; AX = DX:AX / 10   (DX=remainder).
        MOV     BX, AX
        POP     AX

        JMP     begin_print
        
print_zero:
        PUTC    '0'
        
end_print:

        POP     DX
        POP     CX
        POP     BX
        POP     AX
        RET
PRINT_NUM_UNS   ENDP



ten             DW      10      ; used as multiplier/divider by SCAN_NUM & PRINT_NUM_UNS.







GET_STRING      PROC    NEAR
PUSH    AX
PUSH    CX
PUSH    DI
PUSH    DX

MOV     CX, 0                   ; char counter.

CMP     DX, 1                   ; buffer too small?
JBE     empty_buffer            ;

DEC     DX                      ; reserve space for last zero.


;============================
; Eternal loop to get
; and processes key presses:

wait_for_key:

MOV     AH, 0                   ; get pressed key.
INT     16h

CMP     AL, 0Dh                  ; 'RETURN' pressed?
JZ      exit_GET_STRING


CMP     AL, 8                   ; 'BACKSPACE' pressed?
JNE     add_to_buffer
JCXZ    wait_for_key            ; nothing to remove!
DEC     CX
DEC     DI
PUTC    8                       ; backspace.
PUTC    ' '                     ; clear position.
PUTC    8                       ; backspace again.
JMP     wait_for_key

add_to_buffer:

        CMP     CX, DX          ; buffer is full?
        JAE     wait_for_key    ; if so wait for 'BACKSPACE' or 'RETURN'...

        MOV     [DI], AL
        INC     DI
        INC     CX
        
        ; print the key:
        MOV     AH, 0Eh
        INT     10h

JMP     wait_for_key
;============================

exit_GET_STRING:

; terminate by null:
MOV     [DI], 0

empty_buffer:

POP     DX
POP     DI
POP     CX                         
POP     AX
RET
GET_STRING      ENDP


