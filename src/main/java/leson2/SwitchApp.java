package leson2;

public class SwitchApp {
    public static void main(String[] args) {
        //printMonthName(2);
        printTimeOfTheYear("May");

    }

    /**
     * Напечатает название месяца или скажет что токого нет.
     *
     * @param monthName номер месяца.
     */
    public static void printMonthName(int monthName) {
        if (monthName == 1) {
            System.out.println("jan");
        } else if (monthName == 2) {
            System.out.println("Feb");
        } else {
            System.out.println("No such month ");
        }
    }

    /**
     * Напечатает название месяца или скажет что токого нет.
     *
     * @param monthName номер месяца.
     */
    public static void printMonthName2(int monthNumber) {
        switch (monthNumber) {
            case 1: {
                System.out.println("Jan");
                break;
            }
            case 2: {
                System.out.println("Feb");
                break;
            }
            default:
                System.out.println("No such month");
        }
    }

    public static void printTimeOfTheYear(String monthName) {
        switch (monthName) {
            case "dec":
            case "jan":
            case "feb":{
                System.out.println("Winter");
                break;

        }
            case "mar":
            case "apr":
            case "May": {
                System.out.println("Spring");
                break;

            }

            default:
                System.out.println("no such time of the year");

        }

    }
}
