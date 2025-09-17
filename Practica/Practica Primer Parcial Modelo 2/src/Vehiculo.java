import java.util.Objects;

public abstract class Vehiculo implements Preciable{
        private String patente;
        private String marca;
        private String modelo;
        private double consumo;
        private int cantRuedas;
        private double precio;

    public Vehiculo(String patente, String marca, String modelo, double consumo, int cantRuedas, double precio) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.cantRuedas = cantRuedas;
        this.precio = precio;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public int getCantRuedas() {
        return cantRuedas;
    }

    public void setCantRuedas(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    @Override
    public String toString() {
        return "Vehiculo{" +
                "patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", consumo=" + consumo +
                ", cantRuedas=" + cantRuedas +
                ", precio=" + precio +
                '}';
    }
}
