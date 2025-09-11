// ---------------------
// Enum para clasificar
// ---------------------
enum TipoAnimal {
    PATO,
    PEZ,
    MURCIELAGO
}

// ---------------------
// Clase base
// ---------------------
abstract class Animal {
    protected String nombre;
    protected TipoAnimal tipo;

    public Animal(String nombre, TipoAnimal tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public TipoAnimal getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    public void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }

    public abstract void comunicarse();
}

// ---------------------
// Interfaces de habilidades
// ---------------------
interface Volador {
    void volar();
}

interface Nadador {
    void nadar();
}

interface Caminante {
    void caminar();
}

interface Colgador {
    void colgarse();
}

// ---------------------
// Clases concretas
// ---------------------
class Pato extends Animal implements Volador, Nadador, Caminante {
    public Pato(String nombre) {
        super(nombre, TipoAnimal.PATO);
    }

    @Override
    public void comunicarse() {
        System.out.println(nombre + " hace: ¡Cuac Cuac!");
    }

    @Override
    public void volar() { System.out.println(nombre + " vuela sobre el agua."); }

    @Override
    public void nadar() { System.out.println(nombre + " nada bajo el agua."); }

    @Override
    public void caminar() { System.out.println(nombre + " camina por la orilla."); }
}

class Murcielago extends Animal implements Volador, Colgador {
    public Murcielago(String nombre) {
        super(nombre, TipoAnimal.MURCIELAGO);
    }

    @Override
    public void comunicarse() {
        System.out.println(nombre + " emite ultrasonidos.");
    }

    @Override
    public void volar() { System.out.println(nombre + " vuela en la oscuridad."); }

    @Override
    public void colgarse() { System.out.println(nombre + " se cuelga boca abajo en una cueva."); }
}

class Pez extends Animal implements Nadador {
    public Pez(String nombre) {
        super(nombre, TipoAnimal.PEZ);
    }

    @Override
    public void comunicarse() {
        System.out.println(nombre + " hace burbujas (glu glu).");
    }

    @Override
    public void nadar() { System.out.println(nombre + " nada ágilmente en el océano."); }
}

// ---------------------
// Simulación
// ---------------------
public class ReinoMagico {
    public static void main(String[] args) {
        Animal pato = new Pato("Donald");
        Animal murcielago = new Murcielago("Bruce");
        Animal pez = new Pez("Nemo");

        // Mostrar tipo y comunicación
        System.out.println(pato.getNombre() + " es un " + pato.getTipo());
        pato.comunicarse();

        System.out.println(murcielago.getNombre() + " es un " + murcielago.getTipo());
        murcielago.comunicarse();

        System.out.println(pez.getNombre() + " es un " + pez.getTipo());
        pez.comunicarse();

        System.out.println("\n--- Habilidades especiales ---");
        ((Pato) pato).caminar();
        ((Pato) pato).volar();
        ((Pato) pato).nadar();

        ((Murcielago) murcielago).volar();
        ((Murcielago) murcielago).colgarse();

        ((Pez) pez).nadar();
    }
}