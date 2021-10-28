package less5;

public class TaskApp {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());
        thread1.start();
        thread2.start();


        new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());

        }).start();

       Thread thread = new Thread(() -> {
            System.out.println("Demon" + Thread.currentThread().getName());

        });
       thread.setDaemon(true);
       thread.start();
    }

    public static  class MyRunnable implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("thread out :" + i);
            }

        }
    }
}
