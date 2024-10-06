import java.util.Scanner;
class A {
    void calculate(double x) {
        System.out.println("Square: " +x*x);
    }
}

class B extends A{
    void calculate(double x) {
        System.out.println("Root: " +Math.sqrt(x));
    }
}

class MethodOverride {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entnajbnkgen: ");
        double first = sc.nextDouble();
        double second = sc.nextDouble();
        A a = new A();
        a.calculate(first);
        A b = new B();
        b.calculate(second);
    }   
}
