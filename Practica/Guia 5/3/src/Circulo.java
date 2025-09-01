public class Circulo {

    // Atributos
    private double radio;
    private String color;

    // Constructores
    // 1. Constructor vacío
    public Circulo() {
        this.radio = 1.0;
        this.color = "rojo";
    }

    // 2. Constructor con radio y color
    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    // 3. Constructor solo con radio
    public Circulo(double radio) {
        this.radio = radio;
        this.color = "rojo"; // valor por defecto
    }

    // 4. Constructor solo con color
    public Circulo(String color) {
        this.radio = 1.0; // valor por defecto
        this.color = color;
    }

    // Getters y Setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Métodos
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public String toString() {
        return "Circulo: [Radio=" + radio +
                ", Color=" + color +
                ", Área=" + area() + "].";
    }
}
