import java.util.ArrayList;

public class Auto extends Vehiculo{
    private ArrayList<Prestaciones> prestaciones;
    private Cambios cambio;

    private static final double PRECIO_FIJO = 15;

    public Auto(String patente, String marca, String modelo, double consumo, int cantRuedas, ArrayList<Prestaciones> prestaciones, Cambios cambio) {
        super(patente, marca, modelo, consumo, cantRuedas, PRECIO_FIJO);
        this.prestaciones = prestaciones;
        this.cambio = cambio;
    }

    public ArrayList<Prestaciones> getPrestaciones() {
        return prestaciones;
    }

    public void setPrestaciones(ArrayList<Prestaciones> prestaciones) {
        this.prestaciones = prestaciones;
    }

    public Cambios getCambio() {
        return cambio;
    }

    public void setCambio(Cambios cambio) {
        this.cambio = cambio;
    }

    @Override
    public double calcularPrecio() {
        return PRECIO_FIJO;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "prestaciones=" + prestaciones +
                ", cambio=" + cambio +
                "} " + super.toString();
    }
}
