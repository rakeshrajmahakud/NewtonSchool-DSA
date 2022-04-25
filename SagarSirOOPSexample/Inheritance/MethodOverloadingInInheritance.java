package Introduction.Inheritance;

class L {
    int i;
    int j;

    L(int a, int b) {
        i = a;
        j = b;
    }

    void show(int a) {
        System.out.println("a: " + a);
        System.out.println("i: " + i);
        System.out.println("j: " + j);
    }
}

class M extends L {
    int k;

    M(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        System.out.println("k: " + k);
    }
}

public class MethodOverloadingInInheritance {
    public static void main(String[] args) {
        M m = new M(1, 4, 7);
        m.show(1000);
        m.show();
    }
}
