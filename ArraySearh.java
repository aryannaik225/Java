import java.util.*;
class ArraySearh {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int size, i;
        System.out.println("Enter size of array: ");
        size = s1.nextInt();
        int array[] = new int[size];
        for(i=0; i<size; i++)
        {
            System.out.println("Enter value: ");
            array[i] = s1.nextInt();
        }
        
        System.out.println("Enter the number to search: ");
        int s = s1.nextInt();
        int temp=0;
        int gnj;
        
        for(i=0;i<size;i++)
        {
            if(s==array[i])
            {
                temp++;
                
                gnj=i;
            }
        }
        if(temp==1)
        {
            System.out.println(s + "  was found at position " + gnj);
        }
        else{
            System.out.println(s + "  was not found");
        }
    }
}
