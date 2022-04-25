package Introduction.Abstraction;

abstract class E {
    abstract void callMe(); //abstract method

    void callMeToo() {
        System.out.println("In callMeToo() method of class E");
    }
}

abstract class F extends E {
    void callMeOfF() {
        System.out.println("In callMeOfF() method of class F");
    }
}

class G extends F {
    void callMe() {
        System.out.println("In callMe() method of class G");
    }
}

public class AbstractClasses {
    public static void main(String[] args) {
        G g = new G();

        g.callMe();
        g.callMeToo();
        g.callMeOfF();
    }
}