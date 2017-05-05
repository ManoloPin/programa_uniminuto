package o_p_sobrecarga_6;

import java.util.Scanner;

/**
 *
 * @author manuel
 */
public class O_P_sobrecarga_6 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("ingrese tamaño");
        int tam = tec.nextInt();

        int A[][] = new int[tam][tam];

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                A[i][j] = (int) (Math.random() * 2 - 0);
            }
        }
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.printf(A[i][j] + "\t");
            }
            System.out.println("");
            System.out.println("");
        }
//pedir datos de pocicion 
        System.out.println("ingrese pocicion (X) y (Y)");
        int X = tec.nextInt();
        int Y = tec.nextInt();
        int contf = 0, contc = 0,contd = 0, contT = 0;
        int f[] = new int[10];
        int c[] = new int[10];
        for (int i = X; i < tam; i++) {
            for (int j = Y; j < tam; j++) {
                if (i == X) {
//                    A[i][j] = 5;
                    if (A[i][j] == 1) {
                        f[i] = i;
                        c[i] = j;
                        contf++;
                    }
                }
                if (j == Y) {
//                    A[i][j] = 5;
                    if (A[i][j] == 1) {
                        f[i] = i;
                        c[i] = j;
                        contc++;
                    }
                }
                if (i == j) {
//                    A[i][j] = 5;
                    if (A[i][j] == 1) {
                        f[i] = i;
                        c[i] = j;
                        contd++;
                    }
                }
                if (i+j == j ) {
                  A[i][j] = 5;
                    if (A[i][j] == 1) {
                        contT++;
                    }
                }
            }
        }
    for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.printf(A[i][j] + "\t");
            }
            System.out.println("");
            System.out.println("");
        }

    System.out.println ("cantidad de unos en la fila = " + contf);
    System.out.println ("cantidad de unos el la columna = " + contc);
    System.out.println ("cantidad de unos el la diagonal = " + contd);
    System.out.println ("cantidad de unos el la transversal = " + contT);
    
        for (int i = 0; i < f.length; i++) {
            System.out.printf("f: "+f[i]+"\t");
        }System.out.println("");
        for (int i = 0; i < c.length; i++) {
            System.out.printf("c: "+c[i]+"\t");
        }System.out.println("");
    }

}
