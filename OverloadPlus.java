import java.util.Scanner;

class OverloadPlus {
    
    void plusMethod(int x, int y)
    {
        int sum = x+y;
        System.out.println("Sum of two integers is ==> " +sum);
    }

    void plusMethod(double x, double y)
    {
        double sum = x+y;
        System.out.println("Sum of two doubles is ==> " +sum);
    }
    
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        //aaaaaaaaaaaahhhhhhhhhhh
        OverloadPlus o1 = new OverloadPlus();

        System.out.println("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Enter two doubles: ");
        double c = sc.nextDouble();
        double d = sc.nextDouble();

        o1.plusMethod(a, b);
        o1.plusMethod(c, d);
    }
}