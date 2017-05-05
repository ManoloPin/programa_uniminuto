package ordenamiento;

/**
 *
 * @author manuel
 */
public class BurbujaMejorada {

    public void bMejoradaV(int V[], int tam) {
        int aux;
        for (int i = 1; i < tam; i++) {
            for (int j = 0; j < i; j++) {
                if (V[i] < V[j]) {
                    aux = V[j];
                    V[j] = V[i];
                    V[i] = aux;
                }
            }
        }
    }

    public void bMejoradaM(int M[][], int f, int c) {
        int aux;
        for (int i = 1; i < f; i++) {
            for (int j = 0; j < c; j++) {
                for (int k = 0; k < f; k++) {
                    for (int l = 0; l < c; l++) {
                        if (M[i][j] < M[k][l]) {
                            aux = M[i][j];
                            M[i][j] = M[k][l];
                            M[k][l] = aux;
                        }
                    }
                }
            }
        }
    }

    public void mostrarM(int[][] M, int f, int c) {
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf(M[i][j] + "\t");
            }
            System.out.println("");
        }

    }

    public void mostrarV(int V[], int tam) {
        for (int i = 0; i < tam; i++) {
            System.out.printf(V[i] + "\t");
        }
        System.out.println("");
    }
}
