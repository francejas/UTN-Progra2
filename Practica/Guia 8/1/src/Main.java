import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Libro> inventario = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\n--- MENU DE INVENTARIO DE LIBROS ---");
            System.out.println("1. Agregar un libro");
            System.out.println("2. Eliminar un libro por título");
            System.out.println("3. Mostrar todos los libros");
            System.out.println("4. Buscar un libro por título");
            System.out.println("5. Actualizar precio de un libro");
            System.out.println("6. Calcular precio total de todos los libros");
            System.out.println("7. Contar número total de libros");
            System.out.println("8. Encontrar libro más caro y más barato");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion=scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1:
                    agregarLibro(inventario, scanner);
                    break;
                case 2:
                    System.out.println("Ingrese titulo de libro a eliminar");
                    String nombre=scanner.nextLine();
                    eliminarLibro(inventario, nombre);
                    break;
                case 3:
                    mostrarInventario(inventario);
                    break;
                case 4:
                    System.out.println("Ingrese titulo de libro a buscar");
                    //aca porque me tira error si digo String nombre ?
                    nombre = scanner.nextLine();
                    buscarLibro(inventario, nombre);
                    break;
                case 5:
                    System.out.println("Ingrese titulo de libro para actualizar precio");
                    nombre = scanner.nextLine();
                    actualizarPrecio(inventario,nombre);






                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");

            }

} while (opcion!=6);
        scanner.close();




    }


    public static void agregarLibro(ArrayList<Libro> inventario, Scanner scanner){
        Libro libro = null;

        System.out.println("Ingrese nombre del libro: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese autor del libro: ");
        String autor = scanner.nextLine();

        System.out.println("Ingrese precio del libro: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Ingrese año de publicación: ");
        int anio = scanner.nextInt();
        scanner.nextLine();


        libro = new Libro(nombre,autor,precio,anio);
        inventario.add(libro);
        System.out.println("Libro agregado correctamente.");

    }


    public static void eliminarLibro(ArrayList<Libro> inventario, String nombre){
        Libro libroAEliminar = null;

        for (Libro aux: inventario){
            if (aux.getTitulo().equalsIgnoreCase(nombre)){
                libroAEliminar = aux;
                break;
            }
        }

        if (libroAEliminar != null) {
            inventario.remove(libroAEliminar);
            System.out.println("Libro eliminado correctamente.");
        } else {
            System.out.println("No se encontró un libro con ese título.");
        }

    }

    public static void mostrarInventario(ArrayList<Libro> inventario){
        if (inventario.isEmpty()){
            System.out.println("No hay libros en el inventario.");
        } else {
            //inventario.forEach(System.out::println);
            for (Libro aux : inventario){
                mostrarLibro(aux);
            }
        }
    }

    public static void mostrarLibro(Libro aux){
        //System.out.println(aux);
        System.out.println(aux.toString());
    }


public static void buscarLibro(ArrayList<Libro> inventario, String nombre){
        boolean encontrado = false;

        for (Libro aux : inventario){
            if (aux.getTitulo().equalsIgnoreCase(nombre)){
                encontrado=true;
                mostrarLibro(aux);
            }
        }
    if (!encontrado) System.out.println("Libro no encontrado.");
}

public static void actualizarPrecio()




}

