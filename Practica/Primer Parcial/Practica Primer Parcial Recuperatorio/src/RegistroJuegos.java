import java.util.ArrayList;

public class RegistroJuegos {
    private ArrayList<Juego> listaJuegos;

    public RegistroJuegos() {
        this.listaJuegos = new ArrayList<>();
    }

    public ArrayList<Juego> getListaJuegos() {
        return listaJuegos;
    }

    public void setListaJuegos(ArrayList<Juego> listaJuegos) {
        this.listaJuegos = listaJuegos;
    }

    public void agregarJuego(Juego juego){
        listaJuegos.add(juego);
    }

    public Juego buscarJuego(String nombre){
        for (Juego juego : listaJuegos){
            if (juego.getNombre().equalsIgnoreCase(nombre)){
                return juego;
            }
        }
        return null;
    }

    public void mostrarJuego(String nombre){
        Juego juego = buscarJuego(nombre);
        if(juego != null){
            System.out.println(juego);
        } else {
            System.out.println("Juego no encontrado");
        }
    }
}




