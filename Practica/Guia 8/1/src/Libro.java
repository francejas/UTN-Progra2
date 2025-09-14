import java.util.Objects;
import java.util.UUID;

public class Libro {
    private UUID ID;
    private String titulo;
    private String autor;
    private double precio;
    private int anio;

    public Libro(String titulo, String autor, double precio, int anio) {
        this.ID = UUID.randomUUID();
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.anio = anio;
    }

    public UUID getID() {
        return ID;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }


    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Libro libro = (Libro) obj;
        return this.titulo.equalsIgnoreCase(libro.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(titulo);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "ID=" + ID +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + precio +
                ", anio=" + anio +
                '}';
    }
}
