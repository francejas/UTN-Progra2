import java.util.ArrayList;
import java.util.TreeMap;

public class RegistroTarjetas {
    private ArrayList<Tarjeta> listaTarjetas;

    public RegistroTarjetas() {
        this.listaTarjetas = new ArrayList<>();
    }

    public ArrayList<Tarjeta> getListaTarjetas() {
        return listaTarjetas;
    }

    public void setListaTarjetas(ArrayList<Tarjeta> listaTarjetas) {
        this.listaTarjetas = listaTarjetas;
    }
    public void agregarTarjeta(Tarjeta tarjeta){
        if (existeTitular(tarjeta.getTitular().getDni())){
            System.out.println("El titular ya tiene tarjeta asociada.");
        } else {
            listaTarjetas.add(tarjeta);
        }
    }
    public boolean existeTitular(String dni){
        for (Tarjeta tarjeta : listaTarjetas){
                if (tarjeta.getTitular().getDni().equalsIgnoreCase(dni)){
                    return true;
                }
            }
            return false;
    }

    public Tarjeta buscarTarjetaPorDni(String dni){
        for (Tarjeta tarjeta : listaTarjetas){
            if(tarjeta.getTitular().getDni().equalsIgnoreCase(dni)){
                return tarjeta;
            }
        }
        return null;
    }


    public void cargarSaldo(String dni, double monto){
        Tarjeta tarjeta = buscarTarjetaPorDni(dni);
        if(tarjeta != null){
            tarjeta.setSaldo(tarjeta.getSaldo() + monto);
            System.out.println("Saldo cargado. Nuevo saldo: " + tarjeta.getSaldo());
        } else {
            System.out.println("Tarjeta no encontrada para DNI: " + dni);
        }
    }


}
