import java.util.UUID;

public abstract class Material {
    private UUID id;
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private TipoMateriales tipo;
    private GeneroLibro genero;
    private EstadoPrestamo estado;

    public Material(UUID id, String titulo, String autor, int anioPublicacion, TipoMateriales tipo, GeneroLibro genero, EstadoPrestamo estado) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.tipo = tipo;
        this.genero = genero;
        this.estado = estado;
    }

    public UUID getId() {
        return id;
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

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public TipoMateriales getTipo() {
        return tipo;
    }

    public void setTipo(TipoMateriales tipo) {
        this.tipo = tipo;
    }

    public GeneroLibro getGenero() {
        return genero;
    }

    public void setGenero(GeneroLibro genero) {
        this.genero = genero;
    }

    public EstadoPrestamo getEstado() {
        return estado;
    }

    public void setEstado(EstadoPrestamo estado) {
        this.estado = estado;
    }
}
