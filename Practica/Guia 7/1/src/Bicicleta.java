public class Bicicleta implements Transporte{
    private String numeroSerie;
    private TipoTransporte tipo;
    // private int alturaAsiento; ?????????



    public Bicicleta(String numeroSerie) {
        this.numeroSerie = numeroSerie;
        this.tipo = TipoTransporte.BICICLETA;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public TipoTransporte getTipo() {
        return tipo;
    }

    @Override
    public void arrancar() {
        System.out.println("La bicicleta con serie " + numeroSerie + " ha arrancado.");
    }

    @Override
    public void detener() {
        System.out.println("La bicicleta con serie " + numeroSerie + " se ha detenido.");
    }

    @Override
    public int obtenerCapacidad() {
        return 1;
    }

    public void ajustarAsiento(int altura) {
        System.out.println("Altura del asiento ajustada a " + altura + " cm.");
    }

    @Override
    public String toString() {
        return "Bicicleta [Número de serie: " + numeroSerie +
                ", Capacidad: " + obtenerCapacidad() +
                ", Tipo: " + tipo + " ]";
    }

}
