public class Main {
    public static void main(String[] args) {
        Pato pato1 = new Pato("Donald");
        Murcielago murcielago1 = new Murcielago("Bruce");
        Pez pez1 = new Pez("Nemo");

        System.out.println(pato1.getNombre() + " es un " + pato1.getTipo());
        pato1.comunicarse();


        System.out.println(murcielago1.getNombre() + " es un " + murcielago1.getTipo());
        murcielago1.comunicarse();

        System.out.println(pez1.getNombre() + " es un " + pez1.getTipo());
        pez1.comunicarse();

        System.out.println("\n--- Habilidades especiales ---");
        pato1.volar();
        pato1.caminar();
        pato1.nadar();

        murcielago1.volar();
        murcielago1.colgarse();

        pez1.nadar();


    }
}