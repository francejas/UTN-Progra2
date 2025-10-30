import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombreCurso;
    private int codigo;
    private List<Persona> alumnosInscriptos;

    public Curso() {
        this.alumnosInscriptos = new ArrayList<>();
    }

    public Curso(String nombreCurso, int codigo) {
        this.nombreCurso = nombreCurso;
        this.codigo = codigo;
        this.alumnosInscriptos = new ArrayList<>();
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<Persona> getAlumnosInscriptos() {
        return alumnosInscriptos;
    }

    public void setAlumnosInscriptos(List<Persona> alumnosInscriptos) {
        this.alumnosInscriptos = alumnosInscriptos;
    }
    public boolean agregarAlumno(Persona alumno)
    {
        return alumnosInscriptos.add(alumno);
    }

    public boolean eliminarAlumno (Persona alumno)
    {
        return alumnosInscriptos.remove(alumno);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombreCurso='" + nombreCurso + '\'' +
                ", codigo=" + codigo +
                ", \n alumnosInscriptos=" + alumnosInscriptos +
                '}';
    }

}
