public class Main {
    public static void main(String[] args) {
        GestorJSONPersona gestorJSONPersona = new GestorJSONPersona();
        GestorJSONCurso gestorJSONCurso = new GestorJSONCurso();


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



        /// EJERCICIO 3: Crea una clase Curso con atributos como nombreCurso, código,
        // y una lista de Personas inscritas en el curso.
        // Implementa métodos para agregar y eliminar personas del curso.
        //Luego crea un metodo que convierta un objeto Curso a JSON y guárdalo en un archivo curso.json.
        //Implementa otro metodo que lea el archivo curso.json y convierta el JSON a un objeto Curso.
        //Objetivos: - Guardar en JSON una lista de objetos y luego poder leerla del JSON

        // carga del curso:
        Curso curso = new Curso("Programacion 2", 112323);
        curso.agregarAlumno(new Persona("Maria", 12, "47848983", "femenino"));
        curso.agregarAlumno(new Persona("Marcos", 14, "46343243", "masculino"));
        curso.agregarAlumno(new Persona("Julia", 17, "45434343", "femenino"));

        /// escritura
        gestorJSONCurso.cursoArchivo(curso);

        /// lectura
        Curso cursoArchivo = gestorJSONCurso.archivoCurso();
        System.out.println("Curso leído del JSON: " + cursoArchivo.toString());





    }
}