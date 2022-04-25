package Introduction.Initializer;

public class MultipleStaticInitializers {
    /*
    Example where we might need multiple static initializers:
    DB connection -> static
    Map -> static
     */

    static {
        System.out.println("In first static block");
    }

    static {
        System.out.println("In second static block");
    }

    public static void main(String[] args) {
        System.out.println("In main()");
    }

    /*
    static initializers can be defined after the main()
    This won't compromise the order of evaluation
     */
    static {
        System.out.println("In third static block");
    }
}
