public class Main {
    public static void main(String[] args) {
// carga inicial de datos
        GestorJSONBiblioteca gestorJSONBiblioteca = new GestorJSONBiblioteca();
        Biblioteca biblioteca = new Biblioteca("Ateneo");
        biblioteca.agregarLibro(new Libro("El hombre que fue Jueves", "GK Chesterton", "Policial", "233-345-32332-2-1"));
        biblioteca.agregarLibro(new Libro("Rebelion en la granja", "George Orwell", "Satira", "212-341-36677-1-4"));
        biblioteca.agregarLibro(new Libro("Un mundo feliz", "Huxley", "Ciencia Ficción", "132-151-38671-3-1"));

        // guardar estado actual
        gestorJSONBiblioteca.bibliotecaArchivo(biblioteca);
        Biblioteca bibliotecaArchivo = gestorJSONBiblioteca.archivoBiblioteca();
        System.out.println("Biblioteca leída del JSON: \n " + bibliotecaArchivo.toString());


        // agregar un libro (El Principito)
        gestorJSONBiblioteca.agregarLibroArchivo(new Libro("El principito", "Saint-Exupery", "Fantasia", "233-442-64545-3-6"));

        // borrar un libro (Un Mundo feliz)
        gestorJSONBiblioteca.borrarLibroArchivo("132-151-38671-3-1");

        // vuelvo a leer el archivo, deserializar y mostrar la biblioteca
        bibliotecaArchivo = gestorJSONBiblioteca.archivoBiblioteca();
        System.out.println("Biblioteca leída del JSON eliminando Un Mundo Feliz y agregando El Principito: \n " + bibliotecaArchivo.toString());



    }
}