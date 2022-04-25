package Introduction.Interfaces;

interface B {
    void printAStatement();

    private void test() {
        System.out.println("This is the private test() method in interface B");
    }
}

class Four implements B {
    public void printAStatement() {
        System.out.println("In printAStatement() method in class Four");
    }
}

public class PrivateMethodsInInterface {
    public static void main(String[] args) {
        Four four = new Four();
        four.printAStatement();
    }
}
