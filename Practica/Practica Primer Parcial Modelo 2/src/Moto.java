public class Moto extends Vehiculo{
    private int cilindrada;
    private boolean baulBajoAsiento;

    private static final double PRECIO_FIJO = 7;

    public Moto(String patente, String marca, String modelo, double consumo, int cantRuedas, int cilindrada, boolean baulBajoAsiento) {
        super(patente, marca, modelo, consumo, cantRuedas, PRECIO_FIJO);
        this.cilindrada = cilindrada;
        this.baulBajoAsiento = baulBajoAsiento;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public boolean isBaulBajoAsiento() {
        return baulBajoAsiento;
    }

    public void setBaulBajoAsiento(boolean baulBajoAsiento) {
        this.baulBajoAsiento = baulBajoAsiento;
    }

    @Override
    public double calcularPrecio() {
        return PRECIO_FIJO;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cilindrada=" + cilindrada +
                ", baulBajoAsiento=" + baulBajoAsiento +
                "} " + super.toString();
    }
}
