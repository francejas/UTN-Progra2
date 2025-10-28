public class Main {

    // Clase de ejemplo que implementa Comparable para definir el orden natural
    static class Item implements Comparable<Item> {
        String nombre;
        int valor;

        public Item(String nombre, int valor) {
            this.nombre = nombre;
            this.valor = valor;
        }

        @Override
        public String toString() {
            return nombre + "(" + valor + ")";
        }


        @Override
        public int compareTo(Item otroItem) {
            return Integer.compare(this.valor, otroItem.valor);
        }
    }

    public static void main(String[] args) {

        // --- 1. Prueba con Números (Tipo Integer) ---
        System.out.println("--- 1. Lista de Enteros (Orden Ascendente) ---");
        ListaOrdenada<Integer> listaEnteros = new ListaOrdenada<>();

        listaEnteros.agregar(40);
        listaEnteros.agregar(10);
        listaEnteros.agregar(30);
        listaEnteros.agregar(50);
        listaEnteros.agregar(20);

        System.out.println(listaEnteros); // Debe estar ordenada: [10, 20, 30, 40, 50]

        // Obtener por posición
        System.out.println("Elemento en posición 2 (índice): " + listaEnteros.obtenerElemento(2)); // 30

        // Eliminar
        listaEnteros.eliminar(40);
        listaEnteros.eliminar(99); // No existe

        System.out.println(listaEnteros);

        System.out.println("\n" + "-".repeat(50) + "\n");

        // --- 2. Prueba con Objetos Personalizados (Tipo Item) ---
        System.out.println("--- 2. Lista de Items (Orden Ascendente por Valor) ---");
        ListaOrdenada<Item> listaItems = new ListaOrdenada<>();

        listaItems.agregar(new Item("Beta", 5));
        listaItems.agregar(new Item("Alpha", 1));
        listaItems.agregar(new Item("Gamma", 3));

        System.out.println(listaItems); // Ordenado por valor: [Alpha(1), Gamma(3), Beta(5)]

        // Obtener por posición
        System.out.println("Elemento en posición 0: " + listaItems.obtenerElemento(0)); // Alpha(1)

        // Eliminar
        listaItems.eliminar(new Item("Borrar", 3)); // Elimina Gamma(3) por su valor

        System.out.println(listaItems);
    }
}