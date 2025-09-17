public class Yate implements Preciable{
    private String matricula;
    private String nombre;
    private int capacidadPasajeros;
    private int potenciaMotor;
    private String duenio;
    private double precio; // precio de instancia

    // Precio fijo para inicializar cada objeto
    private static final double PRECIO_FINAL = 100;

    public Yate(String matricula, String nombre, int capacidadPasajeros, int potenciaMotor, String duenio) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.capacidadPasajeros = capacidadPasajeros;
        this.potenciaMotor = potenciaMotor;
        this.duenio = duenio;
        this.precio = PRECIO_FINAL;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Yate{" +
                "matricula='" + matricula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", capacidadPasajeros=" + capacidadPasajeros +
                ", potenciaMotor=" + potenciaMotor +
                ", duenio='" + duenio + '\'' +
                '}';
    }
}
