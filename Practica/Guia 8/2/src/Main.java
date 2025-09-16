import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Elegir tipo de lista
        System.out.println("Bienvenido a MiniSpotify 🎵");
        System.out.println("¿Qué tipo de lista desea crear?");
        System.out.println("1. Básica (gratis)");
        System.out.println("2. Premium (paga)");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        Reproduccion lista;
        if (tipo == 1) {
            lista = new ListaBasica("Mi Lista Básica");
        } else {
            lista = new ListaPremium("Mi Lista Premium");
        }

        int opcion;
        do {
            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Reproducir");
            System.out.println("2. Añadir canción");
            System.out.println("3. Eliminar canción");
            System.out.println("4. Ver mi lista");
            System.out.println("5. Cambiar canción (skip)");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1:
                    lista.reproducir();
                    break;
                case 2:
                    System.out.print("Nombre de la canción: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Duración en minutos: ");
                    double duracion = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Género (ROCK, TRAP, JAZZ, HIP_HOP, POP, METAL, CLASICA): ");
                    Genero genero = Genero.valueOf(scanner.nextLine().toUpperCase());
                    System.out.print("Título del álbum: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Año del álbum: ");
                    int anio = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Artista principal: ");
                    String artistaNombre = scanner.nextLine();
                    System.out.print("Edad del artista: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nacionalidad del artista: ");
                    String nacionalidad = scanner.nextLine();

                    Artista artista = new Artista(artistaNombre, edad, nacionalidad);
                    Album album = new Album(anio, titulo, artista);
                    System.out.print("Artista invitado (enter si no hay): ");
                    String invitado = scanner.nextLine();

                    Cancion nueva = new Cancion(nombre, duracion, genero, album, invitado);
                    lista.agregarCancion(nueva);
                    break;
                case 3:
                    lista.eliminarCancion();
                    break;
                case 4:
                    lista.verMiLista();
                    break;
                case 5:
                    lista.cambiarCancion();
                    break;
                case 0:
                    System.out.println("👋 Saliendo...");
                    break;
                default:
                    System.out.println("❌ Opción inválida");

            }
        }while(opcion!=0);

    }
}