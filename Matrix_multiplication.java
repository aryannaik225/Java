import java.util.Scanner;
class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;

        //First Matrix
        System.out.println("Enter the number of ROWS in first matrix: ");
        int m = sc.nextInt();
        System.out.println("Enter the number of COLUMNS in first matrix: ");
        int n = sc.nextInt();

        //Taking input of values
        int[][] matrix_1 = new int[m][n];
        System.out.println("Enter the values for first matrix");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println("Enter the value at position "+(i+1)+" x "+(j+1));
                matrix_1[i][j] = sc.nextInt();
            }
        }

        //Showcasing the matrix
        System.out.println("You have entered the matrix: ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(" " +matrix_1[i][j]);
            }
            System.out.println(" ");
        }    

        //---------------------------------------------------------------------------------------

        //Second Matrix
        System.out.println("Enter the number of ROWS in second matrix: ");
        int a = sc.nextInt();
        System.out.println("Enter the number of COLUMNS in second matrix: ");
        int b = sc.nextInt();

        //Taking value input
        int[][] matrix_2 = new int[a][b];
        System.out.println("Enter the values for first matrix");
        for(i=0;i<a;i++)
        {
            for(j=0;j<b;j++)
            {
                System.out.println("Enter the value at position "+(i+1)+" x "+(j+1));
                matrix_2[i][j] = sc.nextInt();
            }
        }

        //Showcasing the matrix
        System.out.println("You have entered the matrix: ");
        for(i=0;i<a;i++)
        {
            for(j=0;j<b;j++)
            {
                System.out.print(" " +matrix_2[i][j]);
            }
            System.out.println(" ");
        }

        //--------------------------------------------------------------------------------------------
        //MULTIPLICATION OF THE MATRICES

        //INITIATE A NEW MATRIX OF NO. OF ROWS OF FIRST MATRIX AND NO OF COLUMNS OF SECOND MATRIX

        int[][] matrix_multiply = new int[m][b];
        int x,y,sum,w,z;

        for(i=0;i<m;i++)
        {
            for(j=0;j<b;j++)
            {
                sum=0;
                for(x=0;x<n;x++)
                {
                    for(y=0;y<a;y++)
                    {
                        if(x==y)
                        {
                            sum = sum + (matrix_1[i][x]*matrix_2[y][j]);
                        }
                    }
                }
                matrix_multiply[i][j] = sum;
            }
        }
        
        //PRINTING OF THE FINAL MATRIX
        System.out.println("The matrix multiplication gives: ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<b;j++)
            {
                System.out.print(" " +matrix_multiply[i][j]);
            }
            System.out.println(" ");
        }
    }
}