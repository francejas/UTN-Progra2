import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.UUID;

public class Biblioteca {
    private ArrayList<Material> biblioteca;

    public Biblioteca() {
        this.biblioteca = new ArrayList<>();
    }

    public ArrayList<Material> getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(ArrayList<Material> biblioteca) {
        this.biblioteca = biblioteca;
    }

    // -------------------- Mostrar --------------------
    public void mostrarBiblioteca() {
        if (biblioteca.isEmpty()) {
            System.out.println("La biblioteca está vacía.");
            return;
        }
        System.out.println("Listado Biblioteca: ");
        for (Material material : biblioteca) {
            System.out.println(material);
        }
    }

    public void mostrarBibliotecaConIndice() {
        if (biblioteca.isEmpty()) {
            System.out.println("La biblioteca está vacía.");
            return;
        }
        System.out.println("Listado Biblioteca: ");
        for (int i = 0; i < biblioteca.size(); i++) {
            System.out.println((i + 1) + ". " + biblioteca.get(i).getTitulo());
        }
    }

    // -------------------- Búsquedas --------------------
    public void buscarPorTitulo(String titulo) {
        if (biblioteca.isEmpty()) {
            System.out.println("Biblioteca vacía");
            return;
        }
        for (Material material : biblioteca) {
            if (material.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Material encontrado.");
                System.out.println(material);
            }
        }
    }

    public void buscarPorGenero(GeneroLibro genero) {
        if (biblioteca.isEmpty()) {
            System.out.println("Biblioteca vacía");
            return;
        }
        for (Material material : biblioteca) {
            if (material.getGenero().equals(genero)) {
                System.out.println("Libro encontrado.");
                System.out.println(material);
            }
        }
    }

    public void buscarPorAutor(String autor) {
        if (biblioteca.isEmpty()) {
            System.out.println("Biblioteca vacía");
            return;
        }
        for (Material material : biblioteca) {
            if (material.getAutor().equalsIgnoreCase(autor)) {
                System.out.println("Material encontrado.");
                System.out.println(material);
            }
        }
    }

    public void buscarPorTipo(TipoMateriales tipo) {
        if (biblioteca.isEmpty()) {
            System.out.println("Biblioteca vacía");
            return;
        }
        for (Material material : biblioteca) {
            if (material.getTipo().equals(tipo)) {
                System.out.println("Material encontrado.");
                System.out.println(material);
            }
        }
    }

    public void buscarPorEstado(EstadoPrestamo estado) {
        if (biblioteca.isEmpty()) {
            System.out.println("Biblioteca vacía");
            return;
        }
        for (Material material : biblioteca) {
            if (material.getEstado().equals(estado)) {
                System.out.println("Material encontrado.");
                System.out.println(material);
            }
        }
    }

    // -------------------- ABM --------------------
    public void agregarMaterial(Material m) {
        biblioteca.add(m);
        System.out.println("Material agregado: " + m.getTitulo());
    }

    public void eliminarMaterial(Scanner scanner) {
        if (biblioteca.isEmpty()) {
            System.out.println("Biblioteca vacía");
            return;
        }
        System.out.println("Elija qué material eliminar:");
        mostrarBibliotecaConIndice();
        int opcion = scanner.nextInt();
        scanner.nextLine();
        if (opcion > 0 && opcion <= biblioteca.size()) {
            Material eliminado = biblioteca.remove(opcion - 1);
            System.out.println("Eliminado: " + eliminado.getTitulo());
        } else {
            System.out.println("Opción inválida.");
        }
    }

    public void modificarMaterial(Scanner scanner) {
        if (biblioteca.isEmpty()) {
            System.out.println("Biblioteca vacía");
            return;
        }
        System.out.println("Elija material a modificar: ");
        mostrarBibliotecaConIndice();
        int opcion = scanner.nextInt();
        scanner.nextLine();
        if (opcion > 0 && opcion <= biblioteca.size()) {
            Material modificado = biblioteca.get(opcion - 1);
            System.out.println("Material seleccionado: " + modificado.getTitulo());
            System.out.println("Elija qué desea modificar: ");
            System.out.println("1. Título");
            System.out.println("2. Autor");
            System.out.println("3. Año de publicación");
            System.out.println("4. Género");
            int opcionMod = scanner.nextInt();
            scanner.nextLine();
            switch (opcionMod) {
                case 1:
                    System.out.print("Nuevo título: ");
                    modificado.setTitulo(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("Nuevo autor: ");
                    modificado.setAutor(scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Nuevo año de publicación: ");
                    modificado.setAnioPublicacion(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 4:
                    System.out.print("Nuevo género (ej: FICCION, CIENCIA, HISTORIA): ");
                    String generoStr = scanner.nextLine().toUpperCase();
                    try {
                        modificado.setGenero(GeneroLibro.valueOf(generoStr));
                    } catch (IllegalArgumentException e) {
                        System.out.println("Género inválido.");
                    }
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
            System.out.println("Material modificado con éxito.");
        } else {
            System.out.println("Opción inválida.");
        }
    }

    // -------------------- Ordenamientos --------------------
    public void ordenarPorTitulo() {
        Collections.sort(biblioteca, Comparator.comparing(Material::getTitulo));
        System.out.println("Materiales ordenados por título.");
    }

    public void ordenarPorAnio() {
        Collections.sort(biblioteca, Comparator.comparing(Material::getAnioPublicacion));
        System.out.println("Materiales ordenados por año de publicación.");
    }

    // -------------------- Gestión de préstamos --------------------
    public void prestarMaterial(UUID id) {
        for (Material m : biblioteca) {
            if (m.getId().equals(id)) {
                if (m.getEstado() == EstadoPrestamo.DISPONIBLE) {
                    m.setEstado(EstadoPrestamo.PRESTADO);
                    System.out.println("Material prestado: " + m.getTitulo());
                } else {
                    System.out.println("El material ya está prestado.");
                }
                return;
            }
        }
        System.out.println("No se encontró material con ese ID.");
    }

    public void devolverMaterial(UUID id) {
        for (Material m : biblioteca) {
            if (m.getId().equals(id)) {
                if (m.getEstado() == EstadoPrestamo.PRESTADO) {
                    m.setEstado(EstadoPrestamo.DISPONIBLE);
                    System.out.println("Material devuelto: " + m.getTitulo());
                } else {
                    System.out.println("El material no estaba prestado.");
                }
                return;
            }
        }
        System.out.println("No se encontró material con ese ID.");
    }
}
