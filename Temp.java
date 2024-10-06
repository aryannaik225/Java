import java.util.*;

class Temp {

    void area(int x) {
        System.out.println("Area of square = "+(x*x));
    }

    void area(int x, int y) {
        System.out.println("Area of rectangle = "+(x*y));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of side: ");
        int side1 = sc.nextInt();
        System.out.println("Enter breadth of side: ");
        int side2 = sc.nextInt();

        Temp t1 = new Temp();
        t1.area(side1);
        t1.area(side1,side2);
        sc.close();
    }

}