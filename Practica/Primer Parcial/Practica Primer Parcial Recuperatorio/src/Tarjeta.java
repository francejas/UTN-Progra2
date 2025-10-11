import java.util.UUID;

public class Tarjeta {
    private UUID ID;
    private double saldo;
    private int ticketsGanados;
    private Titular titular;

    public Tarjeta(Titular titular) {
        this.ID = UUID.randomUUID();
        this.saldo = 0;
        this.ticketsGanados = 0;
        this.titular = titular;
    }

    public UUID getID() {
        return ID;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getTicketsGanados() {
        return ticketsGanados;
    }

    public void setTicketsGanados(int ticketsGanados) {
        this.ticketsGanados = ticketsGanados;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }


}
