import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Gestor gestora = new Gestor();

        // 1. Crear objetos para la prueba
        Persona p1 = new Persona("Ana", 12345678, 30);
        Persona p2 = new Persona("Juan", 87654321, 25);
        Persona p3 = new Persona("Marta", 11223344, 40);

        // 2. Usar ABM: Alta
        gestora.altaPersona(p1);
        gestora.altaPersona(p2);
        System.out.println("Registro inicial (desordenado por inserción): " + gestora.getRegistroPersonas().values());

        // 3. Método adicional: Agregar objeto ya creado
        gestora.agregarObjeto(p3);
        System.out.println("Después de agregar un objeto: " + gestora.getRegistroPersonas().size() + " personas.");

        // 4. Método adicional: Agregar una lista
        ArrayList<Persona> nuevasPersonas = new ArrayList<>();
        nuevasPersonas.add(new Persona("Pedro", 98765432, 22));
        nuevasPersonas.add(new Persona("Luisa", 54321098, 38));

        gestora.agregarListaPersonas(nuevasPersonas);
        System.out.println("Después de agregar una lista: " + gestora.getRegistroPersonas().size() + " personas.");

        // 5. Usar ABM: Modificación
        gestora.modificarPersona(12345678, "Ana María", 31);
        System.out.println("Ana modificada: " + gestora.getRegistroPersonas().get(12345678));

        // 6. Usar ABM: Baja
        gestora.bajaPersona(87654321); // Borra a Juan
        System.out.println("Después de la baja: " + gestora.getRegistroPersonas().size() + " personas.");

        System.out.println("\n------------------------------------------------------");

        // 7. Método de ordenación (CLAVE)
        Map<Integer, Persona> registroOrdenado = gestora.getRegistroOrdenadoPorEdad();

        System.out.println("Registro ORDENADO POR EDAD (Clave=DNI):");
        for (Persona p : registroOrdenado.values()) {
            System.out.println(p);
        }

    }
}