
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Fibonacci {
    public static Integer fibo(int n){
        if ( n==0||n==1){
             return n;
        }else {
            return fibo(n-1)+fibo(n-2);
        }
       
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner (System.in);
        int fib;
        do{
            System.out.println("ingrese pocicion que desea  >0");
            fib = tec.nextInt();
        }while (fib <0 );
        System.out.println("el numero en la posicion "+fib+" es: "+fibo(fib));
    }
    
}
