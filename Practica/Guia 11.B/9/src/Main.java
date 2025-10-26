import java.util.Scanner;

public class Main {
    public static void validarContrasenia(String password) throws InvalidPasswordException {
        // StringBuilder para acumular los mensajes de error
        StringBuilder errores = new StringBuilder();

        boolean tieneMayuscula = false;
        boolean tieneNumero = false;
        final int LONGITUD_MINIMA = 8;

        // Criterio 1: Longitud mínima
        if (password.length() < LONGITUD_MINIMA) {
            errores.append("Debe tener al menos ").append(LONGITUD_MINIMA).append(" caracteres. ");
        }

        // Criterio 2 y 3: Contiene mayúsculas y números
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            }
            if (Character.isDigit(c)) {
                tieneNumero = true;
            }
        }

        if (!tieneMayuscula) {
            errores.append("Debe contener al menos una letra mayúscula. ");
        }
        if (!tieneNumero) {
            errores.append("Debe contener al menos un número. ");
        }

        // Lanza la excepción si se encontró algún error
        if (errores.length() > 0) {
            throw new InvalidPasswordException(errores.toString().trim());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contrasenia = "";
        boolean contraseniaValida = false;

        System.out.println("--- Validador de Contraseñas ---");
        System.out.println("Criterios: Mín. 8 caracteres, 1 mayúscula, 1 número.");

        while (!contraseniaValida) {
            try {
                System.out.print("\nIngrese su contrasenia: ");
                contrasenia = scanner.nextLine();

                // Intentamos validar la contrasenia. Lanza la excepción si falla.
                validarContrasenia(contrasenia);

                // Si la línea anterior no lanzó una excepción, la contrasenia es válida
                contraseniaValida = true;
                System.out.println("\n✅ Contraseña aceptada. ¡Bienvenido!");

            } catch (InvalidPasswordException e) {
                // Capturamos y manejamos la excepción personalizada.
                System.err.println("❌ ERROR: La contrasenia no cumple los requisitos.");
                // Mostramos el mensaje detallado de la excepción
                System.err.println("Requisitos faltantes: " + e.getMessage());

            } catch (Exception e) {
                // Captura cualquier otro error inesperado
                System.err.println("❌ ERROR INESPERADO: " + e.getMessage());
            }
        }

        scanner.close();
    }
}