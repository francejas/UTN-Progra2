import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;

        System.out.println("Programa para calcular la división de dos números enteros (sin excepciones).");

        // --- Solicitar el Primer Número (Validando que sea entero) ---
        boolean esEnteroValido = false;
        while (!esEnteroValido) {
            System.out.print("Introduce el primer número (Dividendo): ");

            if (scanner.hasNextInt()) { // Verifica si el siguiente token es un entero
                numero1 = scanner.nextInt();
                esEnteroValido = true;
            } else {
                System.out.println("❌ Error: Por favor, introduce un número entero válido.");
                scanner.next(); // Consume la entrada no válida para evitar bucle infinito
            }
        }

        // --- Solicitar el Segundo Número (Validando que sea entero y distinto de cero) ---
        esEnteroValido = false; // Reiniciar la bandera
        while (!esEnteroValido || numero2 == 0) {
            System.out.print("Introduce el segundo número (Divisor, debe ser distinto de cero): ");

            if (scanner.hasNextInt()) { // Verifica si es un entero
                numero2 = scanner.nextInt();

                if (numero2 == 0) {
                    System.out.println("❌ Error: El divisor no puede ser cero. Inténtalo de nuevo.");
                } else {
                    esEnteroValido = true; // El número es entero y distinto de cero
                }
            } else {
                System.out.println("❌ Error: Por favor, introduce un número entero válido.");
                scanner.next(); // Consume la entrada no válida
            }
        }

        // Cierre del Scanner
        scanner.close();

        // --- Calcular y Mostrar el Resultado ---

        // Usar casting para obtener un resultado decimal
        double resultado = (double) numero1 / numero2;

        System.out.println("\n--- Resultado ---");
        System.out.println("Dividendo: " + numero1);
        System.out.println("Divisor: " + numero2);
        System.out.printf("El resultado de la división es: %.2f%n", resultado);
    }
}