package Introduction.Polymorphism;

public class FunctionOverloading {
    static void add() {
        System.out.println("In add()");
    }

    static void add(int a, int b) {
        System.out.println("In add(int, int): " + a + ", " + b);
    }

    static void add(int a, float b) {
        System.out.println("In add(int, float): " + a + ", " + b);
    }

    static void add(float a, float b) {
        System.out.println("In add(float, float): " + a + ", " + b);
    }

    public static void main(String[] args) {
        add();
        add(1, 2);
        add(1, 3.21f);
        add(1.1f, 2.2f);
        //add(1.11, 2.22); -> error
        add((int)1.11, (int)2.22);
    }
}
