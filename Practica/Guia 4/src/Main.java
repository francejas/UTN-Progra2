import Libros.Libro;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        ejercicio4();

    }
    public static void ejercicio1(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese radio de circunferencia:");
        double radio=sc.nextDouble();
        sc.nextLine();
        double longitud=2*Math.PI*radio;
        double area=Math.PI*Math.pow(radio,2);
        System.out.printf("Longitud de circunferencia: %.2f\n", longitud);
        System.out.printf("Área de circunferencia: %.2f\n", area);

        sc.close();
    }

    public static void ejercicio2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cateto A:");
        double a= sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingrese cateto B:");
        double b= sc.nextDouble();
        sc.nextLine();

        double hipotenusa = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.printf("La hipotenusa es: %.2f\n", hipotenusa);

        sc.close();
    }

    public static void ejercicio3() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese radio: ");
        double radio = sc.nextDouble();

        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);

        System.out.printf("El volumen de la esfera es: %.2f\n", volumen);

        sc.close();
    }

    public static void ejercicio4() {
        Scanner sc = new Scanner(System.in);

        // 1. Inicializar libros
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 500, 10);
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 700, 5);

        // 2. Imprimir detalles de ambos libros
        System.out.println("=== DETALLES INICIALES DE LOS LIBROS ===");
        libro1.mostrarDetalles();
        libro2.mostrarDetalles();

        // 3. Vender 3 copias del primer libro
        System.out.println("\n=== VENDIENDO 3 COPIAS DEL PRIMER LIBRO ===");
        libro1.vender(3);

        // 4. Imprimir detalles del primer libro
        System.out.println("\n=== DETALLES DEL PRIMER LIBRO DESPUÉS DE LA VENTA ===");
        libro1.mostrarDetalles();

        // 5. Intentar vender 8 copias del segundo libro
        System.out.println("\n=== INTENTANDO VENDER 8 COPIAS DEL SEGUNDO LIBRO ===");
        libro2.vender(8);

        // 6. Incrementar en 5 la cantidad de copias del segundo libro
        System.out.println("\n=== INCREMENTANDO STOCK DEL SEGUNDO LIBRO ===");
        libro2.incrementarStock(5);

        // 7. Imprimir detalles del segundo libro
        System.out.println("\n=== DETALLES FINALES DEL SEGUNDO LIBRO ===");
        libro2.mostrarDetalles();

        sc.close();
    }
}