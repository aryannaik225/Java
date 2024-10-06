import java.util.Scanner;

class DigitCount {
    public static int countDigits(int number) {
        if (number == 0) {
            return 0;
        }
        else {
        return 1 + countDigits(number / 10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //i dont think i need method so cool
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        //nvm method is necessary as i have to use recursion i forgot
        int digitCount = countDigits(num);
        System.out.println("Number of digits: " + digitCount);
    }
    
}

//123456 ==> Digit Count ==> 6

//int 0123 then %10 should give me 3...then until 0 when it gives 0 then it should stop and count..but 
//what if theres 0 in between... 1080...
//%10 ++count until n==0...yeah this should work...wait no...not %10...instead /10 and as its int
//dividing should not leave decimals...noiceee!!
//these my brain thoughts ignore if i forget to delete it 