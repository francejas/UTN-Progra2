public class Staff extends Persona {
    private double salario;
    private String turno;

    public Staff(String DNI, String nombre, String apellido, String email, String direccion, double salario, String turno) {
        super(DNI, nombre, apellido, email, direccion);
        this.salario = salario;
        this.turno = turno;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "salario=" + salario +
                ", turno='" + turno + '\'' +
                "} " + super.toString();
    }
}
