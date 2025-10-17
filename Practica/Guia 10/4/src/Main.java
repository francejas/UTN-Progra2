import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Solicitar la cadena al usuario
        System.out.println("--- Contador de Frecuencia de Caracteres ---");
        System.out.print("Por favor, ingresa una cadena de texto: ");
        String cadena = scanner.nextLine();

        // 2. Crear el HashMap para almacenar los resultados
        // Key (Character): el carácter
        // Value (Integer): la frecuencia/conteo
        Map<Character, Integer> frecuenciaCaracteres = new HashMap<>();

        // 3. Convertir la cadena a un array de caracteres para facilitar la iteración
        char[] caracteres = cadena.toCharArray();

        // 4. Iterar sobre el array y contar la frecuencia
        for (char caracter : caracteres) {
            // Ignoramos los espacios en blanco para tener un conteo más limpio,
            // aunque si deseas contarlos, puedes eliminar esta línea.
            if (Character.isWhitespace(caracter)) {
                continue;
            }

            // Convertimos a minúsculas para contar 'A' y 'a' como el mismo carácter.
            // Si quieres distinguir mayúsculas/minúsculas, elimina esta línea.
            char caracterNormalizado = Character.toLowerCase(caracter);

            // Usamos el método getOrDefault o merge para una actualización eficiente:
            // Si el carácter ya está en el mapa, suma 1 a su conteo actual.
            // Si no está, lo agrega con el valor inicial de 1.


            // El método 'put()' se usa para actualizar o insertar un par clave-valor en el mapa.
//    Clave: 'caracterNormalizado' (el carácter que estamos contando).
//    Valor: El nuevo conteo del carácter.

// El nuevo valor se calcula con la función 'getOrDefault()':
// 1. frecuenciaCaracteres.getOrDefault(caracterNormalizado, 0):
//    -> Intenta obtener el valor actual (el conteo) asociado a 'caracterNormalizado'.
//    -> SI LA CLAVE EXISTE: Devuelve el conteo actual (ej: 2).
//    -> SI LA CLAVE NO EXISTE (es la primera vez que vemos el carácter):
//       Devuelve el valor por defecto, que es 0.

// 2. ... + 1:
//    -> Al valor devuelto por 'getOrDefault' (el conteo anterior o 0),
//       simplemente le sumamos 1.

// Resultado: El mapa se actualiza con la frecuencia, siendo 1 si es un carácter nuevo,
// o el conteo anterior incrementado si ya existía.

            frecuenciaCaracteres.put(caracterNormalizado, frecuenciaCaracteres.getOrDefault(caracterNormalizado, 0) + 1);
        }

        // 5. Mostrar el HashMap resultante al usuario
        System.out.println("\n--- Resultado del Conteo ---");
        System.out.println("El mapa de frecuencia de caracteres es:");
        System.out.println(frecuenciaCaracteres);

        // Opcional: Mostrar los resultados en un formato más legible
        System.out.println("\nFrecuencias por carácter:");
        for (Map.Entry<Character, Integer> entry : frecuenciaCaracteres.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue() + " veces");
        }

        scanner.close();


    }
}