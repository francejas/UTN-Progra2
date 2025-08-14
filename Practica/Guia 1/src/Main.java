public class Main {
    public static void main(String[] args) {

        ///Ejercicio 1
        /*
        int numN = 10;
        double numA = 10.4;
        char numC = 'c';



        System.out.println("Valor de numN: " + numN);
        System.out.println("Valor de numA: " + numA);
        System.out.println("Valor de numC: " + numC);
        System.out.println("numN + numA = " + numN + " + " + numA + " = " + (numN + numA));
        System.out.printf("numN + numA = %d + %.2f = %.2f%n", numN, numA, numN + numA);
        System.out.println("numA - numN = " + numA + " - " + numN + " = " + (numA-numN));
        System.out.printf("numA - numN = %.2f - %d = %.2f%n",numA, numN,(numA-numN));
        System.out.println("numC = "+ numC);
        System.out.printf("numC = %c",numC);

         */


        ///Ejercicio 2

        /*

        // Variables enteras
        int numX = 8;
        int numY = 3;

        // Variables decimales
        double numN = 5.5;
        double numM = 2.2;

        // Operaciones con numX y numY
        System.out.println("numX + numY = " + (numX + numY));
        System.out.println("numX - numY = " + (numX - numY));
        System.out.println("numX * numY = " + (numX * numY));
        System.out.println("numX / numY = " + (numX / numY));  // División entera
        System.out.println("numX % numY = " + (numX % numY));  // Resto

        // Operaciones con numN y numM
        System.out.println("numN + numM = " + (numN + numM));
        System.out.println("numN - numM = " + (numN - numM));
        System.out.println("numN * numM = " + (numN * numM));
        System.out.println("numN / numM = " + (numN / numM));
        System.out.println("numN % numM = " + (numN % numM));

        // Operaciones combinadas
        System.out.println("numX + numN = " + (numX + numN));
        System.out.println("numY * numM = " + (numY * numM));
        System.out.println("numX / numM = " + (numX / numM));
        System.out.println("numN / numY = " + (numN / numY));

        */

        ///Ejercicio 3
/*
        // Declarar y asignar valores
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;

        System.out.println("Valores iniciales:");
        System.out.println("A = " + A + ", B = " + B + ", C = " + C + ", D = " + D);

        // Guardar los valores originales en variables temporales
        int tempB = B; // Guarda valor original de B
        int tempC = C; // Guarda valor original de C
        int tempA = A; // Guarda valor original de A
        int tempD = D; // Guarda valor original de D

        // Reasignaciones según lo pedido
        B = tempC; // B toma el valor de C (original)
        C = tempA; // C toma el valor de A (original)
        A = tempD; // A toma el valor de D (original)
        D = tempB; // D toma el valor de B (original)

        System.out.println("\nValores finales:");
        System.out.println("A = " + A + ", B = " + B + ", C = " + C + ", D = " + D);


*/
/*
        // Declarar y asignar valores
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;

        System.out.println("Valores iniciales:");
        System.out.println("A = " + A + ", B = " + B + ", C = " + C + ", D = " + D);

        // Variable auxiliar
        int aux;

        // B toma el valor de C
        aux = C;
        B = aux;

        // C toma el valor de A
        aux = A;
        C = aux;

        // A toma el valor de D
        aux = D;
        A = aux;

        // D toma el valor de B (usamos el valor nuevo de B)
        aux = B;
        D = aux;

        System.out.println("\nValores finales:");
        System.out.println("A = " + A + ", B = " + B + ", C = " + C + ", D = " + D);

 */

        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;

        System.out.println("Valores iniciales:");
        System.out.println("A = " + A + ", B = " + B + ", C = " + C + ", D = " + D);

        // Guardar valor original de B
        int originalB = B;

        // B toma el valor de C
        B = C;

        // C toma el valor de A
        C = A;

        // A toma el valor de D
        A = D;

        // D toma el valor original de B
        D = originalB;

        System.out.println("\nValores finales:");
        System.out.println("A = " + A + ", B = " + B + ", C = " + C + ", D = " + D);


    }
}
