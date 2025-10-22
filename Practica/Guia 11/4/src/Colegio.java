import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Colegio {
    private List<Alumno> listadoAlumnos;

    public Colegio() {
        this.listadoAlumnos = new ArrayList<>();
    }

    // --- MÉTODOS DE GESTIÓN CON VALIDACIONES ---

    public void agregarAlumno(Alumno alumno) {
        // Validación 1: Objeto Alumno no nulo
        if (alumno == null) {
            System.err.println("❌ ERROR: No se puede agregar un alumno nulo.");
            return;
        }

        // Validación 2: Evitar duplicados
        if (listadoAlumnos.contains(alumno)) {
            System.out.println("⚠️ ADVERTENCIA: El alumno " + alumno.getNombre() + " ya se encuentra registrado.");
            return;
        }

        listadoAlumnos.add(alumno);
        System.out.println("✅ Alumno agregado: " + alumno.getNombre());
    }

    public void borrar(Alumno alumno) {
        // Validación 1: Objeto Alumno no nulo
        if (alumno == null) {
            System.err.println("❌ ERROR: No se puede borrar un alumno nulo.");
            return;
        }

        // Validación 2: Comprobar si el alumno existe y borrarlo
        boolean borradoExitoso = listadoAlumnos.remove(alumno);

        if (borradoExitoso) {
            System.out.println("🗑️ Alumno borrado con éxito: " + alumno.getNombre());
        } else {
            // Se valida si el alumno existía
            System.err.println("⚠️ ADVERTENCIA: No se pudo borrar al alumno " + alumno.getNombre() + ". El alumno NO existe en el listado.");
        }
    }

    // --- MÉTODOS DE VISUALIZACIÓN Y CONTEO ---

    public void verNacionalidad(String nacionalidad) {
        // Validación 1: Nacionalidad no nula o vacía
        if (nacionalidad == null || nacionalidad.trim().isEmpty()) {
            System.err.println("❌ ERROR: Debe especificar una nacionalidad válida.");
            return;
        }

        String nacBusqueda = nacionalidad.trim();
        int contador = 0;

        for (Alumno a : listadoAlumnos) {
            if (a.getNacionalidad().equalsIgnoreCase(nacBusqueda)) {
                contador++;
            }
        }

        // Validación 2: Informar si se encontró o no
        if (contador > 0) {
            System.out.println("🌍 Nacionalidad: " + nacBusqueda + " | Alumnos registrados: " + contador);
        } else {
            System.out.println("ℹ️ INFORMACIÓN: No hay alumnos registrados con la nacionalidad '" + nacBusqueda + "'.");
        }
    }

    public void cuantos() {
        // Usamos un Map para almacenar las nacionalidades únicas (Key)
        Map<String, Integer> mapaNacionalidades = new HashMap<>();

        for (Alumno a : listadoAlumnos) {
            // Normalizamos a mayúsculas para contar "argentina" y "Argentina" como una sola
            String nacionalidadNormalizada = a.getNacionalidad().toUpperCase();
            mapaNacionalidades.put(nacionalidadNormalizada, 1); // El valor solo importa para que la clave exista
        }

        // Validación 1: Comprobar si hay alumnos
        if (mapaNacionalidades.isEmpty()) {
            System.out.println("ℹ️ INFORMACIÓN: El colegio no tiene alumnos, por lo tanto, tiene 0 nacionalidades diferentes.");
        } else {
            // El tamaño del Map es el número de nacionalidades diferentes
            System.out.println("🔢 El colegio tiene un total de " + mapaNacionalidades.size() + " nacionalidades diferentes.");
        }
    }

    public void verTodos() {
        // Validación 1: El colegio debe tener alumnos
        if (listadoAlumnos.isEmpty()) {
            System.out.println("ℹ️ INFORMACIÓN: El listado del colegio está vacío.");
            return;
        }

        // Usamos un Map para CONTEO: Clave=Nacionalidad, Valor=Número de alumnos
        Map<String, Integer> mapaConteo = new HashMap<>();

        for (Alumno a : listadoAlumnos) {
            String nacionalidad = a.getNacionalidad();
            // Incrementamos el contador. Usamos getOrDefault para empezar en 0 si es la primera vez.
            mapaConteo.put(
                    nacionalidad,
                    mapaConteo.getOrDefault(nacionalidad, 0) + 1
            );
        }

        // Imprimir los resultados
        System.out.println("\n=== RESUMEN DE ALUMNOS POR NACIONALIDAD ===");
        for (Map.Entry<String, Integer> entrada : mapaConteo.entrySet()) {
            System.out.println("  " + entrada.getKey() + ": " + entrada.getValue() + " alumnos");
        }
        System.out.println("==========================================");
    }
}