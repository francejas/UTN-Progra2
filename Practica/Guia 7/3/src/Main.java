public class Main {
    public static void main(String[] args) {

        // Creamos los vehículos
        Auto auto = new Auto("Toyota", "Corolla", 180, 5);
        Autobus autobus = new Autobus("Mercedes", "Sprinter", 120, 30);
        Bicicleta bici = new Bicicleta("Trek", "FX3", 40);
        Camion camion = new Camion("Volvo", "FH16", 120, 20);

        // Probamos los autos
        System.out.println(auto);
        auto.arrancar();
        auto.subenPasajeros();
        auto.bajanPasajeros();
        auto.frena();
        auto.detener();
        System.out.println();

        // Probamos el autobus
        System.out.println(autobus);
        autobus.arrancar();
        autobus.subenPasajeros();
        autobus.bajanPasajeros();
        autobus.frena();
        autobus.detener();
        System.out.println();

        // Probamos la bicicleta
        System.out.println(bici);
        bici.arrancar();
        bici.subenPasajeros();
        bici.bajanPasajeros();
        bici.frena();
        bici.detener();
        System.out.println();

        // Probamos el camión
        System.out.println(camion);
        camion.arrancar();
        camion.carga();
        camion.descarga();
        camion.frena();
        camion.detener();
    }
}
