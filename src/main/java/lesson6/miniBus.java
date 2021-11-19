package lesson6;

public class miniBus extends Bus {
    private String musicGenre;

    public miniBus(String number, int capacity, String model, String musicGenre) {
        super(number,capacity,model);
        this.musicGenre = musicGenre;
    }

    //@Override
    public void dinDon() {
        System.out.println("Микроавтобус сигналь");
    }

    //@Override
    public void move() {
        System.out.println("черные глаза");
    }

    //@Override
    public int stop() {
        return 4;
    }
}
