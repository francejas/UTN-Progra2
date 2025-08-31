public class Circulo {
    private double radio;
    private String color;

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

    // 3. Constructor solo radio
    public Circulo(double radio) {
        this.radio = radio;
        this.color = "rojo"; // valor por defecto
    }

    // 4. Constructor solo color
    public Circulo(String color) {
        this.radio = 1.0;    // valor por defecto
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double areaCirculo(){
        return Math.PI*(Math.pow(radio,2));
    }

    @Override
    public String toString(){
        return "Circulo: [Radio=" + radio +
                ", color=" + color +
                ", area=" + areaCirculo() + " ].";
    }









}
