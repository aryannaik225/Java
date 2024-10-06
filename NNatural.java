import java.util.Scanner;

class NNatural {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the last number to be printed: ");
        int num = sc.nextInt();

        int i=1;
        while(i<=num)
		{
			System.out.println(" "+i);
			i++;
		}
    }
}
