import java.util.Scanner;

class  NaturalNumbers {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1;
        System.out.println("Enter a natural number: ");
        int numb = sc.nextInt();
        System.out.println("The number you entered is : " + numb);
        System.out.println("Natural Numbers until " + numb + " are:-");
        while (i<=numb)
        {
            System.out.println("" + i);
            i++;
        }
     }
}
