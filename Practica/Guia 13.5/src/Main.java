public class Main {
    public static void main(String[] args) {
        GestorJSONEmpleados gestorJSONEmpleado = new GestorJSONEmpleados();

        try{
            // creo y guardo uno bien
            Empleado empleado = new Empleado("Nomrbe",1,1200000.0,"Sistemas");
            gestorJSONEmpleado.guardarEnJSON(empleado);
            Empleado empleadoLeido = gestorJSONEmpleado.leerJSON();
            System.out.println(empleadoLeido.toString());

                /*
                System.out.println("\n\nCreo y guardo uno incompleto para que arroje la excepcion\n");
                Empleado empleado2 = new Empleado();
                gestorJSONEmpleado.guardarEnJSON(empleado2);
                Empleado empleadoLeido2 = gestorJSONEmpleado.leerJSON();
                System.out.println(empleadoLeido2.toString());
                 */

        } catch (FormatoIncorrectoException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }




    }
}