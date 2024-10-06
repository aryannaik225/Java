//Aryan Naik 22AD1022
import java.util.*;

class ComplexNum {

    int real, imaginary;//globally declare kar rahe

    ComplexNum()//default constructor
    {
        real = 0;
        imaginary = 0;
    }

    ComplexNum(int r, int i)
    {
        this.real = r;
        this.imaginary = i;
    }

    public void show()//method
    {
        System.out.println(this.real+"+"+this.imaginary+"i");
    } 

    static ComplexNum sum(ComplexNum n1, ComplexNum n2)//class ka method
    {
        ComplexNum res = new ComplexNum(0, 0);
        res.real = n1.real + n2.real;
        res.imaginary = n1.imaginary + n2.imaginary;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real and imaginary numbers of first complex number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        ComplexNum c1 = new ComplexNum(a, b);
        System.out.println("Enter the real and imaginary numbers of second complex number: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        ComplexNum c2 = new ComplexNum(x, y);

        System.out.println("First Complex number is: ");
        c1.show();
        System.out.println("Second Complex number is: ");
        c2.show();

        ComplexNum res = sum(c1, c2);
        System.out.println("The addition of the two complex numbers is: ");
        res.show();
        sc.close();
    }
}
