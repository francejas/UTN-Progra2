import java.util.ArrayList;

public class Cine {
    private ArrayList<Entrada> entradas;

    //constructor vacio

    public Cine() {
        this.entradas = new ArrayList<>();
    }

    public ArrayList<Entrada> getEntradas() {
        return entradas;
    }

    public void setEntradas(ArrayList<Entrada> entradas) {
        this.entradas = entradas;
    }

    public void agregarEntrada(Entrada entrada){
        entradas.add(entrada);
    }

    public void eliminarEntrada(Entrada entrada){
        entradas.remove(entrada);
    }

    public void mostrarEntradas(){
        if (entradas.isEmpty()){
            System.out.println("Lista de entradas vacia");
        }

        for (Entrada entrada : entradas){
            System.out.println(entrada);
        }
    }

    public Entrada buscarEntradaPorPelicula(String nombrePelicula){
        if (entradas.isEmpty()){
            System.out.println("Lista de entradas vacia");
        }

        Entrada entradaEncontrada;

        for (Entrada entradaAux : entradas){
            if (entradaAux.getPelicula().equalsIgnoreCase(nombrePelicula)){
                entradaEncontrada=entradaAux;
                return entradaEncontrada;
            }
        }
        return null;
    }


    public String venderEntrada(Entrada entrada){
        Entrada entradaVendida;
        if (buscarEntradaPorPelicula(entrada.getPelicula())!= null){
            entradaVendida= buscarEntradaPorPelicula(entrada.getPelicula());
            int descuento= entradaVendida.obtenerCodigoPromo();
            entradaVendida.generarTicket();


            double precioFinal = entradaVendida.aplicarDescuento(descuento);

            eliminarEntrada(entradaVendida);

            return entradaVendida.generarTicket()+ " Descuento : " +descuento+"%. Precio final: "+precioFinal;
        }else {
            return "Entradas agotadas.";
        }





    }

}
