import java.util.Scanner;
//Without methods
class Rectangle {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter length of the rectangle: ");
    int length = sc.nextInt();
    System.out.println("Enter breadth of the rectangle: ");
    int breadth = sc.nextInt();

    int perimeter, area;
    perimeter = (2*length)+(2*breadth);
    area = length * breadth;
    System.out.println("Perimeter of the rectangle is: " +perimeter);
    System.out.println("Area of the rectangle is: " +area);
}
}