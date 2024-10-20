public class Main {
    public static void main(String[] args) {

        System.out.println("_______Задача №1_______");

        int year = 2024;
        checkLeapYear(year);

        System.out.println();


        System.out.println("_______Задача №2_______");

        year = 2016;
        byte OS = 0;

        checkOSYear(OS, year);

        System.out.println();

        System.out.println("_______Задача №3_______");

        int distance = 95;

        checkDelivery(distance);

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
        if (clientDeviceYear > 2015) {
            System.out.print("Установите версию приложения для ");
        } else {
            System.out.print("Установите облегченную версию приложения для ");
        }
        if (clientOS == 1) {
            System.out.println("Android по ссылке:");
        } else {
            System.out.println("IOs по ссылке:");
        }
        System.out.println();
    }

    public static void checkDelivery(int distance) {
        byte timeOfDelivery = 0;
        if (0 <= distance && distance <= 20) {
            timeOfDelivery++;
            System.out.println("Потребуется дней: " + timeOfDelivery);
        }
        if (20 < distance && distance <= 60) {
            timeOfDelivery += 2;
            System.out.println("Потребуется дней: " + timeOfDelivery);
        }
        if (60 < distance && distance <= 100) {
            timeOfDelivery += 3;
            System.out.println("Потребуется дней: " + timeOfDelivery);
        }
        if (100 < distance) {
            System.out.println("Доставка не предусмотрена");
        }
    }
}