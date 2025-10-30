import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombreBiblioteca;
    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public Biblioteca(String nombreBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
        this.libros = new ArrayList<>();
    }

    public String getNombreBiblioteca() {
        return nombreBiblioteca;
    }

    public void setNombreBiblioteca(String nombreBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public boolean agregarLibro (Libro libro){
        return libros.add(libro);
    }

    public boolean  borrarLibro(Libro libro){
        return libros.remove(libro);
    }

    public void borrarPorISBN (String ISBN ){
        Libro libro = new Libro();
        libro.setISBN(ISBN);
        libros.remove(libro);
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombreBibliote='" + nombreBiblioteca + '\'' +
                ", libros=" + libros +
                '}';
    }







}
