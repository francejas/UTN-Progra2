import Cliente.Cliente;
import Factura.Factura;

public class Main {
    public static void main(String[] args) {

        //c
        Cliente cliente1 = new Cliente("Juan", "juan@mail.com", 15);
        System.out.println(cliente1);
        //d
        Factura factura1 = new Factura(200,cliente1);
        System.out.println(factura1);
    }
}