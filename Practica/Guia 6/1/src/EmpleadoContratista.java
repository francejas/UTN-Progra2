public class EmpleadoContratista extends Empleado {
    private double horasTrabajadas;
    private double tarifa;

    public EmpleadoContratista(String nombre, double horasTrabajadas, double tarifa) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifa = tarifa;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public double calcularPago() {
        return horasTrabajadas*tarifa;
    }
}
