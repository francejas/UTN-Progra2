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