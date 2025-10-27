public class Main {
    // Clase de ejemplo para probar el almacenamiento de objetos complejos
    static class Persona {
        String nombre;
        int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }


        @Override
        public String toString() {
            return "Persona{" + "nombre='" + nombre + '\'' + ", edad=" + edad + '}';
        }


        // Es vital sobrescribir equals() y hashCode() para que los métodos
        // eliminarElemento y buscarElemento funcionen correctamente en objetos no primitivos.
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Persona persona = (Persona) o;
            return edad == persona.edad && nombre.equals(persona.nombre);
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(nombre, edad);
        }


    }

    public static void main(String[] args) {
        // --- 1. Almacenamiento de Cadenas (String) ---
        System.out.println("--- PRUEBA 1: Almacenamiento de Cadenas (String) ---");
        Almacenamiento<String> almacenamientoCadenas = new Almacenamiento<>();

        almacenamientoCadenas.agregarObjeto("Manzana");
        almacenamientoCadenas.agregarObjeto("Banana");
        almacenamientoCadenas.agregarObjeto("Naranja");

        System.out.println("Contenido actual: " + almacenamientoCadenas.getLista());

        // Buscar
        String busqueda1 = "Banana";
        String resultado1 = almacenamientoCadenas.buscarElemento(busqueda1);
        System.out.print("🔎 Buscando '" + busqueda1 + "': ");
        System.out.println(resultado1 != null ? "Encontrado -> " + resultado1 : "No encontrado.");

        // Eliminar
        almacenamientoCadenas.eliminarElemento("Manzana");
        almacenamientoCadenas.eliminarElemento("Uva"); // Intento de eliminar algo que no existe

        System.out.println("Contenido final: " + almacenamientoCadenas.getLista());

        System.out.println("\n" + "-".repeat(50) + "\n");

        // --- 2. Almacenamiento de Objetos Personalizados (Persona) ---
        System.out.println("--- PRUEBA 2: Almacenamiento de Objetos Personalizados (Persona) ---");
        Almacenamiento<Persona> almacenamientoPersonas = new Almacenamiento<>();

        Persona p1 = new Persona("Ana", 30);
        Persona p2 = new Persona("Luis", 25);
        Persona p3 = new Persona("Marta", 45);

        almacenamientoPersonas.agregarObjeto(p1);
        almacenamientoPersonas.agregarObjeto(p2);
        almacenamientoPersonas.agregarObjeto(p3);

        System.out.println("Contenido actual: " + almacenamientoPersonas.getLista());

        // Buscar (creamos un nuevo objeto que es igual a uno existente)
        Persona busqueda2 = new Persona("Luis", 25);
        Persona resultado2 = almacenamientoPersonas.buscarElemento(busqueda2);
        System.out.print("🔎 Buscando a " + busqueda2.nombre + ": ");
        System.out.println(resultado2 != null ? "Encontrado -> " + resultado2 : "No encontrado.");

        // Eliminar
        almacenamientoPersonas.eliminarElemento(p3);

        System.out.println("Contenido final: " + almacenamientoPersonas.getLista());
    }
}