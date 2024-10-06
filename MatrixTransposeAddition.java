import java.util.*;

class MatrixTransposeAddition {

    int a[][], b[][], sum[][], t[][];
    int r, c, i, j;
    
    void read()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter dimensions for matrix: ");
        System.out.println("Rows: ");
        r = sc.nextInt();
        System.out.println("Column: ");
        c = sc.nextInt();
        a = new int[r][c];
        b = new int[r][c];

        System.out.println(" ");
        System.out.println("Enter values for matrix 1");
        for(i=0; i<r; i++)
        {
            for(j=0; j<c; j++)
            {
                System.out.println("Enter value at position "+(i+1)+"x"+(j+1));
                a[i][j] = sc.nextInt();
            }
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.println("Enter values for matrix 2");
        for(i=0; i<r; i++)
        {
            for(j=0; j<c; j++)
            {
                System.out.println("Enter value at position "+(i+1)+"x"+(j+1));
                b[i][j] = sc.nextInt();
            }
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    void addition()
    {
        sum = new int[r][c];
        System.out.println("Addition of two matrix is");
        for(i=0; i<r; i++)
        {
            for(j=0; j<c; j++)
            {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
    }

    void display()    
    {
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    void transpose()
    {
        t=new int[r][c];
        for(i=0;i<c;i++)
        {
            for(j=0;j<r;j++)
            {
                t[i][j]=sum[j][i];
            }
        }
        System.out.println("Transpose of the sum matrix is: ");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(t[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        MatrixTransposeAddition m1 = new MatrixTransposeAddition();
        m1.read();
        m1.addition();
        m1.display();
        m1.transpose();
    }
}