public enum Precio {
    LOW(500),
    MEDIUM(1000),
    HIGH(1500);

    private double precio;

    Precio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
