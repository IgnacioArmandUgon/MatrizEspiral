package EjMatrizEspiral.src.co.com.sofkau.tl;


import java.util.Scanner;

public class MatrizEspiral {
    // TODO: 2/02/2022 método para recorrer fila izq-der
    // TODO: 2/02/2022 método para recorrer fila der-izq
    // TODO: 2/02/2022 método para recorrer columna desc
    // TODO: 2/02/2022 método para recorrer columna asc
    // TODO: 2/02/2022 método para solicitar tamaño de matriz a llenar <-- Nuestra tarea
    // TODO: 2/02/2022 método para imprimir la matriz
    // TODO: 2/02/2022 método para integrar todas las funcionalidades anteriores por medio de un menú que se comunique con el usuario

    public static void main(String[] args) {

    }

    public int[][] crearMatriz(int x, int y){
        int matriz[][] = new int[x][y];
        return matriz;
    }
    public int[][] solicitarTamaño(int x, int y){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese valor x");
        x = teclado.nextInt();
        System.out.println("Ingrese valor y");
        y = teclado.nextInt();
        return crearMatriz(x, y);
    }

}
