public class Main {
    public static void main(String[] args) {
GestorJSONPersona gestorJSONPersona = new GestorJSONPersona();
        Persona persona = new Persona("Pepe", "15", "43223223", 14);
        
        gestorJSONPersona.personaArchivo(persona);


    }
}