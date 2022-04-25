package Introduction.Inheritance;

class Box {
    private double width;
    private double height;
    private double depth;

    Box() {
        width = 0;
        height = 0;
        depth = 0;
    }

    Box(Box box) {
        //System.out.println("Reference of box: " + Integer.toHexString(box.hashCode()));

        width = box.width;
        height = box.height;
        depth = box.depth;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return (width * height * depth);
    }

    /*
    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }
     */
}

class BoxWeight extends Box {
    double weight;

    BoxWeight() {
        super();
        weight = 0;
    }

    BoxWeight(BoxWeight box) {
        super(box);
        weight = box.weight;
    }

    BoxWeight(double w, double h, double d, double wt) {
        super(w, h, d);
        weight = wt;
    }
}

public class SuperKeywordUseI {
    public static void main(String[] args) {
        /*
        Box invisibleBox = new Box();
        System.out.println("Reference of invisible box: " + Integer.toHexString(invisibleBox.hashCode()));

        Box anotherInvisibleBox = new Box(invisibleBox);

        System.out.println("invisibleBox: " + invisibleBox);
        System.out.println("anotherInvisibleBox: " + anotherInvisibleBox);

        Box largeBox = new Box(100, 75, 100);
         */
        BoxWeight boxWeight1 = new BoxWeight(10, 20, 15, 40.8);
        BoxWeight boxWeight2 = new BoxWeight();
        BoxWeight boxWeight1Clone = new BoxWeight(boxWeight1);

        double volume;
        volume = boxWeight1.volume();
        System.out.println("boxWeight1 volume: " + volume);

        volume = boxWeight2.volume();
        System.out.println("boxWeight2 volume: " + volume);

        volume = boxWeight1Clone.volume();
        System.out.println("boxWeight1Clone volume: " + volume);
    }
}
