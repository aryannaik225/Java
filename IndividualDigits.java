import java.util.Scanner;

class IndividualDigits {
    public static void main(String[] args) {
        int numb;
        Scanner sc = new Scanner(System.in);
        IndividualDigits i1 = new IndividualDigits();
        System.out.println("Enter a four digit number: ");
        numb = sc.nextInt();
        
        int i, a, b, c, d;
            d=numb%10;
            numb=numb/10;
            c=numb%10;
            numb=numb/10;
            b=numb%10;
            numb=numb/10;
            a=numb%10;
            System.out.println("" + a);
            System.out.println("" + b);
            System.out.println("" + c);
            System.out.println("" + d);
    }    
}
