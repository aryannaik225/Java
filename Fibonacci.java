import java.util.Scanner;

class Fibonacci {
    public static int calculate(int n)
    {
        if(n<=1)
        {
            return n; //0,1,1,2,3,5
        }
        else
        {
            return calculate(n-1)+calculate(n-2);
        }
    }

    public static void getFibonacci(int count)
    {
        for(int i=0; i<=count; i++)
        {
            System.out.println(calculate(i)+ " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fibonacci f1 = new Fibonacci();
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        f1.getFibonacci(num);
    }
}
