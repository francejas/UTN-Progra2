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
