import java.util.*;


public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        String rev = new String();

        System.out.println("Enter a word: ");
        str = sc.nextLine();

        StringBuffer str1 = new StringBuffer(str);
        str1.reverse();
        rev=str1.toString();

        if(str.equalsIgnoreCase(rev))
        {
            System.out.println(str+ " is a palindrome");
        }
        else 
        {
            System.out.println(str+ " is not a palindrome");
        }
        sc.close();
    }
}