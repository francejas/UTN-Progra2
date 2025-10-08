public class Main {
    public static void main(String[] args) {
        Cine cine = new Cine();

        //3 entradas 2D
        Entrada entrada2D1 =new Entrada2D(100,1,"Matrix",1);
        Entrada entrada2D2 =new Entrada2D(100,2,"Alien",2);
        Entrada entrada2D3 =new Entrada2D(100,3,"Avengers",3);

        //3 entradas 3D
        Entrada entrada3D1 = new Entrada3D(200,1,"Barbie");
        Entrada entrada3D2 = new Entrada3D(200,3,"King Kong");
        Entrada entrada3D3 = new Entrada3D(200,5,"Barbie");

        //agregar al array
        cine.agregarEntrada(entrada2D1);
        cine.agregarEntrada(entrada2D2);
        cine.agregarEntrada(entrada2D3);

        cine.agregarEntrada(entrada3D1);
        cine.agregarEntrada(entrada3D2);
        cine.agregarEntrada(entrada3D3);


        //muestra entradas
        cine.mostrarEntradas();

        //vender 2 entradas
        System.out.println(cine.venderEntrada(entrada2D1));
        System.out.println(cine.venderEntrada(entrada3D1));

        //mostrar
        cine.mostrarEntradas();


    }
}