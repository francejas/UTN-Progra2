import Autor.Autor;
import Libro.Libro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        //a
        Autor autor1 = new Autor("Joshua","Bloch","joshua@email.com",'M');
        //b
        autor1.mostrarAutor();
        //c
        Libro libro1 = new Libro("Efective Java",450,150,autor1);
        //d
        libro1.mostrarLibro();
        //e
        libro1.cambiarPrecio(500);
        libro1.incrementarStock(50);
        //f
        libro1.getAutor().mostrarAutor();
        //g
        libro1.mostrarPrecio();


        scanner.close();
    }
}