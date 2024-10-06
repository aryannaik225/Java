import java.util.*;

abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    double radius;
    Circle(double r)
    {
        this.radius = r;
    }

    double calculateArea()
    {
        double area = 3.14*radius*radius;
        return area;
    }
}

class Rectangle extends Shape {
    double length, breadth;
    Rectangle(double l, double b)
    {
        this.length = l;
        this.breadth = b;
    }

    double calculateArea()
    {
        double area = length*breadth;
        return area;
    }
}

class Traingle extends Shape {
    double base, height;
    Traingle (double b, double h)
    {
        this.base = b;
        this.height = h;
    }

    double calculateArea()
    {
        double area = 0.5*base*height;
        return area;
    } 
}


public class abstractShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of the circle: ");
        double r = sc.nextDouble();
        System.out.println("");
        System.out.println("Enter the length of the rectangle: ");
        double l = sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle: ");
        double b = sc.nextDouble();
        System.out.println(" ");
        System.out.println("Enter the base of the triangle: ");
        double base = sc.nextDouble();
        System.out.println("Enter the height of the triangle: ");
        double height = sc.nextDouble();

        Circle c1 = new Circle(r);
        Rectangle r1 = new Rectangle(l, b);
        Traingle t1 = new Traingle(base, height);

        System.out.println("Area of the Circle ==> "+c1.calculateArea());
        System.out.println("Area of the Rectangle ==> "+r1.calculateArea());
        System.out.println("Area of the Triangle ==> "+t1.calculateArea());

        sc.close();
    }    
}
