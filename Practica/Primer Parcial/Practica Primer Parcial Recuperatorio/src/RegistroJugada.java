import java.util.ArrayList;

public class RegistroJugada {
    private ArrayList<Jugada> registro;

    public RegistroJugada() {
        this.registro = new ArrayList<>();
    }

    public ArrayList<Jugada> getRegistro() {
        return registro;
    }

    public void setRegistro(ArrayList<Jugada> registro) {
        this.registro = registro;
    }

    public void registrarJugada(Juego juego, Tarjeta tarjeta){
        if(juego.getPrecio().getPrecio() <= tarjeta.getSaldo()){
            tarjeta.setSaldo(tarjeta.getSaldo() - juego.getPrecio().getPrecio());
            if(juego instanceof JuegoTicket){
                int tickets = ((JuegoTicket) juego).getCantTicket();
                tarjeta.setTicketsGanados(tarjeta.getTicketsGanados() + tickets);
            }
            Jugada jugada = new Jugada(juego, tarjeta);
            registro.add(jugada);
            System.out.println("Jugada registrada correctamente.");
        } else {
            System.out.println("Saldo insuficiente para jugar " + juego.getNombre());
        }
    }

    public void verJugadasPorDni(String dni){
        boolean encontrada = false;
        for(Jugada jugada : registro){
            if(jugada.getTarjeta().getTitular().getDni().equalsIgnoreCase(dni)){
                System.out.println(jugada);
                encontrada = true;
            }
        }
        if(!encontrada){
            System.out.println("No se encontraron jugadas para el DNI: " + dni);
        }
    }

}
