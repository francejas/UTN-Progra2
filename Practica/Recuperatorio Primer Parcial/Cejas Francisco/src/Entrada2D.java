public class Entrada2D extends Entrada{
    private int sala;


    //agregar constructor vacio

    public Entrada2D(double precio, int butaca, String pelicula, int sala) {
        super(precio, butaca, pelicula);
        this.sala = sala;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    @Override
    public String generarTicket() {
        return "Pelicula: "+getPelicula()+" valido solo para 2D.";
    }

    @Override
    public String toString() {
        return "Entrada2D{" +
                "sala=" + sala +
                "} " + super.toString();
    }
}
