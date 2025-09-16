public class Cancion {
    private String nombre;
    private double duracion;
    private Genero genero;
    private Album album;
    private String artistaInvitado;

    public Cancion(String nomnbre, double duracion, Genero genero, Album album, String artistaInvitado) {
        this.nombre = nomnbre;
        this.duracion = duracion;
        this.genero = genero;
        this.album = album;
        this.artistaInvitado = artistaInvitado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public String getArtistaInvitado() {
        return artistaInvitado;
    }

    public void setArtistaInvitado(String artistaInvitado) {
        this.artistaInvitado = artistaInvitado;
    }

    @Override
    public String toString() {
        String info = "🎵 " + nombre + " (" + duracion + " min, " + genero + ") - "
                + album.getTitulo() + " de " + album.getArtista().getNombre();
        if (artistaInvitado != null && !artistaInvitado.isEmpty()) {
            info += " feat. " + artistaInvitado;
        }
        return info;
    }

}
