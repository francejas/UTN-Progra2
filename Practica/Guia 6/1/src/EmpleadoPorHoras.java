public class EmpleadoPorHoras extends Empleado {
    private double horasTrabajadas;
    private double precio;

    public EmpleadoPorHoras(String nombre, double horasTrabajadas, double precio) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.precio = precio;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public double calcularPago() {
        return horasTrabajadas*precio;
    }
}
