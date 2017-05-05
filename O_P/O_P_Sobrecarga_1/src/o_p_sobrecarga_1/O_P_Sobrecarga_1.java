
package o_p_sobrecarga_1;

import java.util.Scanner;

/**
 *
 * @author manuel
 */
public class O_P_Sobrecarga_1 {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner (System.in);
        System.out.println("Ingrese  cantidad de filas");
        int f = tec.nextInt();
        System.out.println("Ingrese cantidad de columnas");
        int c = tec.nextInt();
        int A[][] = new int [f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                A[i][j] = (int)(Math.random()*9+1);
            }
        }
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf(A[i][j]+"\t");
            }
            System.out.println("");
            System.out.println("");
            System.out.println("");
        }
    }
    
}
