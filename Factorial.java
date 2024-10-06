import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int result = fact(num);
        System.out.println("Factorial of " +num+ " is " +result);
    }

    public static int fact(int k)
    {
        if(k==0)
        {
            return 1;
        }
        else if(k>0)
        {
            return k*fact(k-1);
        }
        else
        {
            return 0;
        }
    }
}
// 5! = 5 x 4 x 3 x 2 x 1 = 120