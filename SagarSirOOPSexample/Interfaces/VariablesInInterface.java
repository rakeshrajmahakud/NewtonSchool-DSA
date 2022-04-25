package Introduction.Interfaces;

interface Constants {
    double PI = 3.14126;
    int randomConstant = 100;
}

class ImplementConstant implements Constants {
    void displayConstant() {
        System.out.println("PI: " + PI);
        System.out.println("randomConstant: " + randomConstant);
    }
}

public class VariablesInInterface {
    public static void main(String[] args) {
        ImplementConstant implementConstant = new ImplementConstant();
        implementConstant.displayConstant();
    }
}