public class Main {
    public static void main(String[] args) {
        Torneo torneo = new Torneo();

        Jugador p1 = new JugadorAbonado("Pepe", Liga.BRONCE,1500);
        Jugador p2 = new JugadorAbonado("Francisco", Liga.PLATA,1500);
        Jugador p3 = new JugadorAbonado("Lucas", Liga.ORO,1500);

        Jugador j1 = new JugadorFreePass("Jimena",Liga.ORO,true);
        Jugador j2 = new JugadorFreePass("Nicolas",Liga.PLATA,true);
        Jugador j3 = new JugadorFreePass("Juan",Liga.PLATA,true);

        torneo.agregarJugador(p1);
        torneo.agregarJugador(p2);
        torneo.agregarJugador(p3);

        torneo.agregarJugador(j1);
        torneo.agregarJugador(j2);
        torneo.agregarJugador(j3);


        for (Jugador jugador : torneo.getTorneo()){
            jugador.entrenar();
        }

        torneo.mostrarTorneo();

        torneo.jugarRonda();
        torneo.jugarRonda();

        torneo.mostrarHistorialGanadores();


    }
}