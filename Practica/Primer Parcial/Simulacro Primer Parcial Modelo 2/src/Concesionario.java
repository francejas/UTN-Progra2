import java.util.ArrayList;

public class Concesionario {
    private ArrayList<Preciable> inventario;

    public Concesionario(ArrayList<Vehiculo> inventario) {
        this.inventario = new ArrayList<>();
    }

    public ArrayList<Preciable> getInventario() {
        return inventario;
    }

    public void setInventario(ArrayList<Preciable> inventario) {
        this.inventario = inventario;
    }

    public void agregarVehiculo(Preciable v){
        inventario.add(v);
    }
    public Vehiculo buscarPorPatente(String patente){
        for (Preciable p : inventario){
            if(p instanceof Vehiculo){
                Vehiculo v = (Vehiculo) p;
                if (v.getPatente().equals(patente)){
                    return v;
                }
            }
        }
        return null;
    }

    // Contar vehículos en inventario
    public int contar() {
        return inventario.size();
    }

    public void devolverListado(){
        for (Preciable p : inventario){
            System.out.println(p);
        }
    }

    public void eliminarPorPatente(String patente){
        for (Preciable p : inventario){
            if (p instanceof Vehiculo){
                Vehiculo v = (Vehiculo) p;
                if (v.getPatente().equals(patente)){
                    System.out.println(v);
                    System.out.println("Eliminado");
                    inventario.remove(v);
                }
            }
        }

    }

    public double calcularTotal(){
        double total=0;
        for (Preciable p : inventario){
            total+=p.calcularPrecio();
        }
        return total;
    }

}
