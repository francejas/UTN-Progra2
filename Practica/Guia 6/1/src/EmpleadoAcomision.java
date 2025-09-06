public class EmpleadoAcomision extends Empleado {
    private int clientesCaptados;
    private double comisionPorCliente;
    private static  final double MINIMO=800000;


    public EmpleadoAcomision(String nombre, int clientesCaptados, double comisionPorCliente) {
        super(nombre);
        this.clientesCaptados = clientesCaptados;
        this.comisionPorCliente = comisionPorCliente;
    }

    public int getClientesCaptados() {
        return clientesCaptados;
    }

    public void setClientesCaptados(int clientesCaptados) {
        this.clientesCaptados = clientesCaptados;
    }

    public double getComisionPorCliente() {
        return comisionPorCliente;
    }

    public void setComisionPorCliente(double comisionPorCliente) {
        this.comisionPorCliente = comisionPorCliente;
    }

    public double getMINIMO() {
        return MINIMO;
    }

    @Override
    public double calcularPago() {
        double salarioFinal = clientesCaptados * comisionPorCliente;
        if (salarioFinal < MINIMO) {
            return MINIMO;
        } else {
            return salarioFinal;
        }
    }

}
