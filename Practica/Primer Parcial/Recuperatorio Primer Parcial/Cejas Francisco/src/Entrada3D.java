public class Entrada3D extends Entrada{
    private String sala;

    private static String SALA_DEFAULT="salaPremium";

    //constructor vacio

    public Entrada3D(double precio, int butaca, String pelicula) {
        super(precio, butaca, pelicula);
        this.sala = SALA_DEFAULT;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public static String getSalaDefault() {
        return SALA_DEFAULT;
    }

    public static void setSalaDefault(String salaDefault) {
        SALA_DEFAULT = salaDefault;
    }

    @Override
    public String generarTicket() {
        return "Pelicula: "+getPelicula()+". Inluye 3D inmersivo.";
    }

    @Override
    public String toString() {
        return "Entrada3D{" +
                "sala='" + sala + '\'' +
                "} " + super.toString();
    }
}
