package lesson6;

public class Bus {
    private String number;
    private int capacity;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    private  int power;

    public Bus(String number, int capacity, int power) {
        this.number = number;
        this.capacity = capacity;
        this.power = power;
    }
}
