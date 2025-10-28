import java.util.Objects;

public class Main {

    // Clase de ejemplo: Es esencial SOBRESCRIBIR equals() y hashCode()
    // para que el HashSet sepa cuándo dos objetos Producto son "iguales"
    static class Producto {
        String codigo;
        String nombre;

        public Producto(String codigo, String nombre) {
            this.codigo = codigo;
            this.nombre = nombre;
        }

        @Override
        public String toString() {
            return nombre + " (" + codigo + ")";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Producto producto = (Producto) o;
            // Dos productos son iguales si tienen el mismo código
            return codigo.equals(producto.codigo);
        }

        @Override
        public int hashCode() {
            return Objects.hash(codigo);
        }
    }

    public static void main(String[] args) {

        // --- 1. Prueba con Cadenas (String) ---
        System.out.println("--- 1. Conjunto de Cadenas ---");
        Conjunto<String> conjuntoCadenas = new Conjunto<>();

        conjuntoCadenas.agregar("Rojo");
        conjuntoCadenas.agregar("Verde");
        conjuntoCadenas.agregar("Rojo"); // Intenta agregar un duplicado

        System.out.println(conjuntoCadenas);

        // Buscar
        String busqueda1 = "Verde";
        System.out.println("🔎 ¿Contiene '" + busqueda1 + "'? " + conjuntoCadenas.buscarElemento(busqueda1));

        // Eliminar
        conjuntoCadenas.eliminar("Azul"); // Intenta eliminar un inexistente
        conjuntoCadenas.eliminar("Verde");

        System.out.println(conjuntoCadenas);

        System.out.println("\n" + "-".repeat(40) + "\n");

        // --- 2. Prueba con Objetos Personalizados (Producto) ---
        System.out.println("--- 2. Conjunto de Productos ---");
        Conjunto<Producto> conjuntoProductos = new Conjunto<>();

        Producto pA = new Producto("X100", "Monitor LED");
        Producto pB = new Producto("Y200", "Teclado Mecánico");
        // Producto con el mismo código que pA, pero diferente nombre
        Producto pC = new Producto("X100", "Monitor LCD");

        conjuntoProductos.agregar(pA);
        conjuntoProductos.agregar(pB);
        conjuntoProductos.agregar(pC); // Intenta agregar un duplicado (mismo código)

        System.out.println(conjuntoProductos);

        // Buscar (usando un nuevo objeto con el código deseado)
        Producto busqueda2 = new Producto("Y200", "Cualquier Nombre");
        System.out.println("🔎 ¿Contiene el producto Y200? " + conjuntoProductos.buscarElemento(busqueda2));

        // Eliminar
        conjuntoProductos.eliminar(pA);

        System.out.println(conjuntoProductos);
    }
}