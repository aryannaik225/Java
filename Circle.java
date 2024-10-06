import java.util.Scanner;

class Circle {
    public static void circumference (float r) {
        float c = 2f * 3.14f * r;
        System.out.println("Circumference of the circle = " + c);
    }

    public static void area(float r) {
        float a = 3.14f * r * r;
        System.out.println("Area of the circle = " + a);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        float radius;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        radius = input.nextFloat();
        c1.circumference(radius);
        c1.area(radius);

    }
}