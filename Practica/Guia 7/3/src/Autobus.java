public class Autobus extends Vehiculos implements VehiculoDePasajeros {
    private int pasajeros;

    public Autobus(String marca, String modelo, double velocidadMax, int pasajeros) {
        super(marca, modelo, velocidadMax);
        this.pasajeros = pasajeros;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int max) {
        if (max < PASAJEROS_MIN || max > PASAJEROS_MAX) {
            System.out.println(" Número de pasajeros inválido: " + max +
                    ". Debe estar entre " + PASAJEROS_MIN + " y " + PASAJEROS_MAX + ".");
            this.pasajeros = PASAJEROS_MIN; // valor por defecto
        } else {
            this.pasajeros = max;
        }
    }

    @Override
    public void subenPasajeros() {
        System.out.println("Se suben al colectivo");
    }

    @Override
    public void bajanPasajeros() {
        System.out.println("Se bajan del colectivo");
    }

    @Override
    public String toString() {
        return "Colectivo: " + super.toString() + " | Pasajeros: " + pasajeros;
    }


}


