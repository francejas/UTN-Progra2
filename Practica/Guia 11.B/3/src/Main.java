import java.lang.reflect.Array;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Definir el array de ejemplo
        String[] elementos = {"Manzana", "Naranja", "Pera", "Uva", "Melón"};
        int indice = -1;
        boolean entradaValida = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Acceso a Elementos de Array ---");
        System.out.println("El array tiene " + elementos.length + " elementos (índices válidos: 0 a " + (elementos.length - 1) + ").");

        // Bucle para asegurar que el usuario ingrese un número entero
        while (!entradaValida) {
            try {
                System.out.print("Ingrese un índice (número entero) para ver el elemento: ");
                indice = scanner.nextInt();
                entradaValida = true; // Si llegamos aquí, se leyó un entero

            } catch (InputMismatchException e) {
                System.err.println("❌ ERROR: Por favor, ingrese solo números enteros.");
                scanner.nextLine(); // Limpiar el búfer del Scanner
            }
        }

        // 2. Intentar acceder al array dentro de un bloque try/catch
        try {
            // Esta línea lanza la ArrayIndexOutOfBoundsException si 'indice' es inválido
            String elemento = elementos[indice];

            System.out.println("\n✅ Elemento encontrado en el índice " + indice + ": " + elemento);

        } catch (ArrayIndexOutOfBoundsException e) {
            // 3. Capturar la excepción lanzada automáticamente por Java
            System.err.println("\n❌ ERROR DE EJECUCIÓN: Índice fuera de límites.");
            System.err.println("El índice " + indice + " está fuera del rango permitido (0 a " + (elementos.length - 1) + ").");
            System.err.println("Detalles de la excepción: " + e.getMessage());

        } finally {
            scanner.close();
        }
    }
}