package Introduction.Polymorphism;

class Shape {
    double dimension1;
    double dimension2;

    Shape(double a, double b) {
        dimension1 = a;
        dimension2 = b;
    }

    double area() {
        System.out.println("Area for Shape is undefined");
        return 0;
    }
}

class Rectangle extends Shape {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside area() of Rectangle class");
        return (dimension1 * dimension2);
    }
}

class Triangle extends Shape {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("In area() of Triangle class");
        return (dimension1 * dimension2 / 2);
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Shape shape = new Shape(10, 10);
        Rectangle rectangle = new Rectangle(9, 7);
        Triangle triangle = new Triangle(11, 18);

        Shape shapeReference;

        shapeReference = shape;
        System.out.println("area() method of Shape class: " + shapeReference.area());
        System.out.println("-----");

        shapeReference = rectangle;
        System.out.println("area() method of Rectangle class: " + shapeReference.area());
        System.out.println("-----");

        shapeReference = triangle;
        System.out.println("area() method of Rectangle class: " + shapeReference.area());
    }
}
