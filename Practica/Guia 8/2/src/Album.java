public class Album {
    private int anio;
    private String titulo;
    private Artista artista;

    public Album(int anio, String titulo, Artista artista) {
        this.anio = anio;
        this.titulo = titulo;
        this.artista = artista;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return titulo + " (" + anio + ") de " + artista.getNombre();
    }
}
