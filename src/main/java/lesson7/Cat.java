package lesson7;
// Кот голодный. Кот хочет есть. Поесть он можетиз тарелки
public class Cat  {

    private String name;
    private int appetit;
    private boolean satiety;



    public Cat(String name, int appetit,boolean satiety) {
        this.name = name;
        this.appetit = appetit;
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetit() {
        return appetit;
    }


    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public void setAppetit(int appetit) {
        this.appetit = appetit;


    }
    public void eat (Plate plate) {
        if (this.appetit > plate.getAmountOfFood()) {

            System.out.println(name + " Коту не хватает еды ");
        } else {
            plate.decreaseAmountOfFood(this.appetit);
            satiety = true;
            System.out.println(name + " Кот ест ");
        }
    }





    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetit=" + appetit +
                ", satiety=" + satiety +
                '}';
    }
}

