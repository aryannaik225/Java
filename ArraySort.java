import java.util.Scanner;
class ArraySort {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = s1.nextInt();
        int array[] = new int[size];
        int i, j, temp;
        for(i=0; i<size; i++)
        {
            System.out.print("Enter value: ");
            array[i] = s1.nextInt();
        }

        for(i=0; i<size; i++)
        {
            for (j=i+1; j<size; j++)
            {
                if(array[i]>array[j])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for(i=0; i<size; i++)
        {
            System.out.println(+array[i]);
        }
    }
}
