package o_p_sobrecarga_5;

import java.util.Scanner;

/**
 *
 * @author manuel
 */
public class O_P_sobrecarga_5 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("ingrese tamaño");
        int tam = tec.nextInt();
        int A[] = new int[tam];
        for (int i = 0; i < tam; i++) {
            A[i] = i;
        }
        for (int i = 0; i < tam; i++) {
            System.out.printf(A[i] + "\t");
        }
        System.out.println("");
// invertir 
        int aux;
        int n = tam;
        for (int i = 0; i < n / 2; i++) {
            aux = A[i];
            A[i] = A[n - 1];
            A[n - 1] = aux;
            n--;
        }
        System.out.println("invertido");
        for (int i = 0; i < tam; i++) {
            System.out.printf(A[i] + "\t");
        }
        System.out.println("");

// cast implisito 
        double B[] = new double[tam];
        for (int i = 0; i < tam; i++) {
            B[i] = A[i];
        }
        System.out.println("cast implicito (double)");
        for (int i = 0; i < tam; i++) {
            System.out.printf(B[i] + "\t");
        }
        System.out.println("");
// cast explicito
        float C[] = new float[tam];
        for (int i = 0; i < tam; i++) {
            C[i] = (float) B[i];
        }
        System.out.println("cst explicito (float)");
        for (int i = 0; i < tam; i++) {
            System.out.printf(C[i] + "\t");
        }
    }

}
