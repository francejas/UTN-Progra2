public abstract class A {
    public abstract void dinamica();
    public void estatica() {
        System.out.println("Método estático de la clase A");
    }
}

public class B extends A {
    public void dinamica() {
        System.out.println("Método dinámico de clase B");
    }
}

public class C extends A {
    public void dinamica() {
        System.out.println("Método dinámico de clase C");
    }
}


/// MAIN
A a;
B b = new B();
C c = new C();

System.out.print("Métodos llamados con objeto b desde");
System.out.println("referencia de la clase A");

a = b;
a.dinamica(); //aca imprime por pantalla
a.estatica();

System.out.print("Métodos llamados con objeto c desde");
System.out.println(" referencia de la clase A");

a = c;
a.dinamica();
a.estatica();
