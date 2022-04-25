package Introduction.Initializer;

public class InstanceInitializer {
    int num1;
    int num2;

    InstanceInitializer() {
        System.out.println("In default constructor");

        num1 = 1;
        num2 = 2;
    }

    //instance initializer
    {
        System.out.println("In instance initializer");

        num1 = 3;
        num2 = 4;
    }

    public static void main(String[] args) {
        InstanceInitializer instanceInitializer
                = new InstanceInitializer();
    }
}
