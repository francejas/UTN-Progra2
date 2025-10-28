import java.util.HashSet;
import java.util.Set;

public class Conjunto <T> {
    // Usamos la interfaz Set en lugar de la implementación concreta HashSet.
    private Set<T> conjunto;

    public Conjunto() {
        this.conjunto = new HashSet<>();
    }

    public void agregar (T elemento) {
        if (conjunto.add(elemento)){
            System.out.println("✅ Elemento '" + elemento.toString()+"' agregado.");
        } else {
            System.out.println("⚠️ El elemento '" + elemento.toString()+ "' ya existe en el conjunto. No se agregó.");
        }
    }

    public void eliminar (T elemento) {
        if(conjunto.remove(elemento)){
            System.out.println("❌ Elemento '" + elemento.toString()+"' eliminado.");
        }else {
            System.out.println("ℹ️ El elemento '" + elemento.toString()+ "' que desea eliminar no existe en el conjunto.");
        }
    }

    public boolean buscarElemento (T elemento){
        return conjunto.contains(elemento);
    }

    @Override
    public String toString() {
        return "Contenido del Conjunto: " + conjunto;
    }
}