package Introduction.Inheritance;

class I {
    int i;

    I(int a) {
        System.out.println("In constructor of I");
        i = a;
    }
}

class J extends I {
    int j;

    J(int a, int b) {
        super(a);
        System.out.println("In constructor of J");
        j = b;
    }
}

class K extends J {
    int k;

    K(int a, int b, int c) {
        super(a, b);
        System.out.println("In constructor of K");
        k = c;
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        K k = new K(10, 20, 30);

        System.out.println("k.i: " + k.i);
        System.out.println("k.j: " + k.j);
        System.out.println("k.k: " + k.k);
    }
}
