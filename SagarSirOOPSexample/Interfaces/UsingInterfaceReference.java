package Introduction.Interfaces;

interface Test {
    void testMethod(int testVariable);
}

class ImplementationClassI implements Test {
    public void testMethod(int testVariable) {
        System.out.println("In testMethod(int) of ImplementationClassI class: " + testVariable);
    }
}

class ImplementationClassII implements Test {
    public void testMethod(int testVariable) {
        System.out.println("In testMethod(int) of ImplementationClassII class: " + testVariable);
    }

    void ownMethod() {
        System.out.println("In ownMethod() in class ImplementationClassII");
    }
}

public class UsingInterfaceReference {
    public static void main(String[] args) {
        Test test;

        ImplementationClassI implementationClassI = new ImplementationClassI();
        ImplementationClassII implementationClassII = new ImplementationClassII();

        test = implementationClassI;
        test.testMethod(100);

        test = implementationClassII;
        test.testMethod(1000);

        /*
        test.ownMethod(); //cannot be accessed
         */
    }
}
