public interface VehiculoDeCarga extends Vehiculo {
    double PESO_MAX=500;
    double PESO_MIN =0;

    void carga();
    void descarga();


}