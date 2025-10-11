import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Torneo {
    private ArrayList<Jugador> torneo;
    private LinkedList<String> historialGanadores;


    public Torneo() {
        this.torneo = new ArrayList<>();
        this.historialGanadores = new LinkedList<>();
    }


    public ArrayList<Jugador> getTorneo() {
        return torneo;
    }

    public void setTorneo(ArrayList<Jugador> torneo) {
        this.torneo = torneo;
    }

    public LinkedList<String> getHistorialGanadores() {
        return historialGanadores;
    }

    public void setHistorialGanadores(LinkedList<String> historialGanadores) {
        this.historialGanadores = historialGanadores;
    }


    public void agregarJugador(Jugador p){
        torneo.add(p);
    }

    public void eliminarJugador(Jugador p){
        torneo.remove(p);
    }

    public void mostrarTorneo(){
        for (Jugador p : torneo){
            System.out.println(p);
        }
    }

    public void agregarGanador(String nombre){
        historialGanadores.add(nombre);
    }

    public void mostrarHistorialGanadores(){
        for (String nombre : historialGanadores){
            System.out.println(nombre);
        }
    }

    public void jugarRonda(){
        Random rand = new Random();
        int index1=rand.nextInt(torneo.size());
        int index2;
        do {
            index2= rand.nextInt(torneo.size());
        }while (index1==index2);

        Jugador p1 = torneo.get(index1);
        Jugador p2 = torneo.get(index2);

        p1.competir();
        p2.competir();


        int puntaje1 = p1.obtenerPuntaje();
        int puntaje2 = p2.obtenerPuntaje();
        String ganador;
        if (puntaje1>puntaje2){
            ganador=p1.getNombre();
        } else {
            ganador=p2.getNombre();
        }

        System.out.println("Ganador "+ ganador);
        agregarGanador(ganador);


    }


}
