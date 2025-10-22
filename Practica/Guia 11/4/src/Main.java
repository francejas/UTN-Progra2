public class Main {
    public static void main(String[] args) {
        Colegio miColegio = new Colegio();

        // --- 1. Agregar Alumnos ---
        System.out.println("--- 1. Pruebas de agregarAlumno ---");
        miColegio.agregarAlumno(new Alumno("Ana Perez", "Argentina"));
        miColegio.agregarAlumno(new Alumno("Luis Garcia", "Mexicana"));
        miColegio.agregarAlumno(new Alumno("Carlos Lopez", "argentina")); // Mismo país, diferente capitalización
        miColegio.agregarAlumno(new Alumno("Maria Soto", "Colombiana"));
        miColegio.agregarAlumno(new Alumno("Juan Ruiz", "Mexicana"));

        // Prueba de validación de duplicados
        miColegio.agregarAlumno(new Alumno("Luis Garcia", "Mexicana"));

        // Prueba de validación en constructor (debería lanzar excepción)
        try {
            miColegio.agregarAlumno(new Alumno("Alumno Sin Nación", ""));
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        // --- 2. Ver Nacionalidades Específicas ---
        System.out.println("\n--- 2. Pruebas de verNacionalidad ---");
        miColegio.verNacionalidad("Argentina");  // Debería contar 1 ("Argentina")
        miColegio.verNacionalidad("argentina"); // Debería contar 1 ("argentina")
        miColegio.verNacionalidad("peruana");    // Debería contar 0
        miColegio.verNacionalidad(null);         // Prueba de validación de entrada nula

        // --- 3. Contar Nacionalidades Diferentes ---
        System.out.println("\n--- 3. Pruebas de cuantos() ---");
        miColegio.cuantos(); // Debería ser 4 ("Argentina", "Mexicana", "argentina", "Colombiana")

        // --- 4. Ver Todos ---
        System.out.println("\n--- 4. Pruebas de verTodos() ---");
        miColegio.verTodos();

        // --- 5. Borrar Alumnos ---
        System.out.println("\n--- 5. Pruebas de borrar(Alumno) ---");
        Alumno alumnoABorrar = new Alumno("Luis Garcia", "Mexicana");
        Alumno alumnoInexistente = new Alumno("Pepe El Bicho", "Española");

        miColegio.borrar(alumnoABorrar);      // Borrado exitoso
        miColegio.borrar(alumnoInexistente);  // Prueba de validación (no existe)
        miColegio.borrar(null);               // Prueba de validación (nulo)

        // --- 6. Resumen Final ---
        System.out.println("\n--- 6. Resumen Final ---");
        miColegio.cuantos();
        miColegio.verTodos();
    }
}