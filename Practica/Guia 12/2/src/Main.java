import java.util.NoSuchElementException;

public class Main {

    static class Tarea {
        String descripcion;
        int prioridad;

        public Tarea(String descripcion, int prioridad) {
            this.descripcion = descripcion;
            this.prioridad = prioridad;
        }

        @Override
        public String toString() {
            return "Tarea(" + descripcion + ", P" + prioridad + ")";
        }
    }

    public static void main(String[] args) {

        // --- PRUEBA 1: Pila de Cadenas (String) ---
        System.out.println("--- 1. Pila de Cadenas (LIFO) ---");
        Pila<String> pilaCadenas = new Pila<>();

        System.out.println("¿Está vacía? " + pilaCadenas.estaVacia()); // true

        // Apilar elementos
        pilaCadenas.apilar("Libro 1");
        pilaCadenas.apilar("Libro 2"); // Este es el tope

        System.out.println(pilaCadenas.toString());
        System.out.println("Tamaño: " + pilaCadenas.obtenerTamano()); // 2

        // Ver el tope
        System.out.println("👁️  Tope (PEEK): " + pilaCadenas.verTope()); // Libro 2

        // Desapilar elementos (LIFO)
        pilaCadenas.desapilar(); // Quita Libro 2

        System.out.println(pilaCadenas.toString());
        System.out.println("Tamaño después de POP: " + pilaCadenas.obtenerTamano()); // 1

        System.out.println("\n" + "-".repeat(50) + "\n");

        // --- PRUEBA 2: Pila de Objetos Personalizados (Tarea) ---
        System.out.println("--- 2. Pila de Tareas ---");
        Pila<Tarea> pilaTareas = new Pila<>();

        Tarea t1 = new Tarea("Preparar café", 3);
        Tarea t2 = new Tarea("Enviar reporte", 1);

        pilaTareas.apilar(t1);
        pilaTareas.apilar(t2); // Tarea más reciente, irá al tope

        System.out.println(pilaTareas.toString());

        // La tarea más reciente debe ser la primera en ser procesada
        Tarea tareaPrioritaria = pilaTareas.desapilar(); // Quita t2
        System.out.println("Procesando: " + tareaPrioritaria);

        System.out.println("Tamaño final: " + pilaTareas.obtenerTamano()); // 1

        System.out.println("\n" + "-".repeat(50) + "\n");

        // --- PRUEBA 3: Manejo de Pila Vacía ---
        System.out.println("--- 3. Pila Vacía ---");
        Pila<Integer> pilaEnteros = new Pila<>();

        try {
            pilaEnteros.desapilar(); // Esto causará una excepción
        } catch (NoSuchElementException e) {
            System.err.println("Captura de error: " + e.getMessage());
        }
    }
}