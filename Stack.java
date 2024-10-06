import java.util.*;

class Stack {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        int array[] = new int[n];
        Stack s1 = new Stack();
        int top = -1;
        
        int choice=0;
        do {
            System.out.println(" ");
            System.out.println("Enter your choice: ");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Peek");
            System.out.println("4.Display");
            System.out.println("5.END");
            choice = sc.nextInt();

            switch (choice) {
                case 1: top = s1.push(array, top, sc);
                break;
                case 2: top = s1.pop(array, top);
                break;
                case 3: s1.peek(array, top);
                break;
                case 4: s1.display(array, top);
                break;
                case 5: System.out.println("Ending....Ended!!");
                break;
                default: System.out.println("Enter correct choice next time");
                break;
            }
            sc.nextLine();
        } while (choice!=5);
    
        sc.close();
    }

    int pop(int array[], int top)
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        else{
            System.out.println(array[top]+" is poped");
            top--;
        }
        return top;
    }

    int push(int array[], int top, Scanner sc)
    {
        if(top==n-1)
        {
            System.out.println("Stack is full");
        }
        else{
            top++;
            System.out.println("Enter element to be pushed: ");
            array[top] = sc.nextInt();
        }
        return top;
    }

    void peek(int array[], int top)
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Top element is: "+array[top]);
        }
    }

    void display(int array[], int top)
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        else{
            for(int i=0; i<=top; i++)
            {
                System.out.println(array[i]);
            }
        }
    }
}