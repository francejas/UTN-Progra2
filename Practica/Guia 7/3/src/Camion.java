public class Camion extends Vehiculos implements VehiculoDeCarga{
    private double carga;

    public Camion(String marca, String modelo, double velocidadMax, double carga) {
        super(marca, modelo, velocidadMax);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double max) {
        if (max < PESO_MIN || max > PESO_MAX) {
            System.out.println(" Número de peso inválido: " + max +
                    ". Debe estar entre " + PESO_MIN + " y " + PESO_MAX + ".");
            this.carga = PESO_MIN; // valor por defecto
        } else {
            this.carga = max;
        }
    }


    @Override
    public void carga() {
        System.out.println("El camion carga "+ carga +" kg");
    }

    @Override
    public void descarga() {
        System.out.println("El camion descarga "+ carga+" kg");
    }

    @Override
    public String toString() {
        return "Camion: " + super.toString() + " | Carga: " + carga;
    }
}
