public class EmpleadoTiempoCompleto extends Empleado {
    private int aniosAntiguedad;
    private double sueldoBase;

    public EmpleadoTiempoCompleto(String nombre, int aniosAntiguedad, double sueldoBase) {
        super(nombre);
        this.aniosAntiguedad = aniosAntiguedad;
        this.sueldoBase = sueldoBase;
    }

    public int getAniosAntiguedad() {
        return aniosAntiguedad;
    }

    public void setAniosAntiguedad(int aniosAntiguedad) {
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    @Override
    public double calcularPago() {
        double salarioFinal = 0;

        if (aniosAntiguedad < 2) {
            salarioFinal = sueldoBase;
        } else if (aniosAntiguedad <= 5) {
            salarioFinal = sueldoBase + sueldoBase * 0.05;
        } else if (aniosAntiguedad <= 10) {
            salarioFinal = sueldoBase + sueldoBase * 0.10;
        } else if (aniosAntiguedad <= 15) {
            salarioFinal = sueldoBase + sueldoBase * 0.15;
        } else {
            salarioFinal = sueldoBase + sueldoBase * 0.20;
        }

        return salarioFinal;
    }



}
