package less5;

public class WaitNotifyApp {
    Object look = new Object();

    private String current = "А";

    public static void main(String[] args) {
        WaitNotifyApp app = new WaitNotifyApp();
        Thread t1 = new Thread(() -> {
            app.printA();
        });
        Thread t2 = new Thread(() -> {
            app.printB();
        });

        t1.start();
        t2.start();

    }

    public void printA() {
        for (int i = 0; i < 5; i++) {
            System.out.print("A");
        }
    }

    public void printB() {
        for (int i = 0; i < 5; i++) {
            System.out.print("B");
        }
    }
}