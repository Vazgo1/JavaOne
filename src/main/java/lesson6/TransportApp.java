package lesson6;

public class TransportApp {
    public static void main(String[] args) {
        Bus bus = new Bus("1k",40,"Ikarus");
       // bus.move();
        //System.out.println(bus.stop());
        miniBus miniBus = new miniBus("1k",60,"Gazel","Guf");
        miniBus.move();
        System.out.println(miniBus.stop());


    }
}
