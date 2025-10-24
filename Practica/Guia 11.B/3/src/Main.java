import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] elementos = {"Manzana", "Naranja", "Pera", "Uva", "Melón"};

        // Flag para controlar el bucle
        boolean indiceValido = false;

        System.out.println("--- Acceso a Elementos de Array (Recuperación de Errores) ---");
        System.out.println("El array tiene " + elementos.length + " elementos (índices válidos: 0 a " + (elementos.length - 1) + ").");

        // El bucle se ejecuta HASTA que se obtenga un índice válido
        while (!indiceValido) {

            try {
                System.out.print("\nIngrese un índice (número entero): ");
                int indice = scanner.nextInt();

                // 1. Intento de acceso: Lanza ArrayIndexOutOfBoundsException si es inválido
                String elemento = elementos[indice];

                // Si la línea anterior NO lanza excepción, el acceso fue exitoso
                System.out.println("\n✅ Elemento encontrado en el índice " + indice + ": " + elemento);

                // Marcamos la bandera como true para salir del bucle
                indiceValido = true;

            } catch (InputMismatchException e) {
                // 2. Manejo de error si el usuario NO introduce un entero (texto)
                System.err.println("❌ ERROR DE ENTRADA: Debe ingresar un número entero.");
                scanner.nextLine(); // Limpiar el buffer del Scanner para continuar el bucle
                // indiceValido sigue siendo false, el bucle se repite

            } catch (ArrayIndexOutOfBoundsException e) {
                // 3. Manejo de error si el índice está fuera de los límites
                System.err.println("❌ ERROR: El índice introducido está fuera de los límites del array.");
                // indiceValido sigue siendo false, el bucle se repite
            }
        }

        // 4. Se cierra el Scanner al salir del bucle
        scanner.close();
        System.out.println("\nPrograma finalizado.");
    }
}