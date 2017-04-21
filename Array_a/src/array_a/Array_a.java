package array_a;

import array_a.Cargar_Array.*;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Array_a {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("INGRESE NUMERO DE FILAS");
        int filas = tec.nextInt();
        System.out.println("INGRESE NUMERO DE COLUMNAS");
        int columnas = tec.nextInt();
        
        int Matriz[][] = new int[filas][columnas];
        int Vector[] = new int [filas];
        System.out.println("INGRESE PRIMER VALOR");
        int min = tec.nextInt();
        System.out.println("INGRESE SEGUNDO VALOR");
        int max = tec.nextInt();
        System.out.println("");
        Cargar_Array objetoCargar = new Cargar_Array();
        objetoCargar.CargarArrays(Matriz, min, max, filas, columnas);
        objetoCargar.Mostrar_Arrays(Matriz, min, max, filas, columnas);
        System.out.println("///////////////////////////////////");
        System.out.println("");
        objetoCargar.CargarVector(Vector, min, max, filas);
        objetoCargar.Mostrar_Array(Vector, min, max, filas);
    }

}
