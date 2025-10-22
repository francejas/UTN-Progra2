public class Alumno {
    private String nombre;
    private String nacionalidad;

    public Alumno(String nombre, String nacionalidad) {
        // Validación 1: Nombre no vacío
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("❌ ERROR: El nombre del alumno no puede estar vacío.");
        }
        // Validación 2: Nacionalidad no vacía (Requisito de la tarea)
        if (nacionalidad == null || nacionalidad.trim().isEmpty()) {
            throw new IllegalArgumentException("❌ ERROR: La nacionalidad del alumno no puede estar vacía.");
        }
        this.nombre = nombre.trim();
        this.nacionalidad = nacionalidad.trim();
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    // Métodos esenciales para la gestión de la lista (borrar duplicados, etc.)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        // Dos alumnos son iguales si tienen el mismo nombre y nacionalidad
        return nombre.equals(alumno.nombre) && nacionalidad.equals(alumno.nacionalidad);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(nombre, nacionalidad);
    }

    @Override
    public String toString() {
        return nombre + " (" + nacionalidad + ")";
    }
}