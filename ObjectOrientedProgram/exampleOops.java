package ObjectOrientedProgram;
// sagar sir course cordinator  /// 04 /04 /2022   oops class
public class exampleOops {

        int num1 ;
        static int num2;    // this is a static variable

    public static void main(String[] args) {
        exampleOops obj = new exampleOops();
        obj.num1 = 25;    //here we cannot access num2 without declaring an object thats why we declare obj  webject
        num2= 10;   // this variable can be accessed without declareing an object

    }
}
