//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean verifyForALeapYear(int date) {
        if (date < 1584) {
            return false;
        } else if (date % 400 == 0 || (date % 4 == 0 && date % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void CheckingTheOSAndYear(int OS, int year) {
        if (year >= 2015 && OS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (OS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (year >= 2015 && OS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (OS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static int CalculateDeliveryTime(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else {
            return 3;
        }
    }


    public static void main(String[] args) {
        //задача 1
        System.out.println("задача 1");
        int year = 2021;
        if (verifyForALeapYear(year)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        //задача 2
        System.out.println("задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2016;
        CheckingTheOSAndYear(clientOS, clientDeviceYear);

        //задача 3
        System.out.println("задача 3");
        int deliveryDistance = 95;
        int deliveryTime = CalculateDeliveryTime(deliveryDistance);
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + deliveryTime);
        }
    }
}