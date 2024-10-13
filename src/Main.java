public class Main {
    public static void main(String[] args) {

        System.out.println("_______Задача №1_______");

        int year = 2024;
        checkLeapYear(year);

        System.out.println();


        System.out.println("_______Задача №2_______");

        year = 2014;
        byte OS = 1;

        checkOSYear(OS, year);

        System.out.println();

        System.out.println("_______Задача №3_______");

        int distance = 1;

        checkDilivery(distance);

        System.out.println();


    }

    public static void checkLeapYear(int year) {
        if ((year > 1584) && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("Год високосный.");
        } else {
            System.out.println("Год невисокосный.");
        }
    }

    public static void checkOSYear(byte clientOS, int clientDeviceYear) {

        if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке: ");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке: ");
        } else if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для  iOS по ссылке: ");
        } else {
            System.out.println("Установите облегченную версию приложения для  iOS по ссылке: ");
        }
        System.out.println();
    }

    public static void checkDilivery(int distance) {
        byte timeOfDilivery = 0;
        if (0 <= distance && distance <= 20) {
            timeOfDilivery++;
            System.out.println("Потребуется дней: " + timeOfDilivery);
        } else if (20 < distance && distance <= 60) {
            timeOfDilivery += 2;
            System.out.println("Потребуется дней: " + timeOfDilivery);
        } else if (60 < distance && distance <= 100) {
            timeOfDilivery += 3;
            System.out.println("Потребуется дней: " + timeOfDilivery);
        } else {
            System.out.println("Доставка не предусмотрена");
        }
    }
}