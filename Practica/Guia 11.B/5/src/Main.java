public class Main {
    public static void main(String[] args) {
        // Crear una cuenta con un saldo inicial de 500.00
        Cuenta miCuenta = new Cuenta(500.00, 123456);

        System.out.println("--- Prueba de Cuenta Bancaria ---");
        System.out.printf("Cuenta Nro %d | Saldo Inicial: %.2f\n\n", miCuenta.getNumeroCuenta(), miCuenta.getSaldo());

        // --- Caso 1: Retiro Exitoso ---
        try {
            System.out.println("Intento 1: Retirar 200.00");
            miCuenta.retirarDinero(200.00);

        } catch (SaldoInsuficienteException e) {
            System.err.println("❌ ERROR: " + e.getMessage());
        }

        // --- Caso 2: Retiro que Lanza Excepción ---
        try {
            System.out.println("\nIntento 2: Retirar 400.00");
            // El saldo actual es 300.00. 400.00 > 300.00, se lanza la excepción.
            miCuenta.retirarDinero(400.00);

        } catch (SaldoInsuficienteException e) {
            System.err.println("❌ ERROR: Saldo Insuficiente.");
            // Imprimimos los detalles de la excepción que lanzamos
            System.err.println("Detalles: " + e.getMessage());
        }

        System.out.printf("\nSaldo Final en la cuenta: %.2f\n", miCuenta.getSaldo());
    }
}