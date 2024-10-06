import java.util.Scanner;

class DivByTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int numb = sc.nextInt();

        if(numb%10==0)
        {
            System.out.println("" + numb + " is divisble by 10");
        }
        else 
        {
            System.out.println("" + numb + " is NOT divisble by 10");
        }
    }
}
