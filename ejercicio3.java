public class ejercicio3 {
    public static void main(String[] args) {
        // Crear matriz 3x3 llena de ceros
        int[][] matriz = new int[3][3];

        // Asignar manualmente valores distintos de cero en posiciones aleatorias
        matriz[0][2] = 7;
        matriz[1][1] = 5;
        matriz[2][0] = 9;

        System.out.println("Matriz original:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nRepresentación poco densa (solo valores distintos de cero):");
        // Recorrer la matriz e imprimir solo los elementos distintos de cero
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (matriz[fila][columna] != 0) {
                    System.out.println("Fila " + fila + " + Columna " + columna + " = " + matriz[fila][columna]);
                }
            }
        }
    }
}