package Introduction.Inheritance;

class C {
    int i;
    private int j;

    void setIJ(int x, int y) {
        i = x;
        j = y;
    }
}

class D extends C {
    int total;

    void sum() {
        //total = i + j; -> 'j' is not accessible
    }
}

public class InheritanceWithPrivateMember {
    public static void main(String[] args) {

    }
}
