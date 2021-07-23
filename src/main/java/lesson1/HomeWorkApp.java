package lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {

        compareNumbers();
         checkSumSign();
    }


    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 10;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else if (c < 0) {
            System.out.println("Сумма отрецательная");
        }
    }

    public static void printColor() {
        int value = -5;

        if (value < 0) {
            System.out.println("Красный");
        } else if (value > 0 && value < 101) {
            System.out.println("Желтый");
        } else if (value > 100)
            System.out.println("Зеленый");
        }


public static void compareNumbers(){
    int a =5;
    int b = 8;

    if (a >= b) {
        System.out.println("a >= b");
    }else if (a <b) {
        System.out.println("a < b");

}
}
}