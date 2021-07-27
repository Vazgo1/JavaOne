package leson2;

public class HomeWork2App {
    public static void main(String[] args) {
        NewMethod2(-1);
    }
//задание1
    public static boolean NewMethod(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
// задание 2
    public static void NewMethod2(int a) {

        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрецательное");
        }
    }
// задание 3
    public static boolean NewMethod3(int a) {
        if (a >= 0) {
            return true;
        } else {
            return false;
        }
    }
    // задание 4
    public static void NewMethod4(String str, int a){

       for (int i=0; i<a; i++){
           System.out.println(str);
       }


    }
}










