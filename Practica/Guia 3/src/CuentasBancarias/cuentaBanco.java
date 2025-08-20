package CuentasBancarias;

public class cuentaBanco {
    private int id;
    private String nombre;
    private double balance;

    public cuentaBanco(int id, String nombre, double balance) {
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double credito(double dinero){
        balance+=dinero;
        return balance;
    }

    public double debito(double dinero) {
        if (balance >= dinero) {      // permite retirar el saldo exacto
            balance -= dinero;
        } else {
            System.out.println("Dinero insuficiente para gastar $" + dinero);
        }
        return balance;  // devuelve siempre el balance actualizado
    }

    public void mostrarCuenta() {
        System.out.println("Cuenta número: " + id);
        System.out.println("Nombre de cuenta: " + nombre);
        System.out.println("Balance: $" + balance);
        System.out.println("----------------------------");
    }


}
