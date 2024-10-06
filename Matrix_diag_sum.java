import java.util.Scanner;
class Matrix_diag_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;

        System.out.println("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println("Enter value at position " +(i+1)+ " x " +(j+1));
                matrix[i][j] = sc.nextInt();
            }
        }

        int sum=0;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j)
                {
                    sum = sum + matrix[i][j];
                }
            }
        }
        System.out.println("Sum of diagonal elements of the matrix is: " +sum);
    }
}
