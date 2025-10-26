public class Cuenta {
    private double saldo;
    private int numeroCuenta;

    // Corrección: El saldo inicial debe ser double si el atributo es double
    public Cuenta(double saldoInicial, int numeroCuenta) {
        this.saldo = saldoInicial;
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    // Corrección: el setSaldo debe aceptar double
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    // Método para retirar dinero con validación
    public void retirarDinero(double dinero) throws SaldoInsuficienteException {
        // Validación de negocio
        if (dinero < 0) {
            throw new IllegalArgumentException("La cantidad a retirar no puede ser negativa.");
        }

        if (dinero > saldo) {
            // Se lanza la excepción personalizada si el saldo es insuficiente
            throw new SaldoInsuficienteException("El saldo actual es de " + saldo + " y se intentó retirar " + dinero + ".");
        } else {
            // Operación exitosa
            saldo -= dinero;
            System.out.printf("Retiro exitoso de %.2f. Nuevo saldo: %.2f\n", dinero, saldo);
        }
    }
}