public class Bicicleta extends Vehiculos implements VehiculoDePasajeros {
    private int pasajeros;


    public Bicicleta(String marca, String modelo, double velocidadMax) {
        super(marca, modelo, velocidadMax);
        this.pasajeros = 1;
    }

    public int getPasajeros() {
        return pasajeros;
    }



    @Override
    public void subenPasajeros() {
        System.out.println(pasajeros + " persona se sube a la Bicicleta");
    }

    @Override
    public void bajanPasajeros() {
        System.out.println(pasajeros + " persona se baja de la Bicicleta");
    }

    @Override
    public String toString() {
        return "Bicicleta: " + super.toString() + " | Pasajeros : " + pasajeros;
    }


}
