import java.util.UUID;

public class Libro extends Material{
    private int numPaginas;

    public Libro(UUID id, String titulo, String autor, int anioPublicacion, TipoMateriales tipo, GeneroLibro genero, EstadoPrestamo estado, int numPaginas) {
        super(id, titulo, autor, anioPublicacion, TipoMateriales.LIBRO, genero, estado);
        this.numPaginas = numPaginas;
    }
}
