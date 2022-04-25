package Introduction.Inheritance;

class G {
    int i;
}

class H extends G {
    int i;

    H(int i, int j) {
        super.i = i;
        this.i = j;
    }

    void show() {
        System.out.println("i: " + super.i);
        System.out.println("i: " + i);
    }
}

public class SuperKeywordUseII {
    public static void main(String[] args) {
        H h = new H(20, 10);
        h.show();
    }
}
