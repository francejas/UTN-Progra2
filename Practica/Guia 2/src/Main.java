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

        /// 6
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Buenos dias, " + nombre);

        /// 7

        System.out.print("Ingrese velocidad: ");
        int velocidadKm= scanner.nextInt();
        scanner.nextLine();
        int velocidadMS=velocidadKm*1000/3600;
        System.out.println("Velocidad ingresada: " + velocidadKm);
        System.out.println("Velocidad cambiada: " + velocidadMS);



    }
}