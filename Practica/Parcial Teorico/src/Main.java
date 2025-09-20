class Figura {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }
    public void queSoy(){
        System.out.println("Soy una figura geometrica");
    }
}

class Circulo extends Figura{
    public Circulo(String nombre) {
        super(nombre);
    }
    public void queSoy(){
        System.out.println("Soy una "+nombre);
    }
}

class Rectangulo extends Figura{
    public Rectangulo(String nombre) {
        super(nombre);
    }
    public void queSoy(){
        System.out.println("Soy un "+nombre);
    }
}

public class TestFigura{
    public static void main(String[] args){
        Figura a = new Circulo("Circulo");
        Figura b = new Rectangulo("Rectangulo");
        Figura[] figuras = new Figura[2];
        figuras[0]=a;
        figuras[1]=b;
        for (Figura f: figuras){
            f.queSoy();
        }
    }
}


class Prueba{
    void metodo(String s){
        System.out.println("String");
    }
    void metodo(Integer i){
        System.out.println("Integer");
    }
}
public class Test {
    public static void main(String[] args){
        Prueba p = new Prueba();
        p.metodo(null);
    }
}
