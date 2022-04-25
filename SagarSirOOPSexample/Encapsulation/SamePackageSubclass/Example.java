package Introduction.Encapsulation.SamePackageSubclass;

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

class B extends A {
    void display() {
        System.out.println("defaultA: " + defaultA);
        /*
        System.out.println("privateB: " + privateB);
        'private' access specifier restricts the visibility of the member
         */
        System.out.println("protectedC: " + protectedC);
        System.out.println("publicD: " + publicD);
    }
}

public class Example {
    public static void main(String[] args) {

    }
}
