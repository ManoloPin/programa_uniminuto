package array_a;

import java.util.Random;

/**
 *
 * @author Administrador
 */
public class Cargar_Array {

    public Cargar_Array() {
    }

    ;    
    public void CargarArrays(int mat[][], int minRandom, int maxrandom, int fila, int columna) {
        for (int fil = 0; fil < fila; fil++) {
            for (int col = 0; col < columna; col++) {
                mat[fil][col] = minRandom - ((int) Math.round((Math.random()) * (minRandom - maxrandom)));
            }
        }
    }

    public void CargarVector(int vec[], int minRandom, int maxrandom, int fila) {
        for (int fil = 0; fil < fila; fil++) {
            vec[fil] = minRandom - ((int) Math.round((Math.random()) * (minRandom - maxrandom)));
        }
    }

    public void Mostrar_Arrays(int mat[][], int minRandom, int maxrandom, int fila, int columna) {
        for (int fil = 0; fil < fila; fil++) {

            for (int col = 0; col < columna; col++) {
                System.out.printf(mat[fil][col] + "\t");
            }
            System.out.println("");
            System.out.println("");
        }
    }

    public void Mostrar_Array(int vec[], int minRandom, int maxrandom, int fila) {
        for (int fil = 0; fil < fila; fil++) {

            System.out.printf(vec[fil] + "\t");
        }
    }

}
