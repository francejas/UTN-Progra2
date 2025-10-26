import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        boolean valido = false;

        System.out.println("--- Cálculo de Factorial Recursivo ---");

        while (!valido) {
            try {
                System.out.print("Ingrese un número entero no negativo: ");
                numero = scanner.nextInt();

                // La llamada a la función factorial está dentro del try
                int factorialResultado = factorial(numero);

                valido = true;

                System.out.println("\n✅ El Factorial de " + numero + " es: " + factorialResultado);

            } catch (InputMismatchException e) {
                // Captura si el usuario ingresa texto en lugar de un entero.
                System.err.println("❌ ERROR de Formato: Ingrese un valor numérico entero válido.");
                scanner.nextLine(); // Limpiar el buffer para permitir una nueva entrada

            } catch (IllegalArgumentException e) {
                // Captura si la función factorial lanza el error por número negativo.
                System.err.println("❌ ERROR de Argumento: " + e.getMessage());
            }
        }
        scanner.close();
    }

    public static int factorial(int n) {

        if (n < 0) {

            throw new IllegalArgumentException("El factorial solo se puede calcular para números enteros no negativos.");
        }

        // Caso Base: El factorial de 0 es 1
        if (n == 0) {
            return 1;
        } else {
            // Caso recursivo: n * factorial(n - 1)
            return n * factorial(n - 1);
        }
    }


}