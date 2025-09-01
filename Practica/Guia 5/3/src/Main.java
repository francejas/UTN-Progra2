
public class Main {
    public static void main(String[] args) {
        Cilindro cilindro1=new Cilindro();
        System.out.println(cilindro1);

        Cilindro cilindro2 = new Cilindro(3,3);
        System.out.println(cilindro2);
        System.out.println("Área: " +cilindro2.area());
        System.out.println("Volumen: " + cilindro2.volumen());
    }
}