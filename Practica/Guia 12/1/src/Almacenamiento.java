import java.util.ArrayList;
import java.util.List;

public class Almacenamiento <T> {
    private List<T> lista;

    public Almacenamiento() {
        this.lista = new ArrayList<>();
    }

    public List<T> getLista() {
        return lista;
    }

    public void setLista(List<T> lista) {
        this.lista = lista;
    }


    public void agregarObjeto (T elemento){
        lista.add(elemento);
        System.out.println("✅ Agregado: " + elemento.toString());
    }

    // true si el objeto fue encontrado y eliminado, false en caso contrario.
    public boolean eliminarElemento (T elemento) {
        boolean eliminado = lista.remove(elemento);
        if (eliminado) {
            System.out.println("❌ Eliminado: " + elemento.toString());
        } else {
            System.out.println("⚠️ No se encontró para eliminar: " + elemento.toString());
        }
        return eliminado;
    }

    public T buscarElemento (T elemento){
        // Usamos contains() para verificar si el objeto está presente
        if (lista.contains(elemento)) {
            int index = lista.indexOf(elemento);
            return lista.get(index);
        }
        return null;
    }
}