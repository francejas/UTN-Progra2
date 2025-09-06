import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de Empleados ---");
            System.out.println("1. Empleado Tiempo Completo");
            System.out.println("2. Empleado Por Horas");
            System.out.println("3. Empleado Contratista");
            System.out.println("4. Empleado a Comisión");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombreTC = sc.nextLine();
                    System.out.print("Sueldo base: ");
                    double sueldoBase = sc.nextDouble();
                    System.out.print("Años de antigüedad: ");
                    int anios = sc.nextInt();
                    EmpleadoTiempoCompleto empTC = new EmpleadoTiempoCompleto(nombreTC, anios, sueldoBase);
                    System.out.println("Pago: $" + empTC.calcularPago());
                    break;

                case 2:
                    System.out.print("Nombre: ");
                    String nombreH = sc.nextLine();
                    System.out.print("Tarifa por hora: ");
                    double tarifaH = sc.nextDouble();
                    System.out.print("Horas trabajadas: ");
                    int horasH = sc.nextInt();
                    EmpleadoPorHoras empH = new EmpleadoPorHoras(nombreH, tarifaH, horasH);
                    System.out.println("Pago: $" + empH.calcularPago());
                    break;

                case 3:
                    System.out.print("Nombre: ");
                    String nombreC = sc.nextLine();
                    System.out.print("Tarifa por hora: ");
                    double tarifaC = sc.nextDouble();
                    System.out.print("Horas trabajadas: ");
                    int horasC = sc.nextInt();
                    EmpleadoContratista empC = new EmpleadoContratista(nombreC, tarifaC, horasC);
                    System.out.println("Pago: $" + empC.calcularPago());
                    break;

                case 4:
                    System.out.print("Nombre: ");
                    String nombreCom = sc.nextLine();
                    System.out.print("Clientes captados: ");
                    int clientes = sc.nextInt();
                    System.out.print("Comisión por cliente: ");
                    double comision = sc.nextDouble();
                    EmpleadoAcomision empCom = new EmpleadoAcomision(nombreCom, clientes, comision);
                    System.out.println("Pago: $" + empCom.calcularPago());
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
