import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Callable;

public class ListaBasica implements Reproduccion{
    private String nombre;
    private Queue<Cancion> miLista;

    public ListaBasica(String nombre) {
        this.nombre = nombre;
        this.miLista = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Queue<Cancion> getMiLista() {
        return miLista;
    }

    public void setMiLista(Queue<Cancion> miLista) {
        this.miLista = miLista;
    }

    @Override
    public void reproducir() {
        if(miLista.isEmpty()){
            System.out.println("La lista está vacía.");
            return;
        }
        Cancion actual = miLista.poll();
        System.out.println("▶ Reproduciendo: " + actual);
        miLista.offer(actual); // vuelve al final


    }

    @Override
    public void agregarCancion(Cancion cancion) {
            miLista.offer(cancion);
        System.out.println("Canción añadida a la lista básica.");
    }

    @Override
    public void eliminarCancion() {
        System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");
    }

    @Override
    public void verMiLista() {
        System.out.println("📀 Lista Básica: " + nombre);
        for (Cancion c : miLista) {
            System.out.println(c);
        }
    }

    @Override
    public void cambiarCancion() {
        System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");
    }
}
