import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 11. Методы");
        System.out.println("");
        //Task 1.
        System.out.println("Задача 1. Определение високосного года реализацией метода");
        checkIsLeapYear(2013);
        checkIsLeapYear(2024);
        checkIsLeapYear(2100);
        //Task 2.
        System.out.println("Задача 2. Выбор версии программы для смартфона");
        defineAppVersion(0, 2024);
        defineAppVersion(1, 2013);
        defineAppVersion(2, 2025);
        //Task 3.
        System.out.println("Задача 3. Расчёт времени доставки");
        System.out.println("Понадобиться дней доставки: " + deliveryCalculationDays(30));
        System.out.println("Понадобиться дней доставки: " + deliveryCalculationDays(80));
        System.out.println("Понадобиться дней доставки: " + deliveryCalculationDays(180));
    }

    // Method for Task 1
    public static void checkIsLeapYear(int year) {
        if (year > 1584 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println("Год " + year + " является високосным");
        } else {
            System.out.println("Год " + year + " не является високосным");
        }
        System.out.println("");
    }

    // Method for Task 2
    public static void defineAppVersion(int nameOs, int mobileYear) {
        String nameOsForYourMobile;
        switch (nameOs) {
            case 0:
                nameOsForYourMobile = "iOS";
                break;
            case 1:
                nameOsForYourMobile = "Android";
                break;
            default:
                nameOsForYourMobile = "Неизвестная ОС";
                break;
        }
        int currentYear = LocalDate.now().getYear();
        if (mobileYear != currentYear) {
            System.out.println("Установите для вашей ОС " + nameOsForYourMobile + " установите облегченную версию");
        } else {
            System.out.println("Установите для вашей ОС " + nameOsForYourMobile + " установите нормальную версию");

//        int OS = 0;
//        int clientDeviceYear = 2012;
//        if (OS == 0 && clientDeviceYear >= 2015) {
//            System.out.println("Установите нормальную версию приложения для iOS по ссылке");
//        } else if (OS == 0 && clientDeviceYear < 2015) {
//            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
//        } else if (OS == 1 && clientDeviceYear >= 2015) {
//            System.out.println("Установите нормальную версию приложения для Android по ссылке");
//        } else {
//            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static int deliveryCalculationDays(int deliveryDystance) {
        int deliveryDays;
        if (deliveryDystance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDystance > 20 && deliveryDystance <= 60) {
            deliveryDays = 2;
        } else if (deliveryDystance > 60 && deliveryDystance <= 100) {
            deliveryDays = 3;
        } else {
            deliveryDays = 0;
        }
        return deliveryDays;
    }
//        System.out.println("Задача 4.В1. Доставка банковской карты");
//        //Задание переменных
//        int deliveryDystance = 55;
//        //Условия
//        if (deliveryDystance <= 20) {
//            System.out.println("Потребуется дней доставки:" + 1);
//        } else if (deliveryDystance > 20 && deliveryDystance <= 60) {
//            System.out.println("Потребуется дней доставки:" + 2);
//        } else if (deliveryDystance > 60 && deliveryDystance <= 100) {
//            System.out.println("Потребуется дней доставки:" + 3);
//        } else {
//            System.out.println("Доставки нет");

    }

