package lesson7;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        Plate plate = new Plate(30);

//Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
        Cat[] cat = new Cat[5];
        cat[0] = new Cat("Barsic", 20, false);
        cat[1] = new Cat("Mumu", 20, false);
        cat[2] = new Cat("Murzic", 20, false);


        for (int i = 0; i < 3; i++) {
            System.out.println(cat[i]);
        }




        // int newAmountOfFood =  plate.getAmountOfFood() - cat.getAppetit();
        // plate.setAmountOfFood(newAmountOfFood);
        // plate.decreaseAmountOfFood(cat.getAppetit ());
        //plate.decreaseAmountOfFood(cat1.getAppetit ());
        for (int i = 0; i < 3; i++) {

            cat[i].eat(plate);// Коту не хватает еды
            plate.IsEmpty();// в тарелке с едой не могло получиться отрицательного количества
            plate.negative(); // Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.


            System.out.println(plate);

        }




    }


}

