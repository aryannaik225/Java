import java.util.Scanner;

class OverloadArea {
    
    void area(int x, int y)
    {
        System.out.println("Area of rectangle ==> " +x*y);
    }
    
    void area(int x)
    {
        System.out.println("Area of square ==> " +x*x);
    }
    
    void area(float x)
    {
        System.out.println("Area of circle ==> " +3.14*x*x);
    }
    
    void area(float x, float y)
    {
        System.out.println("Area of the triangle ==> " +0.5*x*y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OverloadArea o1 = new OverloadArea();
        
        System.out.println("Enter Length of the rectangle: ");
        int l = sc.nextInt();
        System.out.println("Enter breadth of the rectangle: ");
        int b = sc.nextInt();
        System.out.println(" ");
        
        System.out.println("Enter Side of the square: ");
        int s = sc.nextInt();
        System.out.println(" ");
        
        System.out.println("Enter Radius of the circle: ");
        float r = sc.nextFloat();
        System.out.println(" ");
        
        System.out.println("Enter Base of the triangle: ");
        float base = sc.nextFloat();
        System.out.println("Enter height of the triangle: ");
        float height = sc.nextFloat();
        System.out.println(" ");
        
        o1.area(l, b);
        o1.area(s);
        o1.area(r);
        o1.area(base, height);
        
        sc.close();
    }
}
