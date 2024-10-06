import java.util.Scanner;

class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        int i;
        int count = 0;
        for(i=0; i<size; i++)
        {
            System.out.print("Enter a value: ");
            array[i] = sc.nextInt();
        }
        System.out.print("Enter the number to be searched: ");
        int search = sc.nextInt();

        for(i=0; i<size; i++)
        {
            if(array[i]==search)
            {
            count++;
            }
        }

        if(count==1)
        {
            
            System.out.println(search + " was found");
        }
        else 
        {
            System.out.println(search + " was not found");
        }
    }
}