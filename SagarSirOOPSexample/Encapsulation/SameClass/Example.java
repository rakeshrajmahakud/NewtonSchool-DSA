package Introduction.Encapsulation.SameClass;

/*
Image URL for reference:
https://www.cdn.geeksforgeeks.org/wp-content/uploads/Access-Modifiers-in-Java.png
 */

public class Example {
    static int defaultA;
    static private float privateB;
    static protected double protectedC;
    static public String publicD;

    public static void main(String[] args) {
        defaultA = 1;
        privateB = 3.14f;
        protectedC = 10.000192;
        publicD = "Test";

        System.out.println("defaultA: " + defaultA);
        System.out.println("privateB: " + privateB);
        System.out.println("protectedC: " + protectedC);
        System.out.println("publicD: " + publicD);
    }
}
