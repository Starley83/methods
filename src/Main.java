import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void verifyForALeapYear(int date) {
        if (date < 1584) {
            System.out.println(date + " год не является високосным");
        } else if (date % 400 == 0 || (date % 4 == 0 && date % 100 != 0)) {
            System.out.println(date + " год является високосным");
        } else {
            System.out.println(date + " год не является високосным");
        }
    }

    public static void checkingTheOsAndYear(int OS, int year) {
        int currentYear = LocalDate.now().getYear();
        if (year >= currentYear && OS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (OS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (year >= currentYear && OS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (OS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static int calculateDeliveryTime(int distance) {
       if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            System.out.println("Доставки нет");
            return 1000;
        }
    }


    public static void main(String[] args) {
        //задача 1
        System.out.println("задача 1");
        int year = 2021;
        verifyForALeapYear(year);


        //задача 2
        System.out.println("задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2016;
        checkingTheOsAndYear(clientOS, clientDeviceYear);

        //задача 3
        System.out.println("задача 3");
        int deliveryDistance = 95;
        int deliveryTime = calculateDeliveryTime(deliveryDistance);
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + deliveryTime);
        }
    }
}