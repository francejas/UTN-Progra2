public class Autobus implements Transporte {
    private int numeroLinea;
    private int capacidad;
    private TipoTransporte tipo;

    public Autobus(int numeroLinea, int capacidad) {
        this.numeroLinea = numeroLinea;
        this.capacidad = capacidad;
        this.tipo = TipoTransporte.AUTOBUS;;
    }

    public int getNumeroLinea() {
        return numeroLinea;
    }

    public void setNumeroLinea(int numeroLinea) {
        this.numeroLinea = numeroLinea;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public TipoTransporte getTipo() {
        return tipo;
    }

    @Override
    public void arrancar() {
        System.out.println("El autobús de la línea " + numeroLinea + " ha arrancado.");
    }

    @Override
    public void detener() {
        System.out.println("El autobús de la línea " + numeroLinea + " se ha detenido.");
    }

    @Override
    public int obtenerCapacidad() {
        return capacidad;
    }

    public void anunciarParada(String parada) {
        System.out.println("Próxima parada: " + parada);
    }

    @Override
    public String toString() {
        return "Autobús [Línea: " + numeroLinea + ", Capacidad: " + capacidad +
                ", Tipo: " + tipo + "]";
    }


}
