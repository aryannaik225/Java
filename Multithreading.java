class PrintNumbers implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number: " + i);
        }
    }
}

class PrintSquares implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Square: " + i * i);
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        
        Runnable numbersRunnable = new PrintNumbers();
        Runnable squaresRunnable = new PrintSquares();

        Thread t1 = new Thread(numbersRunnable);
        Thread t2 = new Thread(squaresRunnable);

        t1.start();
        t2.start();
    }
}