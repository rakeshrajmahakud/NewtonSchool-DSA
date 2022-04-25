package Introduction.Abstraction;

abstract class A {
    abstract void callMe(); //abstract method

    void callMeToo() {
        System.out.println("In callMeToo() method of class A");
    }
}

class B extends A {
    void callMe() {
        System.out.println("In callMe() method of class B");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        B b = new B();
        b.callMe();
        b.callMeToo();
    }
}