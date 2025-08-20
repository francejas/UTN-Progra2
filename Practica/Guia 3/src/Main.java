import CuentasBancarias.cuentaBanco;
import Empleados.Empleado;
import ItemsVenta.ItemVenta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //probarEmpleados();
        //probarCuentaBanco();
        probarItemVenta();

    }

    public static void probarEmpleados() {
        Empleado empleado1 = new Empleado("Carlos","Gutiérrez","23456345",25000);
        Empleado empleado2 = new Empleado("Ana","Sánchez","34234123",27500);

        System.out.println("Empleado 1:");
        System.out.println("Nombre: " +empleado1.getNombre());
        System.out.println("Apellido: " +empleado1.getApellido());
        System.out.println("DNI: " +empleado1.getDni());
        System.out.println("Salario: " +empleado1.getSalario());
        System.out.println("");
        System.out.println("Empleado 2:");
        System.out.println("Nombre: " +empleado2.getNombre());
        System.out.println("Apellido: " +empleado2.getApellido());
        System.out.println("DNI: " +empleado2.getDni());
        System.out.println("Salario: " +empleado2.getSalario());

        System.out.println("Salario mensual de " + empleado1.getNombre() + ": " + empleado1.getSalario());
        System.out.println("Salario anual de " + empleado1.getNombre() + ": " + empleado1.salarioAnual());
        empleado1.aumentarSalario(15);
        System.out.println("Salario mensual aumentado de " + empleado1.getNombre() + ": " + empleado1.getSalario());
        System.out.println("Salario anual aumentado de " + empleado1.getNombre() + ": " + empleado1.salarioAnual());
    }

    public static void probarCuentaBanco() {
        cuentaBanco cuenta1 = new cuentaBanco(1, "Oscar", 15000);
        cuenta1.mostrarCuenta();

        // Depósito
        cuenta1.credito(2500);
        cuenta1.mostrarCuenta();

        // Retiro
        cuenta1.debito(1500);
        cuenta1.mostrarCuenta();

        // Retiro mayor al saldo
        cuenta1.debito(30000);
        cuenta1.mostrarCuenta();
    }


    public static void probarItemVenta(){
        Scanner scanner = new Scanner(System.in);
        ItemVenta item=null;// todavía no existe, se inicializa con null
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar ítem");
            System.out.println("2. Imprimir ítem");
            System.out.println("3. Actualizar cantidad");
            System.out.println("4. Actualizar precio unitario");
            System.out.println("5. Calcular precio total");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1:
                    System.out.print("Ingrese id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ingrese descripción: ");
                    String descripción=scanner.nextLine();

                    System.out.print("Ingrese cantidad: ");
                    int cantidad= scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ingrese precio unitario: ");
                    double precioUnitario= scanner.nextDouble();
                    scanner.nextLine();

                    item = new ItemVenta(id,descripción,cantidad,precioUnitario);
                    System.out.println("Ítem creado con éxito!");
                    break;
                case 2:
                    if (item!=null){
                        item.mostrarItem();
                    } else {
                        System.out.println("No hay item creado");
                    }
                    break;
                case 3:
                    if (item!=null){
                        System.out.println("Ingrese cantidad nueva: ");
                        int cantNueva= scanner.nextInt();
                        scanner.nextLine();
                        item.setCantidad(cantNueva);
                        System.out.println("Cantidad actualizada.");
                    } else {
                        System.out.println("No hay item creado");
                    }
                    break;
                case 4:
                    if (item!=null){
                        System.out.println("Ingrese nuevo precio unitario: ");
                        double nuevoPrecio= scanner.nextDouble();
                        scanner.nextLine();
                        item.setPrecioUnitario(nuevoPrecio);
                    } else {
                        System.out.println("No hay item creado");
                    }
                    break;
                case 5:
                    if (item!=null){
                        System.out.println("Precio total: $ "+item.calcularPrecioTotal());

                    } else {
                        System.out.println("No hay item creado");
                    }
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }while (opcion != 6);
        scanner.close();
    }

}
