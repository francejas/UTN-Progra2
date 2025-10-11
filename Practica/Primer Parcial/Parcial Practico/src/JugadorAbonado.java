public final class JugadorAbonado extends Jugador{
    private int abonoMensual;

    public JugadorAbonado(String nombre, Liga liga, int abonoMensual) {
        super(nombre, liga);
        this.abonoMensual = abonoMensual;
    }

    public int getAbonoMensual() {
        return abonoMensual;
    }

    public void setAbonoMensual(int abonoMensual) {
        this.abonoMensual = abonoMensual;
    }

    @Override
    public void entrenar() {
        setNivel(getNivel()+2);
    }

    @Override
    public String toString() {
        return "JugadorAbonado{" +
                "abonoMensual=" + abonoMensual +
                "} " + super.toString();
    }
}
