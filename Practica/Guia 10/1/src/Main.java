import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("--- Ingrese los datos de la Primera Persona ---");

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.print("Sexo (H/M): ");
        // Leemos la línea y tomamos el primer carácter.
        char sexo = sc.nextLine().toUpperCase().charAt(0);

        System.out.print("Peso (kg): ");
        double peso = sc.nextDouble();
        sc.nextLine();

        System.out.print("Altura (m): ");
        double altura = sc.nextDouble();
        sc.nextLine();

        Persona persona1 = new Persona(nombre,edad,sexo,peso,altura);

        Persona persona2 = new Persona(nombre, edad, sexo);

        Persona persona3 = new Persona();
        persona3.setNombre("Clara");
        persona3.setEdad(35);
        persona3.setSexo('M');
        persona3.setPeso(65.0);
        persona3.setAltura(1.68);



    }
}