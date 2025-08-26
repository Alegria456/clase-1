import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Pedir la cantidad de alumnos
        System.out.print("Ingrese la cantidad de alumnos: ");
        int n = scanner.nextInt();

        // 2. Crear arreglo unidimensional
        int[] notas = new int[n];

        // 3. Llenar el arreglo con las notas
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la nota del alumno " + (i + 1) + ": ");
            notas[i] = scanner.nextInt();
            // Validar que esté entre 0 y 100
            while (notas[i] < 0 || notas[i] > 100) {
                System.out.print("Nota inválida. Ingrese nuevamente (0-100): ");
                notas[i] = scanner.nextInt();
            }
        }

        // 4. Calcular el promedio
        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        double promedio = (double) suma / n;

        // 5. Contar aprobados y reprobados
        int aprobados = 0, reprobados = 0;
        for (int nota : notas) {
            if (nota >= 70) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        // 6. Mostrar resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("Promedio de la clase: " + promedio);
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de reprobados: " + reprobados);

        // 7. Mensaje personalizado
        if (promedio >= 90) {
            System.out.println("¡Excelente clase!");
        } else if (promedio >= 70) {
            System.out.println("Buen rendimiento.");
        } else {
            System.out.println("Necesitamos mejorar.");
        }

        scanner.close();
    }
}