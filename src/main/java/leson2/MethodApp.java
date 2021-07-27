package leson2;

public class MethodApp {
    public static void main(String[] args) {
        int calc1 = calculate(4, 6);
        int calc2 = calculate(10, 10);
        int calc4 = calculate(4);
        System.out.println(calc4);


        int calc5 = calculate(calc1, calc2);

        method1("aaaa", 100);
        method1(100500, "String");
    }

    public static void doSomethinng() {
        System.out.println("Somethinng");
    }

    public static int calculate(int a, int b) {
        return 2 * a + b;

    }

    public static int calculate(int a) {
        return calculate(a, a);
    }
    public static void method1(String s, int i){
        System.out.println("Method1 "+ s +" "+ i);
    }
    public static void method1(int i, String s){

    }
}

