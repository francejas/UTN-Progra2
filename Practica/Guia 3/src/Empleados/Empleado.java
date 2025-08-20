package Empleados;

public class Empleado {
    private  String nombre;
    private  String apellido;
    private  String dni;
    private  double salario;

    public Empleado(String nombre, String apellido, String dni, double  salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.salario = salario;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getDni() { return dni; }
    public double getSalario() { return salario; }

    public double salarioAnual(){
        return salario*12;
    }

    public void aumentarSalario(double porcentaje){
        salario=salario+(salario*porcentaje/100);
    }

}
