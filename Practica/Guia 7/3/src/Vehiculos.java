public abstract class Vehiculos {
    private String marca;
    private String modelo;
    private double velocidadMax;

    public Vehiculos(String marca, String modelo, double velocidadMax) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMax = velocidadMax;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public void arrancar() {
        System.out.println("El " +getClass()+ " arranca.");
    }

    public void detener() {
        System.out.println("El " +getClass()+ " se detiene.");
    }

    public void frena() {
        System.out.println("El " +getClass()+ " frena.");
    }



    @Override
    public String toString() {
        return marca + " " + modelo + " (Vel. máx: " + velocidadMax + " km/h)";
    }
}
