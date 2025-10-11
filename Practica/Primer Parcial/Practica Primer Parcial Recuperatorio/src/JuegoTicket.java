public class JuegoTicket extends Juego{
    private int cantTicket;

    public JuegoTicket(String nombre, Precio precio, Categoria categoria, int cantTicket) {
        super(nombre, precio, categoria);
        this.cantTicket = cantTicket;
    }

    public int getCantTicket() {
        return cantTicket;
    }

    public void setCantTicket(int cantTicket) {
        this.cantTicket = cantTicket;
    }

    @Override
    public String toString() {
        return "JuegoTicket{" +
                "cantTicket=" + cantTicket +
                "} " + super.toString();
    }
}
