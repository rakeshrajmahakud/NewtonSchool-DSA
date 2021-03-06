package Introduction;

public class ClassExample1 {
    int num1; //non-static variable
    int num2; //non-static variable
    static int sum; //static variable

    //non-static method
    int addNumbers(int n1, int n2) {
        return (n1 + n2);
    }

    //static method
    static void printSum() {
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        //create an object of ClassExample1 class
        ClassExample1 classExample1
                = new ClassExample1();

        classExample1.num1 = 10;
        classExample1.num2 = 20;

        sum = classExample1.addNumbers(classExample1.num1, classExample1.num2);

        printSum();
    }
}
