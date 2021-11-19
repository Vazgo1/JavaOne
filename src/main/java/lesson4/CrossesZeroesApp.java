package lesson4;

import java.util.Random;
import java.util.Scanner;

public class CrossesZeroesApp {
    /**
     * Игровая карта
     */
    public static char[][] map;
    /**
     * Размер поля
     */
    public static final int SIZE = 3;
    /**
     * Сколько точе надо для победы
     */
    public static final int DOTS_TO_WIN = 3;
    /**
     * Пустая ячейка
     */
    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'x';
    public static final char DOT_O = 'O';
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final Random RANDOM = new Random();


    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (chekWi(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printMap();
            if (chekWi(DOT_O)) {
                System.out.println("компьютер выйграл");
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }


        }

    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    //Инициализирует и заполняет карту пустыми ячейками
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }

        }


    }

    //Печатает поле на экран
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");

            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

    }

    //Ход человека
    public static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Введите кординаты в формате X Y");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[x][y] = DOT_X;

    }

    //Валидна ли ячейка
    public static boolean isCellValid(int x, int y) {
// проверили что попали в массив
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        // проверим что тка подходит
        if (map[x][y] == DOT_EMPTY) {
            return true;
        } else {
            return false;
        }
    }

    //Ход компуктера
    public static void aiTurn() {
        int x;
        int y;
        do {
            x = RANDOM.nextInt(SIZE);
            y = RANDOM.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.printf("Робот ходит в точку %d %d", x + 1, y + 1);
        System.out.println();
        map[x][y] = DOT_O;

    }//Проверяет выигрыш.

    private static boolean chekLine(int startX, int startY, int dx, int dy, char symbol) {
        for (int i = 0; i < SIZE; i++) {
            if (map[startX + i * dx][startY + i * dy] != symbol) {
                return false;
            }
        }
return false;
    }
public static boolean chekWi (char symbol){
        for (int i = 0; i < SIZE; i++) {
            if (chekLine(i,0,0,1,symbol)){
                return true;
            }
            if (chekLine(0,i,1,0,symbol)){
                return true;
            }
        }
        if (chekLine(0, 0,1,1,symbol)){
            return true;
        }
        if (chekLine(0,SIZE-1,1,-1,symbol)){
            return true;
        }
        return false;
}

    //public static boolean chekWi(char sym) {
    // if (map[0][0] == sym && map[0][1] == sym && map[0][2] == sym) return true;
    //if (map[1][0] == sym && map[1][1] == sym && map[1][2] == sym) return true;
    // if (map[2][0] == sym && map[2][1] == sym && map[2][2] == sym) return true;

    //if (map[0][0] == sym && map[1][0] == sym && map[2][0] == sym) return true;
    //if (map[0][1] == sym && map[1][1] == sym && map[2][1] == sym) return true;
    //if (map[0][2] == sym && map[1][2] == sym && map[2][2] == sym) return true;

    // if (map[0][0] == sym && map[1][1] == sym && map[2][2] == sym) return true;
    // if (map[0][2] == sym && map[1][1] == sym && map[2][0] == sym) return true;
    //return false;

}

