package lesson3;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] intArray = new int[10];

        intArray[3] = 5;
        intArray[1] = 0;
        intArray[0] = 3;
        //System.out.println(intArray[3]);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);

        }

        int[] arr1 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i * 10;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println(Arrays.toString(arr1));

        int[] tenn = new int[10];
        Arrays.fill(tenn, 10);
        System.out.println(Arrays.toString(tenn));
    }

    {
        boolean[] boolArray = new boolean[5];
        Arrays.fill(boolArray, true);
        System.out.println(Arrays.toString(boolArray));

        String[] strings = new String[5];
        Arrays.fill(strings, "aaabbb");
        System.out.println(Arrays.toString(strings));


    }
}
