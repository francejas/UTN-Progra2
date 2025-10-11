import java.util.Objects;
import java.util.UUID;

public class eBook extends Material implements Visualizable{
    private double tamanioArchivoMB;

    public eBook(UUID id, String titulo, String autor, int anioPublicacion, TipoMateriales tipo, GeneroLibro genero, EstadoPrestamo estado, double tamanioArchivoMB) {
        super(id, titulo, autor, anioPublicacion, TipoMateriales.EBOOK, genero, estado);
        this.tamanioArchivoMB = tamanioArchivoMB;
    }

    public double getTamanioArchivoMB() {
        return tamanioArchivoMB;
    }

    public void setTamanioArchivoMB(double tamanioArchivoMB) {
        this.tamanioArchivoMB = tamanioArchivoMB;
    }

    @Override
    public void leer() {
        System.out.println("Contenido de eBook : " +super.getTitulo());
    }
}
