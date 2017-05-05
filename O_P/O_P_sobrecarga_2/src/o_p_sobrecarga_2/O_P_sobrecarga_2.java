package o_p_sobrecarga_2;

import java.util.Scanner;

/**
 *
 * @author manuel
 */
public class O_P_sobrecarga_2 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        System.out.println("Ingrese  cantidad de filas");
        int f = tec.nextInt();
        System.out.println("Ingrese cantidad de columnas");
        int c = tec.nextInt();
        int A[][] = new int[f][c];
        int n;
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                n = tec.nextInt();
                A[i][j] = n; 
            }
        }
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf(A[i][j] + "\t");
            }
            System.out.println("");
            System.out.println("");
            System.out.println("");
        }

    }

}
