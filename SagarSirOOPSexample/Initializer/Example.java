package Introduction.Initializer;

public class Example {
    static {
        System.out.println("In static initializer");
    }

    Example() {
        System.out.println("In constructor");
    }

    {
        System.out.println("In instance initializer");
    }

    public static void main(String[] args) {
        System.out.println("In main()");

        Example example = new Example();
    }
}
