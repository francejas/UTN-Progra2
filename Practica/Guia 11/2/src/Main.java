public class Main {
    public static void main(String[] args) {

        Explique lo que sucede en el siguiente código y por qué.

        public static class EjemploExcepciones{
            public static int devuelveNumero(int num) {
                try {

            if (num % 2 == 0) { throw new Exception(&quot;Lanzando
                excepcion&quot;);
            }
            return 1;
        } catch (Exception ex) { ex.getMessage().concat(&quot;Rompi todo y
            pase por Catch&quot;); return 2;
        } finally { return 3;
        }
        }
        }

        La función devuelveNumero(int num) siempre devolverá el valor 3, independientemente de si el número de entrada (num) es par o impar y de si se lanza o no la excepción.

        Si llamas a EjemploExcepciones.devuelveNumero(2), el resultado será 3.

        Si llamas a EjemploExcepciones.devuelveNumero(3), el resultado será 3.

        La Explicación (El Bloque finally)
        La clave de este comportamiento reside en el uso del bloque finally.

        1. Precedencia del finally
        El bloque finally tiene un propósito crucial en Java: garantizar que el código dentro de él se ejecute siempre, ya sea que el bloque try se haya completado con éxito o haya sido interrumpido por una excepción.

        Cuando el bloque finally contiene una sentencia return, esta tiene precedencia absoluta sobre cualquier sentencia return anterior que se haya encontrado en el bloque try o en el bloque catch.

        2. Análisis del Flujo de Ejecución
        Caso A: num es Par (Ej. devuelveNumero(2))
        Se entra al bloque try.

        La condición if (num % 2 == 0) es verdadera.

        Se lanza la Exception.

        El control salta inmediatamente al bloque catch.

        En el catch:

        Se ejecuta la línea ex.getMessage().concat(...) (Aunque esta línea concatena un mensaje, el valor resultante se ignora porque no se asigna a ninguna variable ni se imprime. Esto es código inútil).

        Se encuentra return 2;. En este momento, el método está a punto de salir con el valor 2.

        Justo antes de salir, el código DEBE ejecutar el bloque finally.

        En el finally, se encuentra return 3;.

        Este return 3; sobrescribe el return 2; pendiente del catch.

        El método termina, devolviendo 3.

        Caso B: num es Impar (Ej. devuelveNumero(3))
        Se entra al bloque try.

        La condición if (num % 2 == 0) es falsa.

        Se ejecuta return 1;. En este momento, el método está a punto de salir con el valor 1.

        No hay excepción, por lo que el bloque catch se omite.

        Justo antes de salir, el código DEBE ejecutar el bloque finally.

        En el finally, se encuentra return 3;.

        Este return 3; sobrescribe el return 1; pendiente del try.

        El método termina, devolviendo 3.




    }
}