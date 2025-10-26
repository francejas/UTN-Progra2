import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean entradaValida = false;

        // Definir el formato esperado
        final DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("--- Calculadora de Edad (Formato DD/MM/AAAA) ---");

        while (!entradaValida) {
            try {
                System.out.print("Ingrese su fecha de nacimiento (dd/mm/aaaa): ");
                String fechaNacimientoStr = scanner.nextLine();

                // 1. Intentar convertir la cadena a un objeto LocalDate
                // Esta línea lanzará DateTimeParseException si:
                // a) El formato no es dd/mm/aaaa (ej: 2000-01-01)
                // b) La fecha es ilógica (ej: 31/02/2000 o 40/01/2000)
                LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr, FORMATO_FECHA);

                // 2. Cálculo de la edad
                LocalDate fechaActual = LocalDate.now();
                Period periodo = Period.between(fechaNacimiento, fechaActual);
                int edad = periodo.getYears();

                // 3. Validación de lógica de negocio adicional (aunque la API ya valida mucho)
                if (fechaNacimiento.isAfter(fechaActual)) {
                    throw new IllegalArgumentException("La fecha de nacimiento no puede ser posterior a la fecha actual.");
                }

                // Si todo es exitoso, marcamos como válido y salimos del bucle
                entradaValida = true;
                System.out.println("\n✅ Fecha de nacimiento: " + fechaNacimiento);
                System.out.println("Su edad es: " + edad + " años.");

            } catch (DateTimeParseException e) {
                // Captura la excepción cuando la fecha es inválida (ej. 31/02/2000)
                System.err.println("❌ ERROR: Formato de fecha inválido o fecha ilógica.");
                System.err.println("Por favor, asegúrese de usar el formato DD/MM/AAAA y que la fecha exista.");

            } catch (IllegalArgumentException e) {
                // Captura nuestra validación si la fecha es en el futuro
                System.err.println("❌ ERROR: " + e.getMessage());

            } catch (Exception e) {
                // Captura cualquier otro error inesperado
                System.err.println("❌ ERROR INESPERADO: " + e.getMessage());
            }
        }
        scanner.close();
    }
}