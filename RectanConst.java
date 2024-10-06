import java.util.Scanner;
class RectanConst {
    
    RectanConst(int l, int b)
    {
        int p = (2*l)+(2*b);
        int a = l*b;
        System.out.println("Perimeter of the rectangle is: "+p);
        System.out.println("Area of the rectangle is: "+a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Enter the length of the rectangle: ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle: ");
        int breadth = sc.nextInt();

        RectanConst r1 = new RectanConst(length, breadth);
    }
}
