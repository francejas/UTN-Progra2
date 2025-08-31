package Cliente;

import java.util.UUID;

public class Cliente {
    private UUID uuid;
    private String nombre;
    private String email;
    private double descuento;

    public Cliente(String nombre, String email, double descuento) {
        this.uuid = UUID.randomUUID();
        this.nombre = nombre;
        this.email = email;
        this.descuento = descuento;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Cliente[id=" + uuid +
                ", nombre=" + nombre +
                ", email=" + email +
                ", descuento=" + descuento + "]";
    }


}
