public class Main {
    public static void main(String[] args) {

        // Registros
        RegistroJuegos registroJuegos = new RegistroJuegos();
        RegistroTarjetas registroTarjetas = new RegistroTarjetas();
        RegistroJugada registroJugadas = new RegistroJugada();

        // Crear juegos
        Juego juego1 = new JuegoTicket("TATETI", Precio.LOW, Categoria.NINIOS, 10);
        Juego juego2 = new Juego("PING PONG", Precio.MEDIUM, Categoria.ADOLESCENTES);

        registroJuegos.agregarJuego(juego1);
        registroJuegos.agregarJuego(juego2);

        // Crear titulares y tarjetas
        Titular t1 = new Titular("Juan Perez", "12345678", "555-1234");
        Tarjeta tarjeta1 = new Tarjeta(t1);
        registroTarjetas.agregarTarjeta(tarjeta1);

        // Cargar saldo
        registroTarjetas.cargarSaldo("12345678", 1000);

        // Registrar jugadas
        registroJugadas.registrarJugada(juego1, tarjeta1);
        registroJugadas.registrarJugada(juego2, tarjeta1);

        // Ver jugadas por DNI
        registroJugadas.verJugadasPorDni("12345678");
    }
}