import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generamos el número aleatorio entre 1 y 500
        int numeroRand = rand.nextInt(500) + 1;
        int numero = 0;
        int contador = 0;

        do {
            try {
                System.out.println("\nAdivine el numero del 1 al 500:");

                // Lee la entrada y puede lanzar InputMismatchException
                numero = scanner.nextInt();
                contador++;

                // **Lógica de comparación corregida**
                if (numero == numeroRand) {
                    // Si acierta, la condición del do-while se hará falsa y saldrá
                    break; // También se puede usar un break aquí para claridad
                } else if (numero < numeroRand) {
                    System.out.println("El número a adivinar es más grande");
                } else { // numero > numeroRand
                    System.out.println("El número a adivinar es más chico");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: ¡Debes introducir un número entero!");
                scanner.nextLine();
                contador++; // Se cuenta como un intento fallido
            }


        } while (numero != numeroRand);


        System.out.println("\n\u2705 ¡Felicidades! Número adivinado: " + numeroRand);
        System.out.println("Intentos totales: " + contador);
        scanner.close();
    }
}