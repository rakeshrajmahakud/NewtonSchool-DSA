package Introduction.Interfaces;

interface C {
    void printAStatement();

    default void test() {
        System.out.println("In default test() method of interface C");
    }
}

class Five implements C {
    public void printAStatement() {
        System.out.println("In default printAStatement() method of class Five");
    }
}

public class DefaultMethodsInInterface {
    public static void main(String[] args) {
        Five five = new Five();
        five.test();
        five.printAStatement();
    }
}
