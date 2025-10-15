import java.util.HashMap;
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

        HashMap<String, Persona> registroPersonas = new HashMap<>();

        registroPersonas.put(persona1.getDNI(), persona1);
        registroPersonas.put(persona2.getDNI(), persona2);
        registroPersonas.put(persona3.getDNI(), persona3);

        for (Persona p : registroPersonas.values()) {
            int resultado = p.calcularIMC();
            String mensaje;
            if (resultado == Persona.BAJO_PESO) {
                mensaje = "está por **debajo de su peso ideal** (Resultado: -1).";
            } else if (resultado == Persona.PESO_IDEAL) {
                mensaje = "está en su **peso ideal** (Resultado: 0).";
            } else {
                mensaje = "tiene **sobrepeso** (Resultado: 1).";
            }

            System.out.println(p.getNombre() + " (DNI: " + p.getDNI() + "): " + mensaje);
        }

        sc.close();
    }
}