package leetcode;

public class InstanceOfDemo {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        A A= new A();
        B B=new B();
        System.out.println(a instanceof A); //dirnaqli
        System.out.println(B instanceof A);
        System.out.println(a instanceof B);//FALSE

        A a1=new A();
        B b1=new C();
        System.out.println(a1 instanceof A);
        System.out.println(a1 instanceof B); //false
        System.out.println(a1 instanceof C);  //false


    }
}

class A{
    int x;
}

class B extends A{
    int y;
}

class C extends B{
    int z;
}
class D extends C {
    int t;
}
