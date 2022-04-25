package Introduction.Interfaces;

interface E {
    void printAStatement();

    default void invokeTest() {
        test();
    }

    private void test() {
        System.out.println("This is the private test() method in interface B");
    }
}

class Six implements E {
    public void printAStatement() {
        System.out.println("In printAStatement() method in class Four");
    }
}

public class InvokePrivateInterfaceMethod {
    public static void main(String[] args) {
        Six six = new Six();
        six.invokeTest();
    }
}
