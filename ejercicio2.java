import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Matriz predefinida
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Pedir número al usuario
        System.out.print("Ingrese un número a buscar en la matriz: ");
        int numeroBuscado = sc.nextInt();

        boolean encontrado = false;

        // Recorrer la matriz con dos bucles for anidados
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                // Comparar con el número buscado
                if (matriz[fila][columna] == numeroBuscado) {
                    System.out.println("Número encontrado en [" + fila + "][" + columna + "]");
                    encontrado = true;
                }
            }
        }

        // Si no se encontró el número
        if (!encontrado) {
            System.out.println("Número no encontrado");
        }

        sc.close();
    }
}