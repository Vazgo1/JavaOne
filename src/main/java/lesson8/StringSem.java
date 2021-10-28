package lesson8;

import java.util.Arrays;

public class StringSem {
    public static void main(String[] args) {

        String[] strings = new String[6];
        Arrays.fill(strings, "aaabbb");
        for (int i = 0; i < 6; i++){
            if (i == i){
                i= Integer.parseInt("кайф");
                System.out.println(i);
            }
        }

    }
}
