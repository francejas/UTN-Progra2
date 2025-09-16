import java.util.LinkedList;
import java.util.Scanner;

public class ListaPremium implements Reproduccion{
    private String nombre;
    private LinkedList<Cancion> miLista;

    public ListaPremium(String nombre) {
        this.nombre = nombre;
        this.miLista = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Cancion> getMiLista() {
        return miLista;
    }

    public void setMiLista(LinkedList<Cancion> miLista) {
        this.miLista = miLista;
    }

    @Override
    public void reproducir() {
        if (miLista.isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elija la canción a reproducir:");
        for (int i = 0; i < miLista.size(); i++) {
            System.out.println((i+1) + ". " + miLista.get(i));
        }
        int opcion = scanner.nextInt();
        if (opcion > 0 && opcion <= miLista.size()) {
            System.out.println("▶ Reproduciendo: " + miLista.get(opcion-1));
        }
    }

    @Override
    public void agregarCancion(Cancion cancion) {
        miLista.add(cancion);
        System.out.println("Canción añadida a la lista premium.");
    }

    @Override
    public void eliminarCancion() {
        if (miLista.isEmpty()){
            System.out.println("La lista está vacía.");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elija la canción a eliminar:");
        for (int i = 0; i < miLista.size() ; i++) {
            System.out.println((i+1)+". "+miLista.get(i));
        }
        int opcion=scanner.nextInt();
        scanner.nextLine();
        if (opcion>0 && opcion<= miLista.size()){
            Cancion eliminada = miLista.remove(opcion-1);
            System.out.println("❌ Eliminada: " + eliminada.getNombre());
        }


    }

    @Override
    public void verMiLista() {
        System.out.println("💿 Lista Premium: " + nombre);
        for (Cancion c : miLista) {
            System.out.println(c);
        }
    }

    @Override
    public void cambiarCancion() {
        if (miLista.isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }
        // mover la primera canción al final
        Cancion actual = miLista.pollFirst();
        miLista.addLast(actual);

        // reproducir la nueva primera
        System.out.println("⏭ Reproduciendo siguiente: " + miLista.getFirst());
    }

}
