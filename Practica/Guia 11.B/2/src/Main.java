import java.util.Scanner;

public class Main {

    public static boolean esTextoValido(String entrada) {
        if (entrada == null || entrada.trim().isEmpty()) {
            return false; // Una cadena vacía no es válida
        }

        try {
            // Intentamos convertir la cadena a un tipo numérico (Double es bueno
            // porque atrapa enteros y decimales)
            Double.parseDouble(entrada);

            // Si llegamos aquí, la conversión tuvo éxito. Es un número, no es texto "puro".
            return false;

        } catch (NumberFormatException e) {
            // Si la conversión falla, significa que la cadena contiene caracteres
            // no numéricos (letras, símbolos), por lo tanto, es texto válido.
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada;

        do {
            System.out.print("Ingrese texto (no números): ");
            entrada = scanner.nextLine();

            if (esTextoValido(entrada)) {
                System.out.println("✅ ¡Es texto! Longitud: " + entrada.length());
            } else {
                System.err.println("❌ Error: Ha ingresado un número o un valor vacío. Intente de nuevo.");
            }
        } while (!esTextoValido(entrada));

        scanner.close();
    }
}