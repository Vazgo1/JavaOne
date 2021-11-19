package lesson7;

public class Plate {

    protected int amountOfFood;

    public Plate(){

    }

    public Plate(int amountOfFood) {
        this.amountOfFood = amountOfFood;
    }

    public int getAmountOfFood() {
        return amountOfFood;
    }

    public void setAmountOfFood(int amountOfFood) {
        this.amountOfFood = amountOfFood;
    }

    public void decreaseAmountOfFood(int amount){
        this.amountOfFood -= amount ;
    }
    public void negative() {
        if (getAmountOfFood() < 20) {
            amountOfFood = 30;
        }


    }

    public void IsEmpty() {
        if (amountOfFood < 0){
            amountOfFood = 0;

        }
    }

    @Override
    public String toString() {
        return "Plate{" +
                "amountOfFood=" + amountOfFood +
                '}';
    }
}

