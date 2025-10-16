import java.util.Objects;

public class PersonaBis  {
    private String nombre;
    private int edad;
    private String DNI;

    public PersonaBis(String nombre,String DNI, int edad) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "PersonaBis{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PersonaBis that)) return false;
        return edad == that.edad && Objects.equals(nombre, that.nombre) && Objects.equals(DNI, that.DNI);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, DNI);
    }
}
