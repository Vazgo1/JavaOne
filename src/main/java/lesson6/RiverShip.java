package lesson6;

public class RiverShip extends Transport{
public int cost;
    public RiverShip(String number, int capacity,int cost) {
        super(number, capacity);
        this.cost = cost;
    }

    public RiverShip() {
    }

    //@Override
    public int stop() {
        return 0;
    }

    //@Override
    public void dinDon() {
        System.out.println("Трамвай сигналь");
    }
}
