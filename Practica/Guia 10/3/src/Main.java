import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        HashSet<PersonaBis> registroPersonasHash = new HashSet<>();


        registroPersonasHash.add(new PersonaBis("Elsa", "45678901L", 28));
        registroPersonasHash.add(new PersonaBis("Beto", "12345678A", 22));
        registroPersonasHash.add(new PersonaBis("Carlos", "90123456K", 35));
        registroPersonasHash.add(new PersonaBis("Diana", "56789012F", 40));
        registroPersonasHash.add(new PersonaBis("Ana", "34567890C", 19));

        System.out.println("--- 1. HashSet (Sin orden garantizado) ---");
        for (PersonaBis p : registroPersonasHash) {
            System.out.println(p);
        }

        TreeMap<String, PersonaBis> treeMapPersonas = new TreeMap<>();

        for (PersonaBis p : registroPersonasHash) {
            treeMapPersonas.put(p.getDNI(), p);
        }


        System.out.println("\n--- 2. TreeMap (Ordenado por DNI) ---");


        for (Map.Entry<String, PersonaBis> entry : treeMapPersonas.entrySet()) {
            System.out.println("DNI: " + entry.getKey() + " -> " + entry.getValue());
        }

    }
}