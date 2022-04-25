package Introduction.Interfaces;

interface A {
    void printAStatement();

    int findLengthOfString(String s);

    double[] getNRandomDoubleNumbers(int n);
}

class First implements A {
    public void printAStatement() {
        System.out.println("In method1() of class A");
    }

    public int findLengthOfString(String s) {
        return s.length();
    }

    public double[] getNRandomDoubleNumbers(int n) {
        double result[] = new double[n];

        for(int i  = 0; i < n; i++) {
            double randomNumber = Math.random() * 100;
            result[i] = randomNumber;
        }

        return result;
    }
}

abstract class Second implements A {
    abstract void getSecretMethod();
}

class Three extends Second {
    public void printAStatement() {

    }

    public int findLengthOfString(String s) {
        return 0;
    }

    public double[] getNRandomDoubleNumbers(int n) {
        return new double[0];
    }

    void getSecretMethod() {

    }
}

class InterfaceExample1 {
    public static void main(String[] args) {
        First first = new First();

        first.printAStatement();

        String s = "Java is NOT related to JavaScript";
        int length = first.findLengthOfString(s);
        System.out.println("Length: " + length);

        int n = 10;
        double randomNumbers[] = first.getNRandomDoubleNumbers(n);
        System.out.println("Random Numbers: ");
        for(int i = 0; i < n; i++) {
            System.out.println(randomNumbers[i]);
        }
    }
}