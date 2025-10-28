import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaOrdenada<T extends Comparable<T>>  {

    private List<T> list;

    public ListaOrdenada() {
        this.list = new ArrayList<>();
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public void agregar(T elemento) {

        int indice = Collections.binarySearch(list, elemento);

        if (indice < 0) {
            indice = -(indice + 1);
        }


        list.add(indice, elemento);
        System.out.println("✅ Agregado: " + elemento.toString() + " en índice " + indice);
    }

    public void eliminar (T elemento) {
        if (list.remove(elemento)){
            System.out.println("❌ Eliminado: " + elemento.toString());
        } else {
            System.out.println("ℹ️ No se encontró el elemento para eliminar: " + elemento.toString());
        }
    }

    public T obtenerElemento(int indice) throws IndexOutOfBoundsException {
        if (indice < 0 || indice >= list.size()) {
            throw new IndexOutOfBoundsException("Índice fuera del rango: " + indice);
        }
        return list.get(indice);
    }

    @Override
    public String toString() {
        return "Lista Ordenada: " + list;
    }



}
