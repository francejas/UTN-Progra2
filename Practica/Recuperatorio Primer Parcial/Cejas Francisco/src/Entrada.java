import java.util.Random;

public abstract class Entrada implements iPromocionable {
    private static int contadorID=0;
    private int id;
    private double precio;
    private int butaca;
    private String pelicula;

    //agregar constructor vacio

    public Entrada(double precio, int butaca, String pelicula) {
        this.id = contadorID++;
        this.precio = precio;
        this.butaca = butaca;
        this.pelicula = pelicula;
    }

    public static int getContadorID() {
        return contadorID;
    }


    public int getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getButaca() {
        return butaca;
    }

    public void setButaca(int butaca) {
        this.butaca = butaca;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public abstract String generarTicket();

    @Override
    public double aplicarDescuento(int porcentajeDescuento) {
        double precioFinal = getPrecio()-(porcentajeDescuento*getPrecio()/100);
        return precioFinal;
    }

    @Override
    public int obtenerCodigoPromo() {
        Random rand= new Random();
        int promo = rand.nextInt(101);
        return promo;
    }

    @Override
    public String toString() {
        return "Entrada{" +
                "id=" + id +
                ", precio=" + precio +
                ", butaca=" + butaca +
                ", pelicula='" + pelicula + '\'' +
                '}';
    }
}
