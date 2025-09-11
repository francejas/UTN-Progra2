public class Tranvia implements Transporte {
    private String ruta;
    private int capacidad;
    private TipoTransporte tipo;

    public Tranvia(String ruta, int capacidad) {
        this.ruta = ruta;
        this.capacidad = capacidad;
        this.tipo = TipoTransporte.TRANVIA;
    }

    public String getRuta() { return ruta; }
    public void setRuta(String ruta) { this.ruta = ruta; }

    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }

    public TipoTransporte getTipo() { return tipo; }

    @Override
    public void arrancar() {
        System.out.println("El tranvía en la ruta " + ruta + " ha arrancado.");
    }

    @Override
    public void detener() {
        System.out.println("El tranvía en la ruta " + ruta + " se ha detenido.");
    }

    @Override
    public int obtenerCapacidad() {
        return capacidad;
    }

    public void cambiarVia(int nuevaVia) {
        System.out.println("El tranvía ha cambiado a la vía " + nuevaVia + ".");
    }

    @Override
    public String toString() {
        return "Tranvía [Ruta: " + ruta + ", Capacidad: " + capacidad +
                ", Tipo: " + tipo + "]";
    }

}

