import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Concesionario concesionario = new Concesionario();

        // ---------------- Cargar 1 objeto de cada tipo ----------------
        // Auto
        ArrayList<Prestaciones> prestacionesAuto = new ArrayList<>();
        prestacionesAuto.add(Prestaciones.AIRE_ACONDICIONADO);
        prestacionesAuto.add(Prestaciones.ABS);
        Auto auto = new Auto("ABC123", "Toyota", "Corolla", 7.5, 4, prestacionesAuto, Cambios.MANUAL);
        concesionario.agregarVehiculo(auto);

        // Moto
        Moto moto = new Moto("MOTO1", "Honda", "CB500", 5.5, 2, 500, true);
        concesionario.agregarVehiculo(moto);

        // Yate
        Yate yate = new Yate("Y001", "Mar Azul", 20.0, 5.0, 10, 200, "Juan", 3);
        concesionario.agregarYate(yate);

        // ---------------- Menú ----------------
        int opcion;
        do {
            System.out.println("\n--- MENU CONCESIONARIO ---");
            System.out.println("1. Mostrar Inventario");
            System.out.println("2. Buscar por patente/matrícula");
            System.out.println("3. Eliminar por patente/matrícula");
            System.out.println("4. Calcular precio total inventario");
            System.out.println("0. Salir");
            System.out.print("Elija opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> concesionario.mostrarInventario();
                case 2 -> {
                    System.out.print("Ingrese patente/matrícula: ");
                    String pat = sc.nextLine();
                    concesionario.buscarPorPatente(pat);
                }
                case 3 -> {
                    System.out.print("Ingrese patente/matrícula a eliminar: ");
                    String pat = sc.nextLine();
                    concesionario.eliminarPorPatente(pat);
                }
                case 4 -> System.out.println("Precio total inventario: " + concesionario.calcularPrecioTotal());
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida");
            }

        } while (opcion != 0);

        sc.close();
    }
}
