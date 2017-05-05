package o_p_sobrecarga_3;

import java.util.Scanner;
import ordenamiento.*;

/**
 *
 * @author manuel
 */
public class O_P_sobrecarga_3 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        BurbujaMejorada bm = new BurbujaMejorada();
        int op;
        do {
            
            System.out.println("MENU");
            System.out.println("1. Vector\n"
                    + "2. Matriz \n"
                    + "3. salir");
            System.out.println("Que operacion desea: ");
            op = tec.nextInt();

            switch (op) {

                case 1:
                    System.out.println("Vector");
                    System.out.println("");
                    System.out.println("ingrese tamaño del Vector");
                    int tamV = tec.nextInt();
                    int V[] = new int[tamV];
                    for (int i = 0; i < tamV; i++) {
                        V[i] = (int) (Math.random() * 99 + 1);
                    }
                    for (int i = 0; i < tamV; i++) {
                        System.out.printf(V[i] + "\t");
                    }
                    System.out.println("");
                    bm.bMejoradaV(V, tamV);
                    System.out.println("ordenado");
                    bm.mostrarV(V, tamV);

                    break;
                case 2:
                    System.out.println("Matriz");
                    System.out.println("");
                    System.out.println("ingrese numero de filas");
                    int f = tec.nextInt();
                    System.out.println("ingrese numero de colunnas");
                    int c = tec.nextInt();
                    int M[][] = new int[f][c];
                    for (int i = 0; i < f; i++) {
                        for (int j = 0; j < c; j++) {
                            M[i][j] = (int) (Math.random() * 99 + 1);
                        }
                    }
                    for (int i = 0; i < f; i++) {
                        for (int j = 0; j < c; j++) {
                            System.out.printf(M[i][j] + "\t");
                        }
                        System.out.println("");
                    }
                    bm.bMejoradaM(M, f, c);
                    System.out.println("ordenado");
                    bm.mostrarM(M, f, c);
                    break;
            }

        } while (op != 3);
    }
}
