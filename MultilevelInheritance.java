import java.util.*;

class MultilevelInheritance {
    public static void main(String[] args) {
        Volume v1 = new Volume();
        v1.calculate();
        v1.display();
    }
}

class Circle {
    double radius;

    Circle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        radius = sc.nextDouble();
        sc.close();
    }
}

class Area extends Circle {
    double area;

    void calculate() {
        area = 3.14 * radius * radius;
    }

    void display() {
        System.out.println("Area of the circle: " + area);
    }
}

class Volume extends Area {
    double volume;

    void calculate() {
        super.calculate();
        volume = (3.0 / 4) * area * radius; 
    }

    void display() {
        super.display();
        System.out.println("Volume of the circle: " + volume);
    }
}
