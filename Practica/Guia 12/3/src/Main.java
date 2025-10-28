public class Main {
    public static void main(String[] args) {

        // --- 1. Prueba con Números Enteros (Integer) ---
        System.out.println("--- 1. Pruebas con Integer ---");
        OperacionMatematica<Integer> opEntera = new OperacionMatematica<>();

        Integer a = 25;
        Integer b = 5;
        opEntera.setNumeros(a, b);

        System.out.println(a + " + " + b + " = " + opEntera.sumar());         // 30.0
        System.out.println(a + " - " + b + " = " + opEntera.restar());        // 20.0
        System.out.println(a + " * " + b + " = " + opEntera.multiplicar());   // 125.0
        System.out.println(a + " / " + b + " = " + opEntera.dividir());        // 5.0

        System.out.println("\n" + "-".repeat(40) + "\n");

        // --- 2. Prueba con Números Decimales (Double) ---
        System.out.println("--- 2. Pruebas con Double ---");
        OperacionMatematica<Double> opDecimal = new OperacionMatematica<>();

        Double x = 15.5;
        Double y = 2.5;
        opDecimal.setNumeros(x, y);

        System.out.println(x + " + " + y + " = " + opDecimal.sumar());         // 18.0
        System.out.println(x + " - " + y + " = " + opDecimal.restar());        // 13.0
        System.out.println(x + " * " + y + " = " + opDecimal.multiplicar());   // 38.75
        System.out.println(x + " / " + y + " = " + opDecimal.dividir());        // 6.2

        System.out.println("\n" + "-".repeat(40) + "\n");

        // --- 3. Prueba con Manejo de Errores (División por Cero) ---
        System.out.println("--- 3. Prueba de División por Cero ---");
        OperacionMatematica<Float> opError = new OperacionMatematica<>();

        opError.setNumeros(100.0f, 0.0f);

        try {
            System.out.println("100.0 / 0.0 = " + opError.dividir());
        } catch (ArithmeticException e) {
            System.err.println("❌ Error: " + e.getMessage());
        }
    }
}