import java.util.Scanner;
class DivideTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(num%10==0)
        {
            System.out.println(num+ " is divisible by 10");
        }
        else 
        {
            System.out.println(num+" is not divisible by 10");
        }
    }
}
