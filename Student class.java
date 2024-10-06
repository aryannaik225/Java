import java.util.Scanner;

class Student {
    public static void read() {
        int a;
        int i=0;
        String[] name = new String[100];
        int[] roll = new int[100];
        Scanner input = new Scanner(System.in);
        while(a!=0) {
          System.out.println("Enter the name of the student: ");
          name[i] = input.next();
          System.out.println("Enter roll number of the student: ");
          roll[i] = input.nextInt();
          i++;
          System.out.println("Do you want to continue?: ");
          a = input.nextInt();
        }
    }
    public static void display() {
        int j;
        for(j=0; j<=i; j++)
        {
            System.out.println("Name of student" + j+1 + " : " + name[j]);
            System.out.println("Roll Number: " + roll[j]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student s1 = new Student();
        s1.read();
        s1.display();
    }

}