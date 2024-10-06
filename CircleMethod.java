//The circle code with methods
import java.util.Scanner;
class circleMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculation c1 = new Calculation();

        System.out.println("Enter the radius of the circle: ");
        float r = sc.nextFloat();

        c1.circum(r);
        c1.area(r);
    }
}

class Calculation {
    public static void circum (float radius)
    {
        float c = 2f * 3.14f * radius;
        System.out.println("Circumference of the circle is: "+c);
    }

    public static void area (float radius)
    {
        float a = 3.14f * radius * radius;
        System.out.println("Area of the circle is: "+a);
    }
}
