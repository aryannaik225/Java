/*1. take m and n as rows and columns
2. make matrix[m][n]
3. take input for the matrix
4. initiate a and b
5. if a == b then go ahead
6. else if a>b then b=a and go ahead
7. else if a<b then a=b and go ahead
8. make matrix[n][m]
wait i gotta try something...if it works the 4 to 7 step goes pooff
 */

 import java.util.Scanner;
public class Matrix_transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        System.out.println("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.println("Enter the number of column: ");
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

        System.out.println(" ");
        System.out.println("The matrix you entered is: ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(" " +matrix[i][j]);
            }
            System.out.println(" ");
        }

        int[][] matrix_transpose = new int[n][m]; //pay attention to the n and m placing

        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                matrix_transpose[j][i]=matrix[i][j]; //j and i placements
            }
        }

        System.out.println(" ");
        System.out.println("Transpose of the matrix is: ");
        for(i=0;i<n;i++)  //i is compared with n and not m here
        {
            for(j=0;j<m;j++)    //j is compared with m and n here
            {
                System.out.print(" " +matrix_transpose[i][j]);
            }
            System.out.println(" ");
        }
    }
}

//It works!!!!!!!!