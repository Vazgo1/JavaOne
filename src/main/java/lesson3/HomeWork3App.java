package lesson3;

import javax.naming.PartialResultException;
import java.util.Arrays;

public class HomeWork3App {
    public static void main(String[] args) {

        lenInitialValue(10,5);
        // задание 1
        int[] arr = {0, 1, 0, 0, 1};
        for (int i = 0; i < 5; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
        }
        // задание 2

        int[] arr1 = new int[100];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;

        }

        // задание 3


        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < 12; i++) {
            if (arr3[i] < 6) {

                arr3[i] = arr3[i] * 2;


            }

        }
// задание 4
        int[][] arr4 = new int[5][5];

        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                if (arr4[i] == arr4[j]) {
                    arr4[i][j] = 1;
                }
                arr4[i][arr4.length - i - 1] = 1;
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();

        }

    }
     //Задание 4
    public static void lenInitialValue (int len, int initialValue ){
       int[] arr = new int[len];
         Arrays.fill(arr, initialValue);
        System.out.println(Arrays.toString(arr));







    }
}

