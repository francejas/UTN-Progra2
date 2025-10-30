public class Main {
    public static void main(String[] args) {
        GestorJSONPersona gestorJSONPersona = new GestorJSONPersona();
        Persona persona = new Persona("Pepe", 15, "43223223", "masculino");
        gestorJSONPersona.personaArchivo(persona);
        // gestorPersona.serializar() convierte el objeto a JSONObject
        // y el metodo estatico grabar() guarda el JSONObject en un archivo con extension .json



        /// EJERCICIO 2 - Lee el archivo persona.json que creaste en el ejerc anterior
        // y convierte el JSON leído de nuevo a un objeto Persona.
        // Objetivos: Leer datos JSON desde un archivo y Convertir JSON a un objeto Java.

        Persona personaLeida= gestorJSONPersona.archivoPersona();
        // gestorPersona.deserializar() recibe el JSONTokener generado al leer el archivo JSON,
        // para poder convertir el JSONObject a un objeto Java
        System.out.println("Persona leida del JSON: " + personaLeida.toString());



    }
}