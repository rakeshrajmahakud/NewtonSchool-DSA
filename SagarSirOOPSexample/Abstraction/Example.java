package Introduction.Abstraction;

abstract class C {
    abstract void show();

    void show(int a) {
        System.out.println("In show() method of class C: " + a);
    }
}

class D extends C {
    void show() {
        System.out.println("In show() method of class D: ");
    }

    void show(int a) {
        System.out.println("In show() method of class D: " + a);
    }

    void callShowOfSuper(int a) {
        System.out.println("In callShowOfSuper() method of class D: " + a);
        super.show(a);
    }
}

public class Example {
    public static void main(String[] args) {
        D d = new D();

        d.callShowOfSuper(100);
    }
}
