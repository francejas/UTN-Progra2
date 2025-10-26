import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        Scanner scanner = new Scanner(System.in);
        double radio = 0;
        boolean entradaValida = false;

        System.out.println("--- Calculadora de Área de Círculo ---");

        // 1. Bucle de entrada para asegurar que el valor sea un número
        while (!entradaValida) {
            try {
                System.out.print("Ingrese el radio del círculo: ");
                radio = scanner.nextDouble();
                entradaValida = true; // Si llegamos aquí, se leyó un double

            } catch (InputMismatchException e) {
                System.err.println("❌ ERROR: Ingrese un valor numérico válido (ej: 5 o 5.5).");
                scanner.nextLine(); // Limpiar el buffer
            }
        }

        // 2. Bloque principal para la validación de lógica de negocio
        try {
            // Validación de negocio: El radio no puede ser negativo
            if (radio < 0) {
                // Si la validación falla, lanzamos la excepción solicitada
                throw new IllegalArgumentException("El radio no puede ser un valor negativo (" + radio + ").");
            }

            // 3. Cálculo del área (Área = PI * radio^2)
            double area = Math.PI * Math.pow(radio, 2);

            System.out.println("\n✅ Cálculo Exitoso:");
            System.out.printf("Radio: %.2f\n", radio);
            System.out.printf("Área del círculo: %.4f\n", area);

        } catch (IllegalArgumentException e) {
            // 4. Capturamos y manejamos la excepción que nosotros lanzamos
            System.err.println("\n❌ ERROR DE LÓGICA DE NEGOCIO: " + e.getMessage());
            System.err.println("El programa no pudo calcular el área con un radio inválido.");

        } finally {
            scanner.close();
            System.out.println("\nFin del programa.");
        }

*/


        /// Otra forma todo dentro de un bucle


        Scanner scanner = new Scanner(System.in);
        double radio = 0;
        boolean entradaValida = false;

        System.out.println("--- Calculadora de Área de Círculo ---");

        // 1. Bucle de entrada para asegurar que el valor sea un número
        while (!entradaValida) {
            try {
                System.out.print("Ingrese el radio del círculo: ");
                radio = scanner.nextDouble();

                // Validación de negocio: El radio no puede ser negativo
                if (radio < 0) {
                    // Si la validación falla, lanzamos la excepción solicitada
                    throw new IllegalArgumentException("El radio no puede ser un valor negativo (" + radio + ").");
                }

                // 3. Cálculo del área (Área = PI * radio^2)
                double area = Math.PI * Math.pow(radio, 2);

                System.out.println("\n✅ Cálculo Exitoso:");
                System.out.printf("Radio: %.2f\n", radio);
                System.out.printf("Área del círculo: %.4f\n", area);


                entradaValida = true; // Si llegamos aquí, se leyó un double

            }
            catch (InputMismatchException e) {
                System.err.println("❌ ERROR: Ingrese un valor numérico válido (ej: 5 o 5.5).");
                scanner.nextLine(); // Limpiar el buffer
            }
           catch (IllegalArgumentException e){
               // 4. Capturamos y manejamos la excepción que nosotros lanzamos
               System.err.println("\n❌ ERROR DE LÓGICA DE NEGOCIO: " + e.getMessage());
               System.err.println("El programa no pudo calcular el área con un radio inválido.");
            }

        }
        if (scanner != null) {
            scanner.close();
        }
        System.out.println("\nFin del programa.");

    }
}