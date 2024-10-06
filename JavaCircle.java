import java.util.Scanner;

class Circle {
    public static void circumference(float radius) {
        float c;
        c = 2f * 3.14f * radius;
        System.out.println("Circumference of the circle = " + c);
    } 
    
    public static void area(float radius) {
        float a;
        a = 3.14f * radius * radius;
        System.out.println("Area of the circle = " + a);
    }
        public static void main(String[] args) {
        Circle obj = new Circle();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter radius of the circle ");
        float r = input.nextFloat();
        System.out.println("You entered radius = " + r);
        
        circumference(r);
        area(r);
    }
}