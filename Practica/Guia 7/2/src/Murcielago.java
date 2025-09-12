class Murcielago extends Animal implements Volador {
    public Murcielago(String nombre) {
        super(nombre, TipoAnimal.MURCIELAGO);
    }

    @Override
    public void comunicarse() {
        System.out.println(nombre + " emite ultrasonidos.");
    }

    @Override
    public void volar() { System.out.println(nombre + " vuela en la oscuridad."); }

    public void colgarse() { System.out.println(nombre + " se cuelga boca abajo en una cueva."); }

}