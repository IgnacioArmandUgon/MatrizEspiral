package EjMatrizEspiral.src.co.com.sofkau.tl;

import java.util.Scanner;

public class MatrizEspiral {
    // TODO: 2/02/2022 método para recorrer fila izq-der
    // TODO: 2/02/2022 método para recorrer fila der-izq
    // TODO: 2/02/2022 método para recorrer columna desc
    // TODO: 2/02/2022 método para recorrer columna asc
    // TODO: 2/02/2022 método para solicitar tamaño de matriz a llenar <-- Nuestra tarea
    // TODO: 2/02/2022 método para imprimir la matriz
    // TODO: 2/02/2022 método para integrar todas las funciona  lidades anteriores por medio de un menú que se comunique con el usuario

    public static void main(String[] args) {
        int matriz[][] = solicitarTamaño();
    }

    /**
     * Crea una matriz con los parametros dados
     * @param x
     * @param y
     * @return
     */
    public static int[][] crearMatriz(int x, int y) {
        int matriz[][] = new int[x][y];
        return matriz;
    }

    /**
     * Solicita por consola las medida de la matriz y la crea usando el metodo crearMatriz
     * @return
     */
    public static int[][] solicitarTamaño() {
        Scanner teclado = new Scanner(System.in);
        int x = 0;
        do {
            System.out.println("Ingrese valor x, maximo 50");
            x = teclado.nextInt();
        } while (x > 50 && x > 1);

        int y = 0;
        do {
            System.out.println("Ingrese valor y, maximo 50");
            y = teclado.nextInt();
        } while (y > 50 && x > 1);

        int matriz[][] =crearMatriz(x, y);

        System.out.println("Se creo exitosamente una matriz de "+x+" por "+y+".");

        return matriz;
    }

}
