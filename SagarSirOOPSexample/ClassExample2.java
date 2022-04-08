package SagarSirOOPSexample;

public class ClassExample2 {
    String name;
    String contactNumber;

    //default constructor
    ClassExample2() {
        name = "undefined";
        contactNumber = "undefined";
    }

    //parameterized constructor
    ClassExample2(String name, String contactNumber) {
        /*
        name = name;
        contactNumber = contactNumber;
         */
        this.name = name;
        this.contactNumber = contactNumber;
    }

    void printObjectValues(ClassExample2 object) {
        System.out.println("object name: " + object.name);
        System.out.println("this keyword name: " + this.name);
    }

    public static void main(String[] args) {
        //Method 1: create an object and initialize
        ClassExample2 aman = new ClassExample2();
        aman.name = "Aman";
        aman.contactNumber = "9999999999";
        aman.printObjectValues(aman);

        ClassExample2 amit = new ClassExample2();
        amit.name = "Amit";
        amit.contactNumber = "8888888888";
        amit.printObjectValues(amit);

        ClassExample2 amrita = new ClassExample2("Amrita", "7777777777");
        System.out.println("'name' in 'amrita' object: " + amrita.name);
        amrita.printObjectValues(amrita);
    }
}
