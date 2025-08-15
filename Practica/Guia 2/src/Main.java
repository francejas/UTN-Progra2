import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /// 1
/*



        System.out.print("Ingrese un valor: ");
        int N = scanner.nextInt();
        scanner.nextLine();

        System.out.println("N= " + N);
        System.out.println("N incrementado en 77= " +(N+77));
        int aux;
        aux=N;
        N=3;
        System.out.println("N reducido a 3= " +N);
        aux=aux*2;
        N=aux;
        System.out.println("N duplicado= " +N);
*/
        /// 2
        /*
        System.out.print("Ingrese un valor: ");
        int A= scanner.nextInt();
        scanner.nextLine();
        if(A % 2 == 0){
            System.out.println("A= " +A + " es par");
        } else {
            System.out.println("A= " +A +" es impar");
        }
*/
        /// 3
        /*
        System.out.print("Ingrese un valor: ");
        int B=scanner.nextInt();
        scanner.nextLine();

        if(B>=0){
            System.out.println("B= " +B + " es postivo");
        }else {
            System.out.println("B= " +B + " es negativo");
        }
        */

        /// 4
        /*
        System.out.print("Ingrese un caracter: ");

        char character = scanner.next().charAt(0);
        int asciiValor=character;
        System.out.println("Valor ASCII de " + character + " es: " +asciiValor);
        */

        /// 5
/*
        System.out.print("Ingrese un valor: ");
        int C= scanner.nextInt();
        scanner.nextLine();
        if(C>=0){
            System.out.println("C= " +C + " es positivo");
        }else {
            System.out.println("C= " +C + " es negativo");
        }

        if (C % 2==0){
            System.out.println("C= " +C + " es par");
        }else {
            System.out.println("C= " +C + " es impar");
        }

        if (C % 5==0){
            System.out.println("C= " +C + " es multiplo de 5");
        }else {
            System.out.println("C= " +C + " no es multiplo de 5");
        }
        if (C % 10==0){
            System.out.println("C= " +C + " es multiplo de 10");
        }else {
            System.out.println("C= " +C + " no es multiplo de 10");
        }

        if (C>100){
            System.out.println("C= " +C + " es mayor a 100");
        }else {
            System.out.println("C= " +C + " es menor a 100");
        }

 */

        /// 5 optimizado
        /*
        System.out.print("Ingrese un valor: ");
        int C= scanner.nextInt();
        scanner.nextLine();

        //Positivo o negativo
        String signo = (C>=0) ? "positivo":"negativo";

        //Par o impar
        String paridad = (C % 2 == 0) ? "par" : "impar";

        // Múltiplos
        String multiplo5 = (C % 5 == 0) ? "es múltiplo de 5" : "no es múltiplo de 5";
        String multiplo10 = (C % 10 == 0) ? "es múltiplo de 10" : "no es múltiplo de 10";

        // Mayor o menor que 100
        String comparacion100 = (C > 100) ? "mayor a 100" : "menor a 100";

        // Mostrar todo junto
        System.out.println("C = " + C + ": " + signo + ", " + paridad + ", " + multiplo5 + ", " + multiplo10 + ", " + comparacion100);
        */


        /// 6
        /*
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Buenos dias, " + nombre);
        */

        /// 7
/*
        System.out.print("Ingrese velocidad en Km/h: ");
        double velocidadKm = scanner.nextDouble();
        scanner.nextLine();

        double velocidadMS = velocidadKm * 1000 / 3600;

        System.out.println("Velocidad ingresada: " + velocidadKm + " Km/h");
        System.out.println("Velocidad en m/s: " + velocidadMS + " m/s");

        //Con 2 decimales

        System.out.println("Velocidad ingresada: " + velocidadKm + " Km/h");
        System.out.printf("Velocidad en m/s: %.2f m/s\n", velocidadMS);

*/

        /// 8
        /*
        System.out.print("Ingrese un número de 3 cifras: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        // Extraer cifras
        int centenas = numero / 100;              // primer dígito
        int decenas = (numero / 10) % 10;          // segundo dígito
        int unidades = numero % 10;                // tercer dígito

        // Mostrar resultados
        System.out.println("Centenas: " + centenas);
        System.out.println("Decenas: " + decenas);
        System.out.println("Unidades: " + unidades);
*/
        /// 9
/*
        System.out.print("Ingrese un numero de 5 cifras: ");

        int numero= scanner.nextInt();
        scanner.nextLine();

        String string = String.valueOf(numero);
        //tambien puede ser
        String string = Integer.toString(numero);

        for (int i = 0; i < string.length(); i++) {
            if(i %2 == 0){
                System.out.println(string.charAt(i));
            }
        }


        System.out.print("Ingrese un numero de 5 cifras: ");
        int numero= scanner.nextInt();
        scanner.nextLine();

        Integer n = numero;

        String string = Integer.toString(n);

        String string = String.valueOf(numero);
        //tambien puede ser
        String string = Integer.toString(numero);

        for (int i = 0; i < string.length(); i++) {
            if(i %2 == 0){
                System.out.println(string.charAt(i));
            }
        }
*/
        /// 10
/*
        System.out.println("Ingrese Hora: ");
        int hora = scanner.nextInt();

        System.out.println("Ingrese Minutos: ");
        int minutos = scanner.nextInt();

        System.out.println("Ingrese Segundos: ");
        int segundos = scanner.nextInt();

        if ((hora >= 0 && hora < 24) &&
                (minutos >= 0 && minutos < 60) &&
                (segundos >= 0 && segundos < 60)) {
            System.out.println("La hora es válida.");
        } else {
            System.out.println("La hora NO es válida.");
        }

*/
        /// 11
        /*
        System.out.println("Ingrese nombre: ");
String nombre = scanner.nextLine();

System.out.println("Ingrese edad: ");
int edad = scanner.nextInt();

System.out.println("Ingrese salario: ");
double salario = scanner.nextDouble();

double salarioFinal = salario;

if (edad < 16) {
    System.out.println(nombre + " no tiene edad para trabajar.");
} else {
    if (edad >= 19 && edad <= 50) {
        salarioFinal += salario * 0.05;
    } else if (edad >= 51 && edad <= 60) {
        salarioFinal += salario * 0.10;
    } else if (edad > 60) {
        salarioFinal += salario * 0.15;
    }
    System.out.println(nombre + " cobrará: $" + salarioFinal);
}

*/

        /// 12
/*
        //Arreglo ya inicializado
        int numeros[]={1,2,3,4,5};
        int suma=0;
        for (int i = 0; i < numeros.length; i++) {
            suma+=numeros[i];
        }

        double promedio=(double)suma/ numeros.length;
        System.out.println("El promedio es: " + promedio);

        //Arreglo ingresado por teclado
        System.out.print("Ingrese la cantidad de números: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        int[] numeros = new int [n];
        int suma = 0 ;

        // Llenar arreglo
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            scanner.nextLine();
            suma += numeros[i];
        }

        double promedio = (double) suma / n;
        System.out.println("El promedio es: " + promedio);

*/

        /// 13
        /*
        System.out.print("Ingrese un numero:");
        int numero= scanner.nextInt();
        scanner.nextLine();

        int suma=0;

        for (int i = 1; i <= numero ; i++) {
            suma=suma+i;
        }

        System.out.println("Suma: " + suma);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        int suma = numero * (numero + 1) / 2;

        System.out.println("Suma: " + suma);
*/

        /// 14


        
    }
}

