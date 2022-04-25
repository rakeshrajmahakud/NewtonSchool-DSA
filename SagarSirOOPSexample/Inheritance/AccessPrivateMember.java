package Introduction.Inheritance;

class E {
    int i;
    private int j;

    //setter
    public void setJ(int a) {
        j = a;
    }

    //getter
    public int getJ() {
        return j;
    }

    void setIJ(int x, int y) {
        i = x;
        j = y;
    }
}

class F extends E {
    int total;

    void sum() {
        total = i + getJ();

        System.out.println("Total: " + total);
    }
}

public class AccessPrivateMember {
    public static void main(String[] args) {
        F f = new F();
        f.i = 25;

        //take user input in a variable and pass the value of the variable
        int j = 100;
        f.setJ(j);
        f.sum();
    }
}
