import java.util.ArrayList;
import java.util.HashMap;

public class Gestor {
    private HashMap<Integer, Persona> registroPersonas;

    public Gestor() {
        this.registroPersonas = new HashMap<>();
    }

    public HashMap<Integer, Persona> getRegistroPersonas() {
        return registroPersonas;
    }

    public void setRegistroPersonas(HashMap<Integer, Persona> registroPersonas) {
        this.registroPersonas = registroPersonas;
    }

    public boolean altaPersona(Persona persona){
        if(registroPersonas.containsKey(persona.getDNI())){
            return false;
        }
        registroPersonas.put(persona.getDNI(), persona);
        return true;
    }

    public boolean bajaPersona(int dni) {
        if (registroPersonas.containsKey(dni)) {
            registroPersonas.remove(dni);
            return true;
        }
        return false;
    }

    public boolean modificarPersona(int dni, String nuevoNombre, int nuevaEdad) {
        if (registroPersonas.containsKey(dni)) {
            Persona p = registroPersonas.get(dni);
            p.setNombre(nuevoNombre);
            p.setEdad(nuevaEdad);
            return true;
        }
        return false;
    }

    public void agregarObjeto(Persona persona) {
        registroPersonas.put(persona.getDNI(), persona);
    }

    public void agregarListaPersonas(ArrayList<Persona> listaPersonas) {
        for (Persona persona : listaPersonas) {
            registroPersonas.put(persona.getDNI(), persona);
        }
    }

    /**
     * Devuelve la estructura ordenada por edad.
     * Se usa un Map ordenado (LinkedHashMap) para mantener la asociación DNI->Persona.
     * @return Un LinkedHashMap con las Personas ordenadas por edad.
     */
    public Map<Integer, Persona> getRegistroOrdenadoPorEdad() {
        // 1. Obtener los valores (objetos Persona) del HashMap
        List<Persona> listaOrdenable = new ArrayList<>(registroPersonas.values());

        // 2. Ordenar la lista (usa el método compareTo implementado en Persona)
        Collections.sort(listaOrdenable);

        // 3. Crear un nuevo Map para almacenar los datos ordenados
        // Se usa LinkedHashMap para mantener el orden de inserción de los elementos
        Map<Integer, Persona> mapaOrdenado = new LinkedHashMap<>();

        // 4. Llenar el nuevo Map con los objetos Persona ordenados
        for (Persona persona : listaOrdenable) {
            mapaOrdenado.put(persona.getDni(), persona);
        }

        return mapaOrdenado;
    }



}
