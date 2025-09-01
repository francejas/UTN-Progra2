public class Cilindro extends Circulo {
    private double altura;

    // 1. Constructor vacío: radio=1.0, color="rojo", altura=1.0
    public Cilindro() {
        super();        // llama a Circulo() -> radio=1.0, color="rojo"
        this.altura = 1.0;
    }

    // 2. Constructor con solo altura
    public Cilindro(double altura) {
        super();        // radio=1.0, color="rojo"
        this.altura = altura;
    }

    // 3. Constructor con solo radio
    public Cilindro(double radio, boolean dummy) { // "dummy" diferencia la firma
        super(radio);   // color="rojo"
        this.altura = 1.0;
    }

    // 4. Constructor con solo color
    public Cilindro(String color) {
        super(color);   // radio=1.0
        this.altura = 1.0;
    }

    // 5. Constructor con radio y altura
    public Cilindro(double radio, double altura) {
        super(radio);   // color="rojo"
        this.altura = altura;
    }

    // 6. Constructor con color y altura
    public Cilindro(String color, double altura) {
        super(color);   // radio=1.0
        this.altura = altura;
    }

    // 7. Constructor con radio y color (altura por defecto)
    public Cilindro(double radio, String color) {
        super(radio, color);
        this.altura = 1.0;
    }

    // 8. Constructor con radio, color y altura
    public Cilindro(double radio, String color, double altura) {
        super(radio, color);
        this.altura = altura;
    }

    // Getter y Setter
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Sobrescribir área -> área total del cilindro
    @Override
    public double area() {
        return 2 * Math.PI * getRadio() * altura + 2 * super.area();
    }

    // Volumen -> usando el área de la base de la superclase
    public double volumen() {
        return super.area() * altura;
    }

    @Override
    public String toString() {
        return "Cilindro: subclase de " + super.toString() +
                ", Altura=" + altura +
                ", Área=" + area() +
                ", Volumen=" + volumen() + ".";
    }

}
