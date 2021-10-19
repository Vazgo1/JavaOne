package homework3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {

    static void phoneBook() {

        {

            {

                HashMap<String, BigInteger> pb = new HashMap<>();
                HashMap<String, ArrayList> specMap = new HashMap<>();

                Scanner sc = new Scanner(System.in);
                System.out.println("Добро пожаловать в телефонную книгу");

                while (true) {
                    System.out.println("Если вы хотите внести нового абонента введите - new. Если хотите найти абонента - search");
                    System.out.println("Чтобы выйти из программы введите - exit");
                    String choice = sc.next();
                    try {
                        if (choice.equals("new") || choice.equals("New")) {

                            System.out.println("Введите фамилию");
                            String surname = sc.next();
                            System.out.println("введите номер");
                            BigInteger phNumber = sc.nextBigInteger();
                            if (pb.put(surname, phNumber) == null) {
                                specMap.put(surname, new ArrayList());
                                specMap.get(surname).add(phNumber);

                                System.out.println("Абонент внесен в теллефонный сравочник");
                                System.out.println();
                                continue;
                            }
                        } else if (choice.equals("search") || choice.equals("Search")) {

                            System.out.println("Введите фамилию абонента");
                            String surname = sc.next();

                            if (pb.get(surname) == null) {
                                System.out.println("Абонента еще нет в книге");
                                System.out.println();
                                continue;
                            } else if (specMap.get(surname).size() == 1) {
                                System.out.println("Абонент " + surname + " Номер " + pb.get(surname));
                                System.out.println();
                            } else if (specMap.get(surname).size() > 1) {
                                int check = 0;


                                for (int i = 0; ; i++) {


                                    try {
                                        if (specMap.get(surname).get(i) != null) {
                                            check++;
                                        }

                                    } catch (IndexOutOfBoundsException be) {
                                        break;
                                    }
                                }
                                System.out.println("Абонент " + surname + "имеет несколько номеров");

                                for (int i = 0; i <= check - 1; i++) {
                                    System.out.println(specMap.get(surname).get(i));
                                }
                                System.out.println();
                                System.out.println();

                            }
                        }

                    } finally {

                    }
                }
            }
        }
    }
}







