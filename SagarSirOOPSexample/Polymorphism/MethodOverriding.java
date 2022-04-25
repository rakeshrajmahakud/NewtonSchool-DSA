package Introduction.Polymorphism;

class A {
    int i;
    int j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i: " + i);
        System.out.println("j: " + j);
    }
}

class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        super.show();
        System.out.println("k: " + k);
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        B b = new B(100, 200, 300);
        b.show();
    }
}
