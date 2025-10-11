import java.util.ArrayList;
import java.util.Queue;
//1
public class Main{
    Queue<String> cola;
    cola.offer("X");
    cola.offer("Y");
    cola.offer("Z");
    System.out.println(cola.offer());
    System.out.println(cola);
}

//2
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

//3

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

//4
interface Conectable{
    void conectar();
}

class USB implements Conectable{
    public void conectar(){
        System.out.println("Conectado por USB");
    }
}

class HDMI implements Conectable{
    public void conectar(){
        System.out.println("Conectado por HDMI");
    }
}

public class Main{
    public  static void main(String[] args){
        Conectable c = new HDMI();
        c.conectar();
    }
}

//5
public class ClaseConcreta extends ClaseAbstract{
    private String atributoConcreto;
    public ClaseConcreta(String contenidoAbstracto, String atributoConcreto){
        super(contenidoAbstracto);
        this.atributoConcreto=atributoConcreto;
    }

    public String hacerAlgo(String cadena){
        return cadena;
    }

    public Integer hacerAlgo(Integer cadena){
        return cadena;
    }

}

//seleccione una o mas
a. La sobrecarga no se encuentra bien implementada porque el retorno del metodo no es el mismo en ambos casos.
b. En el codigo mostrado se implementa polimorfismo.
c. El codigo compila pero fallara en tiempo de ejecucion.
d. En el codigo mostrado se implementa sobrecarga de metodos.
e. La sobrecarga no se encuentra bien implementada porqiue los parametros dfel metodo no son los mimos en ambos casos.
f. El codigo tiene errores que hace que no compile.
g. La sobrecarga no se encuentra bien implementada porquie la firma del metodo no es  la misma en ambos casos.




 //6
//Supongamois que tenemos un ArrayList de Personas y queremos crear un metodo estico para buscar una persona por sui dni(el cual es un String) dentro de ese arreglo y retornarla.
//Completar los espacios faltantes en la siguiente funcion para que cumpla con es finalidad.

public static Persona {
    encontrarPersonaPorDNI(String dni, ArrayList<Persona> lista){
        Persona aux;
        for (int i = 0; i < (ACA VA UNA LISTA DE OPCIONES A SELECCIONAR); i++) {
            aux=lista.(LISTA DE OPCIONES);
            if (aux.(LISTA DE OPCIONES).(LISTA DE OPCIOONES)){
                return aux;
            }

        }
        return (LISTA DE OPCIONES);
    }
}


//7
Cual es el resultado de intentar heredar de una clase final ?
a.Se ignora la palabra.
b. Solo se heredan los metodos privados.
c. Compila pero arroja error en tiempo de ejecucion.
d. No se puede, da error de compilacion.
e.  Se hereda normalmente.
f. Ninguna de las restantes respuestas es correcta.

//8
Que representa una linea punteada con un triangulo vacio en UML?
a. Implementacion de una interfaz.
b. Agregacion.
c. Composicion.
d. Dependencia.
e. Herencia.
f. Asociacion.
g. Ninguna de las restantes respuestas es correcta.




        //9
//en la sigueinte jerarquias de clases, analizar coimo actua el polimorfgismo al invocar el metodo calcularSueldo(), seleccionar cual seria la salida por  pantalla

abstract class Empleado{
    protected String nombre;
    public Empleado(String nombre){
        this.nombre=nombre;
    }
    public abstract void calcularSueldo();
}

class EmpleadoFijo extends Empleado{
    public EmpleadoFijo(String nombre){
        super(nombre);
    }
    public void calcularSueldo(){
        System.out.println(nombre+" cobra un sueldo fijo de 3000");
    }
}

class EmpleadoPorHora extends Empleado{
            public EmpleadoPorHora(String nombre){
                super(nombre);
            }
            public void calcularSueldo(){
                System.out.println(nombre+" cobra por horas trabajadas:  2000");
            }
        }

        public class TestEmpleado{
    public static void main(String[] args){
        Empleado[] empleados= new Empleado[2];
        empleados[0]= new EmpleadoFijo("Ana");
        empleados[1]=new EmpleadoPorHora("Luis");
        for (Empleado e : empleados){
            e.calcularSueldo();
        }
    }
        }

//10
//en la siguiente jerarquias de clase analizar como actua el polimorfismo al invocar el metodo iniciar() seleccionar cual seria la salida por pantalla

abstract class Vehiculo{
    abstract void mover();
    public void iniciar(){
        System.out.println("Iniciando vehiculo...");
        mover();
    }
}

class Auto extends Vehiculo{
    void mover(){
        System.out.println("El auto avanza sobre 4 ruedas");
    }
}

class Moto extends Vehiculo{
    void mover(){
        System.out.println("La moto avanza sobre 2 ruedas");
    }
}

public class TestVehiculo{
    public static void main(String[] args){
        Vehiculo v = new Auto();
        v.iniciar();
        v= new Moto();
        v.iniciar();
    }
}

//11
//en relacion al siguiente codigo

enum Moneda{
    DOLAR(1.0), EURO(0.9);
    double valor;
    Moneda(double v ){ valor = v; }
}
Que afirmacion o afirmaciones son correctas ?
a. Cada valor enumerado puede tener atributos.
b. El constructor de un enum debe ser publico.
c. Al  invocar el constructor del enum con la palabra reservada new, se le debe pasar por parametro el valor de la modena y este queda almacenado en el atributo valor.
d. Los enums pueden tener cosntructores.





//12
Si necesitamos que varias clases iplementes uno o varios metodos pero esas clases ya heredan de otra clase...
      cual es la mejor solucion?
a. ninguna de las restantes respuestas es correcta.
        b. definir una interfaz cvon los metodos abstractos que sean necesarios.
c. usar herencia multiple.
        d. definir metodos distintos en cada clase.
e. definir una clase abstracta con los metodos necesarios.
f. definir una interfaz y en ella implementar los  metodos necesarios.


//13
//que muestra por pantalla ?
class Mensaje{
    public void mostrar(){
        System.out.println("Mensaje generico");
    }
    public void enviar(String texto){
        System.out.println("Enviando: " + texto);
        mostrar();
    }
}

class MensajeTexto extends Mensaje{
    public void mostrar(){
        System.out.println("Mostrando email");
    }
}

public class Main{
    public static void main(String[] args){
        Mensaje m = new MensajeTexto();
        m.enviar("Hola!");
        m=new MensajeEmail();
        m.enviar("Bienvenido!");
    }
}


//14
//cual es  la saluda por pantalla del siguiente codigo ?

public class Main{
    public static void main(String[] args){
        ArrayList<String> lista = new ArrayList<>;
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.remove(1);
        System.out.println(lista);
    }
}


//15
//Analiza
String s = "abc";
String t = "ABC";

Cuales comparaciones son correctas para ignorar mayusculas/minuscular ?
a. s.equalsoIgnoreCase(t)
    b. s.equals(t)
    c. s.compareTo(t)==0
d. t.equalsIgnoreCase(s)



