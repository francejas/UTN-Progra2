package Libro;

import Autor.Autor;

public class Libro {
    private String titulo;
    private double precio;
    private int stock;
    private Autor autor;

    public Libro(String titulo, double precio, int stock, Autor autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }


    // Método para mostrar detalles del libro
    public void mostrarLibro() {
        System.out.println("Libro[título=" + titulo +
                ", precio=" + precio +
                ", stock=" + stock + "]");
    }

    public void mostrarPrecio(){
        System.out.println("El libro, "+titulo+" de "+autor.getNombre()+" "+autor.getApellido()+". Se vende a precio $"+precio+" pesos.");
    }

    // Método para incrementar stock, diferencia entre this.stock y stock=
    public void incrementarStock(int cantidad) {
        this.stock += cantidad;
        System.out.println("Stock incrementado en " + cantidad + " copias.");
    }

    /*
    public void cambiarPrecio(double nuevoPrecio){
        double precioViejo=precio;
        precio=nuevoPrecio;
        System.out.println("Se cambio el precio de $"+precioViejo+" a $"+nuevoPrecio);
    }
*/

    public void cambiarPrecio(double nuevoPrecio){
        double precioViejo=precio;
        setPrecio(nuevoPrecio);
        System.out.println("Se cambio el precio de $"+precioViejo+" a $"+nuevoPrecio);
    }

}
