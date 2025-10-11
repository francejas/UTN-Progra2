import java.util.Random;

public abstract class Jugador implements iCompetible {
    private static int contadorID=0;
    private String nombre;
    private int nivel;
    private int ID;
    private Liga liga;

    public Jugador(String nombre, Liga liga) {
        this.nombre = nombre;
        this.nivel = 0;
        this.ID = contadorID++;
        this.liga = liga;
    }

    public static int getContadorID() {
        return contadorID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getID() {
        return ID;
    }

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    public abstract void entrenar();

    @Override
    public String competir() {
        return "El " + getClass().getSimpleName() + getNombre() + " esta compitiendo.";

    }

    @Override
    public int obtenerPuntaje() {
        Random rand = new Random();
        return rand.nextInt(101);
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", ID=" + ID +
                ", liga=" + liga +
                '}';
    }
}
