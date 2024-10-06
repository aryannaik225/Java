import java.lang.Thread;


class A extends Thread {
public void run(){
for(int i=1;i<=5;i++){
if(i==2)
Thread.yield();
System.out.println("\t From Thread A :"+i);
}
System.out.println("Exit from A");
}
}

class B extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("\t From Thread B :" + j);
            if (j == 3)
                return;
        }
        System.out.println("Exit from B");
    }
}

class C extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            try {
                Thread.sleep(3000);
                System.out.println("\t From Thread C :" + k);
            } catch (Exception e) {
            }
        }
        System.out.println("Exit from C");
    }
}

class Yield {
    public static void main(String args[]) {
        A a1 = new A();
        B b1 = new B();
        C c1 = new C();
        a1.start();
        b1.start();
        c1.start();
    }
}