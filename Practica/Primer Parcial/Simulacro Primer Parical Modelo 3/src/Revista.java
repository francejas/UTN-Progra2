import java.util.UUID;

public class Revista extends Material{
    private String temaPrincipal;

    public Revista(UUID id, String titulo, String autor, int anioPublicacion, TipoMateriales tipo, GeneroLibro genero, EstadoPrestamo estado, String temaPrincipal) {
        super(id, titulo, autor, anioPublicacion, TipoMateriales.REVISTA, genero, estado);
        this.temaPrincipal = temaPrincipal;
    }

    public String getTemaPrincipal() {
        return temaPrincipal;
    }

    public void setTemaPrincipal(String temaPrincipal) {
        this.temaPrincipal = temaPrincipal;
    }



}
