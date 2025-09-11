public class Main {
    public static void main(String[] args) {
            Autobus autobus1 = new Autobus(132,50);
            Tranvia tranvia1 = new Tranvia("Centro - Norte",120);
            Bicicleta bici1 = new Bicicleta("BICI-001");

        System.out.println(autobus1);
        System.out.println(tranvia1);
        System.out.println(bici1);

        autobus1.arrancar();
        tranvia1.arrancar();
        bici1.arrancar();

        System.out.println("Autobús - Tipo: " + autobus1.getTipo() +
                ", Capacidad: " + autobus1.obtenerCapacidad() +
                ", Estado: Arrancado");

        System.out.println("Tranvía - Tipo: " + tranvia1.getTipo() +
                ", Capacidad: " + tranvia1.obtenerCapacidad() +
                ", Estado: Arrancado");

        System.out.println("Bicicleta - Tipo: " + bici1.getTipo() +
                ", Capacidad: " + bici1.obtenerCapacidad() +
                ", Estado: Arrancado");

        autobus1.detener();
        tranvia1.detener();
        bici1.detener();

        System.out.println("Autobús - Tipo: " + autobus1.getTipo() + ", Estado: Detenido");
        System.out.println("Tranvía - Tipo: " + tranvia1.getTipo() + ", Estado: Detenido");
        System.out.println("Bicicleta - Tipo: " + bici1.getTipo() + ", Estado: Detenido");


    }
}