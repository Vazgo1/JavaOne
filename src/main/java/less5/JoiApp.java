package less5;

public class JoiApp {
    private static Object Counter;

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i ++){

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Counter);
            }
        });

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i ++){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Counter " + Counter );
            }
         });

        thread.start();
        thread1.start();
        thread1.join();
        thread.join();
        System.out.println("End");

    }
    public  static class Counter{
        private int value;

        public int getValue(){
            return value;
        }
        public void increment(){
            value++;
        }
    }
}
