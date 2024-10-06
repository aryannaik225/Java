import java.util.Scanner;

class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your marks: ");
        int m = sc.nextInt();
        
        int n = m/10;
       
        switch (n) {
            case 0: System.out.println("Failed");
                    break;
            case 1: System.out.println("Failed");
                    break;
            case 2: System.out.println("Failed");
                    break;
            case 3: System.out.println("Failed");
                    break;
            case 4: System.out.println("Pass");
                    break;
            case 5: System.out.println("Pass");
                    break;
            case 6: System.out.println("Second Class");
                    break;
            case 7: System.out.println("First Class");
                    break;
            case 8: System.out.println("Distinction");
                    break;
            case 9: System.out.println("Distinction");
                    break;
            case 10: System.out.println("Distinction");
                    break;
            default : System.out.println("Invalid Input");         
                    break;       
        }
        sc.close();
    }    
}
