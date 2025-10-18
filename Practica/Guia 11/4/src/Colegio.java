import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Colegio {
    private List<Alumno> listadoAlumnos;

    public Colegio(List<Alumno> listadoAlumnos) {
        this.listadoAlumnos = new ArrayList<>();
    }

    public List<Alumno> getListadoAlumnos() {
        return listadoAlumnos;
    }

    public void setListadoAlumnos(List<Alumno> listadoAlumnos) {
        this.listadoAlumnos = listadoAlumnos;
    }

    public void agregarAlumno(Alumno a){
        listadoAlumnos.add(a);
    }

    public void verNacionalidad(String nacionalidad){
        for (Alumno a : listadoAlumnos){
            if (a.getNacionalidad().equalsIgnoreCase(nacionalidad)){
                a.toString();
            }
        }
    }

    public void cuantos(){
        HashMap<String, Integer> mapaNacionalidades = new HashMap<>();

        for (Alumno a : listadoAlumnos){
            String nacionalidadNormalizada = a.getNacionalidad().toUpperCase();
            mapaNacionalidades.put(nacionalidadNormalizada, mapaNacionalidades.getOrDefault(nacionalidadNormalizada, 0 ) + 1);
        }
        if (mapaNacionalidades.isEmpty()) {
            System.out.println("ℹ️ INFORMACIÓN: El colegio no tiene alumnos, por lo tanto, tiene 0 nacionalidades diferentes.");
        } else {
            System.out.println("🔢 El colegio tiene un total de " + mapaNacionalidades.size() + " nacionalidades diferentes.");
        }

    }

    public void borrar (Alumno alumno)  {
        listadoAlumnos.remove(alumno);
    }

    public void verTodos(){
        
    }



}
