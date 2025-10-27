public class Main {
    public static void main(String[] args) {
        double x = 10.0;
        double y = 0.0;
        double z = -5.0;

        System.out.println("\n--- División de Punto Flotante ---");

        // 1. Número positivo / 0.0 -> Infinity
        double resultado1 = x / y;
        System.out.println("10.0 / 0.0 = " + resultado1);

        // 2. Número negativo / 0.0 -> -Infinity
        double resultado2 = z / y;
        System.out.println("-5.0 / 0.0 = " + resultado2);

        // 3. 0.0 / 0.0 -> NaN
        double resultado3 = y / y;
        System.out.println("0.0 / 0.0 = " + resultado3);
    }
}