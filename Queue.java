import java.util.*;

class Queue {
    static int n;
    static int front = -1;
    static int rear = -1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the queue: ");
        n = sc.nextInt();
        int queue[] = new int[n];    
        int choice=0;
        do {
            System.out.println(" ");
            System.out.println("Enter your choice: ");
            System.out.println("1.Insert");
            System.out.println("2.Delete");
            System.out.println("3.Display");
            System.out.println("4.END");
            choice = sc.nextInt();
            Queue q1 = new Queue();
            switch (choice) {
                case 1: q1.insert(queue, sc);
                break;
                case 2: q1.delete(queue);
                break;
                case 3: q1.display(queue);
                break;
                case 4: System.out.println("Ending....Ended!!");
                break;
                default: System.out.println("Enter correct choice next time");
                break;
            }
            sc.nextLine();
        } while (choice!=4);
    }

    void insert(int queue[], Scanner sc)
    {
        if(rear==n-1)
        {
            System.out.println("Queue is full");
        }
        else{
            if(front==-1)
            {
                front++;
            }
            rear++;
            System.out.println("Enter Data: ");
            queue[rear]=sc.nextInt();
        }
    }

    void delete(int queue[])
    {
        if(front==-1 || front>rear)
        {
            System.out.println("Queue is empty");
        }
        else{
            System.out.println(queue[front]+" is deleted");
            front++;
        }
    }

    void display(int queue[])
    {
        if(front==-1 || front>rear)
        {
            System.out.println("Queue is empty");
        }
        else{
            for(int i=front; i<=rear; i++)
            {
                System.out.println(queue[i]);
            }
        }
    }
}