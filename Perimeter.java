import java.util.Scanner;

class Rectangle {
    public static void perimeter(float l, float b) {
        float p;
        p = (2f*l)+(2f*b);
        System.out.println("Perimeter of the rectangle = " + p);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Scanner input = new Scanner(System.in);
        float length, breadth;
        System.out.println("Enter the length of the rectangle: ");
        length = input.nextFloat();
        System.out.println("Enter the breadth of the rectangle: ");
        breadth = input.nextFloat();
        
        r1.perimeter(length, breadth);
    }
}