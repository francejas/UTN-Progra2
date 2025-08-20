package Empleado;

public class Empleado {
    public String dni;
    public String nombre;
    public String apellido;
    public Double salario;


    public Empleado(String dni, String nombre, String apellido,Double salario){
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.salario=salario;

    }

    public Empleado(String dni, String nombre, String apellido, int salario) {
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.salario=(double)salario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public double calcularSalarioAnual(){
        return salario*12;
    }

    public void aumentarSalario(double porcentaje){
        salario=salario+(salario*porcentaje/100);
    }




}
import Empleado.Empleado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 =new Empleado("23456345","Carlos","Gutiérrez",25000);
        Empleado empleado2 =new Empleado("34234123","Ana","Sánchez,",27500);

        System.out.println("Empleado 1:");
        System.out.println("Nombre: "+ empleado1.getNombre());
        System.out.println("Apellido: "+ empleado1.getApellido());
        System.out.println("DNI: "+ empleado1.getDni());
        System.out.println("Salario: "+ empleado1.getSalario());

        //System.out.println("Empleado 1: Nombre: "+ empleado1.getNombre() + "Apellido: "+empleado1.getApellido()+);
        System.out.println("");
        System.out.println("Empleado 2:");
        System.out.println("Nombre: "+ empleado2.getNombre());
        System.out.println("Apellido: "+ empleado2.getApellido());
        System.out.println("DNI: "+ empleado2.getDni());
        System.out.println("Salario: "+ empleado2.getSalario());

        System.out.println("Salario inicial de Empleado 1:"+ empleado1.getSalario());
        System.out.println("Salario anual de Empleado 1:"+ empleado1.calcularSalarioAnual());
        empleado1.aumentarSalario(15.0);
        System.out.println("Salario aumentado de Empleado 1:"+ empleado1.getSalario());
        System.out.println("Salario anual aumentado de Empleado 1:"+ empleado1.calcularSalarioAnual());

    }
}
