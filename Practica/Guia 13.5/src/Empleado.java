import org.json.JSONException;
import org.json.JSONObject;

import java.util.Objects;

public class Empleado {
    private String nombre;
    private int id;
    private double salario;
    private String departamento;

    public Empleado() {
    }

    public Empleado(String nombre, int id, double salario, String departamento) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
        this.departamento = departamento;
    }

    public Empleado(JSONObject jsonEmpleado){
        try {
            id = jsonEmpleado.getInt("id");
            nombre = jsonEmpleado.getString("nombre");
            salario = jsonEmpleado.getInt("salario");
            departamento = jsonEmpleado.getString("departamento");
        } catch (JSONException e){
            e.printStackTrace();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return id == empleado.id && Double.compare(salario, empleado.salario) == 0 && Objects.equals(nombre, empleado.nombre) && Objects.equals(departamento, empleado.departamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, id, salario, departamento);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", salario=" + salario +
                ", departamento='" + departamento + '\'' +
                '}';
    }

    public JSONObject toJSON(){
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject();

            jsonObject.put("id", id);
            jsonObject.put("nombre", nombre);
            jsonObject.put("salario", salario);
            jsonObject.put("departamento", departamento);
        }catch (JSONException e){
            e.printStackTrace();
        }
        return jsonObject;
    }


}
