import java.util.*;

class OddException extends Exception {
    OddException(String message)
    {
        super(message);
    }
}

public class OddNumbException {

    static int getInputNumber() throws OddException {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int numb = sc.nextInt();
            sc.close();
            if(numb%2!=0)
            {
                throw new OddException("Input must be an even number");
            }
            return numb;
    }
    
    static int calculateSquare(int numb) {
        return numb*numb;
    }

    public static void main(String[] args) {
        try {
            int number = getInputNumber();
            int result = calculateSquare(number);
            System.out.println("Square ==> "+result);
        } catch (OddException e) {
            System.out.println("Error! "+e.getMessage());
        }
    }
}