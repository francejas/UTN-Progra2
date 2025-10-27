import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.Stack;

public class Pila<T> {

    private Stack<T> elementos;

    public Pila() {
        this.elementos = new Stack<>();
    }

    public void apilar(T elemento) {
        elementos.push(elemento);
        System.out.println("✅ Apilado (PUSH): " + elemento.toString());
    }


    public T desapilar() {
        if (elementos.isEmpty()) {
            throw new NoSuchElementException("La pila está vacía, no se puede desapilar (POP).");
        }
        T elemento = elementos.pop();
        System.out.println("❌ Desapilado (POP): " + elemento.toString());
        return elemento;
    }

    public T verTope() {
        if (elementos.isEmpty()) {
            throw new NoSuchElementException("La pila está vacía, no hay tope para ver (PEEK).");
        }
        return elementos.peek();
    }


    public boolean estaVacia() {
        return elementos.isEmpty();
    }


    public int obtenerTamano() {
        return elementos.size();
    }

    @Override
    public String toString() {
        return "Pila (Fondo -> Tope): " + elementos.toString();
    }
}