package Libros;

public class Libro {
    private static int contadorId = 0; // Variable estática para generar IDs únicos
    private final int id; // Final porque el ID no debe cambiar después de la creación
    private String titulo;
    private String autor;
    private double precio;
    private int copias;

    // Constructor que inicializa el libro y asigna ID automáticamente
    public Libro(String titulo, String autor, double precio, int copias) {
        this.id = ++contadorId; // Incrementa y asigna el ID automáticamente
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.copias = copias;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    // Método para vender copias
    public void vender(int cantidad) {
        if (copias >= cantidad) {
            copias -= cantidad;
            System.out.println("Venta realizada: " + cantidad + " copias vendidas.");
        } else {
            System.out.println("Operación no posible. Solo hay " + copias + " copias disponibles.");
        }
    }

    // Método para incrementar stock
    public void incrementarStock(int cantidad) {
        copias += cantidad;
        System.out.println("Stock incrementado en " + cantidad + " copias.");
    }

    // Método para mostrar detalles del libro
    public void mostrarDetalles() {
        System.out.println("Libro[id=" + id +
                ", título=" + titulo +
                ", autor=" + autor +
                ", precio=" + precio +
                ", copias disponibles=" + copias + "]");
    }
}