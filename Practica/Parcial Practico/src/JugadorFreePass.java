public final class JugadorFreePass extends Jugador{
    private boolean freePass;

    public JugadorFreePass(String nombre, Liga liga, boolean freePass) {
        super(nombre, liga);
        this.freePass = freePass;
    }

    public boolean isFreePass() {
        return freePass;
    }

    public void setFreePass(boolean freePass) {
        this.freePass = freePass;
    }

    @Override
    public void entrenar() {
        setNivel(getNivel()+1);
    }

    @Override
    public String toString() {
        return "JugadorFreePass{" +
                "freePass=" + freePass +
                "} " + super.toString();
    }
}
