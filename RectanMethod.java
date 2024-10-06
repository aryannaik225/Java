import java.util.Scanner;

class RectanMethod {
    void perimeter(int l, int b)
    {
        int peri = (2*l)+(2*b);
        System.out.println("Perimeter of the rectangle is: "+peri);
    }
    
    void area(int l, int b)
    {
        int a = l*b;
        System.out.println("Area of the rectangle is: "+a);    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RectanMethod r1 = new RectanMethod();
        
        System.out.println("Enter the length of the rectangle: ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle: ");
        int breadth = sc.nextInt();
        
        r1.perimeter(length, breadth);
        r1.area(length, breadth);
       
        sc.close();
    }
}
