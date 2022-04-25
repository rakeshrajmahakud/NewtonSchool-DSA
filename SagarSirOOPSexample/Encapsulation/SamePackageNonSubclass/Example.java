package Introduction.Encapsulation.SamePackageNonSubclass;

/*
Image URL for reference:
https://www.cdn.geeksforgeeks.org/wp-content/uploads/Access-Modifiers-in-Java.png
 */

class A {
    int defaultA;
    private float privateB;
    protected double protectedC;
    public String publicD;
}

class B {
    void display() {
        A a = new A();

        System.out.println("defaultA: " + a.defaultA);
        /*
        System.out.println("privateB: " + a.privateB);
        'private' access specifier restricts the visibility of the member
         */
        System.out.println("protectedC: " + a.protectedC);
        System.out.println("publicD: " + a.publicD);
    }
}

public class Example {
}
