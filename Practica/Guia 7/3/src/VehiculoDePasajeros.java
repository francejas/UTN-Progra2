public interface VehiculoDePasajeros extends Vehiculo {
    int PASAJEROS_MAX=30;
    int PASAJEROS_MIN = 1;

    void subenPasajeros();
    void bajanPasajeros();


}