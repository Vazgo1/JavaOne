package lesson6;

public class PolyApp {
    public static void main(String[] args) {

        Transport bus = new Bus("а123ис", 40,"Liza");

        Transport minibus = new miniBus("g543hg",20,"Benz","RiP");

        Transport riverShip = new RiverShip("admiral",100,500);
        Transport[] transports = new Transport[]{bus,minibus,riverShip};
        for (Transport transport: transports){
            if (transport.getCapacity() < 30){
                continue;
            }
            System.out.println(transport);
        }
    }
}
