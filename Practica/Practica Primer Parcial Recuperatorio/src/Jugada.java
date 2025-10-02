import java.util.Date;
import java.time.LocalDate;

public class Jugada {
    private Juego juego;
    private Tarjeta tarjeta;
    private LocalDate fecha;

    public Jugada(Juego juego, Tarjeta tarjeta) {
        this.juego = juego;
        this.tarjeta = tarjeta;
        this.fecha = LocalDate.now();
    }

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Jugada{" +
                "juego=" + juego +
                ", tarjeta=" + tarjeta +
                ", fecha=" + fecha +
                '}';
    }
}
