import java.util.Random;

public class Persona {

    private final static char SEXO_POR_DEFECTO = 'H';
    public final static int MAYORIA_EDAD = 18;

    public final static int BAJO_PESO = -1;
    public final static int PESO_IDEAL = 0;
    public final static int SOBREPESO = 1;

    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    // 1. CONSTRUCTOR POR DEFECTO
    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.generarDNI();
        this.sexo = SEXO_POR_DEFECTO;
        this.peso = 0.0;
        this.altura = 0.0;
    }

    // 2. CONSTRUCTOR CON NOMBRE, EDAD, SEXO
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.generarDNI();
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
    }

    // 3. CONSTRUCTOR CON TODOS LOS ATRIBUTOS
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.generarDNI();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularIMC() {
        double imc = this.peso / (this.altura * this.altura);

        if (imc < 20) {
            return BAJO_PESO;
        } else if (imc >= 20 && imc <= 25) {
            return PESO_IDEAL;
        } else {
            return SOBREPESO;
        }
    }

    public boolean esMayorDeEdada(){
        return edad>= MAYORIA_EDAD;
    }

    private void comprobarSexo(char sexo){
        char sexoUpper = Character.toUpperCase(sexo);
        if (sexoUpper == 'H' || sexoUpper == 'M') {
            this.sexo = sexoUpper;
        } else {
            this.sexo = SEXO_POR_DEFECTO;
        }
    }

    private void generarDNI(){

        int numeroDNI=generarNumeroDNI();

        char letraDNI=calcularLetraDNI(numeroDNI);

        this.DNI=String.valueOf(numeroDNI)+letraDNI;

    }


    private int generarNumeroDNI(){
        int max = 99999999;
        int min = 00000000;

        Random rand = new Random();

        int numero = rand.nextInt(max-min+1)+min;

        return numero;

    }

    private char calcularLetraDNI(int numeroDNI){
        final String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

        int indice = numeroDNI % 23;
        return letras.charAt(indice);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso + " kg" +
                ", altura=" + altura + " m" +
                '}';
    }


}
