class Pez extends Animal implements Nadador {
    public Pez(String nombre) {
        super(nombre, TipoAnimal.PEZ);
    }

    public void comunicarse() {
        System.out.println(nombre + " hace burbujas (glu glu).");
    }

    @Override
    public void nadar() { System.out.println(nombre + " nada ágilmente en el océano."); }
}