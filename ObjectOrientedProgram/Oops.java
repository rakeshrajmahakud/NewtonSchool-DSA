package ObjectOrientedProgram;
class Vehicle{
    String company;
    String type;
    int wheel;

    //method
    public void drive(){
        System.out.println("driving");
        System.out.println(this.company);
        System.out.println(this.type);
    }
    //constructor
    Vehicle(String company,String type){
        this.company=company;
        this.type=type;
    }
    //another constructor with same name
    Vehicle(){
        this.company= "4wheeler";
        this.type= "car";
    }
    Vehicle(String type){
        this.type= "car";
    }
// another construc  same name

    Vehicle(Vehicle v1){
        this.company = v1.company;
        this.type = v1.type;
    }
}


//main class
public class Oops {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle("hero","bike") ;
        vehicle.drive();
        //v1 vehicle constructor object
        Vehicle vehicle2= new Vehicle(vehicle);

    }
}
