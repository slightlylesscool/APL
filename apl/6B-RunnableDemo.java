class A implements Runnable {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                Thread.sleep(1000);
                System.out.println("good morning");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class B implements Runnable {
    public void run() {
        try {
            for (int j = 1; j <= 10; j++) {
                Thread.sleep(2000);
                System.out.println("hello");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class C implements Runnable {
    public void run() {
        try {
            for (int k = 1; k <= 10; k++) {
                Thread.sleep(3000);
                System.out.println("welcome");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
        C c1 = new C();
        
        Thread t1 = new Thread(a1);
        Thread t2 = new Thread(b1);
        Thread t3 = new Thread(c1);
        
        t1.start();
        t2.start();
        t3.start();
    }
}
