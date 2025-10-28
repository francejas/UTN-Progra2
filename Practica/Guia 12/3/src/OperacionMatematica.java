public class OperacionMatematica<T extends Number> {

    private T numero1;
    private T numero2;

    public OperacionMatematica() {
    }

    public void setNumeros(T num1, T num2) {
        this.numero1 = num1;
        this.numero2 = num2;
    }

    public double sumar() {

        return numero1.doubleValue() + numero2.doubleValue();
    }

    public double restar() {
        return numero1.doubleValue() - numero2.doubleValue();
    }

    public double multiplicar() {
        return numero1.doubleValue() * numero2.doubleValue();
    }


    public double dividir() throws ArithmeticException {
        double divisor = numero2.doubleValue();
        if (divisor == 0.0) {
            throw new ArithmeticException("División por cero no permitida.");
        }

        return numero1.doubleValue() / divisor;
    }
}