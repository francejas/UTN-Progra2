public class Main {
    public static void main(String[] args) {

        ¿Qué está mal en el siguiente bloque de código?

        try{
            Persona p = baseDeDatos.buscar(datos);
            System.out.println(“Los datos pertenecen a: ” + p);
        }
        catch(Exception e) {
            // Maneja cualquiera de las excepciones comprobadas
        }
        catch(RuntimeException e) {
              // Maneja cualquiera de las excepciones no comprobadas
        }


        El error más crítico es que el catch(Exception e) está listado antes del catch(RuntimeException e).

        La clase Exception es la superclase de casi todas las excepciones (tanto comprobadas/checked como no comprobadas/unchecked, incluyendo RuntimeException).

                Cuando el compilador (Java) encuentra el bloque catch(Exception e), sabe que ya ha atrapado cualquier posible excepción que pudiera ser atrapada por el bloque catch(RuntimeException e) que le sigue.

                En esencia, el bloque catch(RuntimeException e) se vuelve inalcanzable o código muerto porque cualquier RuntimeException ya fue atrapada por el catch(Exception e) anterior.

                Esto resultará en un error de compilación (típicamente "Exception RuntimeException has already been caught" o similar).

✅ La corrección: Los bloques catch deben listarse del más específico al más general. La RuntimeException es más específica que la Exception, por lo que el orden correcto debe ser:

        Java

        try {
            Persona p = baseDeDatos.buscar(datos);
            System.out.println("Los datos pertenecen a: " + p);
        } catch(RuntimeException e) { // Primero, maneja las RuntimeExceptions (más específicas)
            // Lógica de manejo de excepciones no comprobadas
        } catch(Exception e) { // Luego, maneja las Exceptions (más generales)
            // Lógica de manejo de excepciones comprobadas (o cualquier otra Exception no Runtime)
        }

    }
}