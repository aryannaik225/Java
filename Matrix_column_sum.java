import java.util.Scanner;
class Matrix_column_sum {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;

        
        System.out.println("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println("Enter the value at position " +(i+1)+ " x " +(j+1));
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("You entered the matrix");

        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(" " +matrix[i][j]);
            }
            System.out.println(" ");
        }
int sum;
        for(j=0;j<n;j++)
        {
            sum=0;
            for(i=0;i<m;i++)
            {
                sum=sum+matrix[i][j];
            }
            System.out.println("Sum of elements in column " +(j+1)+ " is " +sum);
        }
    }
}
