public class SaldoInsuficienteException extends Exception {

    // Solo necesitamos el constructor que recibe el mensaje de error para este caso.
    public SaldoInsuficienteException(String message) {
        super(message);
    }

    // Opcional: Sobrescribir getMessage() para asegurar que la causa siempre se incluya.
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}