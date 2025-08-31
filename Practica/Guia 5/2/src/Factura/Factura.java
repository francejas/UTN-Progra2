package Factura;

import Cliente.Cliente;

import java.time.LocalDateTime;
import java.util.UUID;

public class Factura {
    private UUID uuid;
    private double montoTotal;
    private LocalDateTime fecha;
    private Cliente cliente;

    public Factura(double montoTotal, Cliente cliente) {
        this.uuid = UUID.randomUUID();
        this.montoTotal = montoTotal;
        this.fecha = LocalDateTime.now();
        this.cliente = cliente;
    }

    public UUID getUuid() {
        return uuid;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    @Override
    public String toString() {
        return "Factura[id=" + uuid +
                ", fecha=" + fecha +
                ", monto=" + montoTotal +
                ", montoDesc=" + (montoTotal-(montoTotal*(cliente.getDescuento()/100))) +
                ", Cliente[id=" + cliente.getUuid() +
                ", nombre=" + cliente.getNombre() +
                ",email=" + cliente.getEmail() +
                "descuento=" + cliente.getDescuento() + "]].";
    }

}
