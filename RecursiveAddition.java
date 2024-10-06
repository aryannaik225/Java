import java.util.Scanner;

class RecursiveAddition {
    
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    int result = sum(num);
    System.out.println("Sum of numbers till " +num+ " is "+result);
   }

   public static int sum(int k)
   {
    if(k>0)
    {
        return k + sum(k-1);
    }
    else{
        return 0;
    }
   }

}
