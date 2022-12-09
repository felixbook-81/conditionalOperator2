public class Main {
    public static void main(String[] args) {

        System.out.println("Task1");
        int clientOS = 1;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else
            System.out.println("ведите праильно цифру");


        System.out.println("Task2");




            int clientDeviceYear = 2014;
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");

                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else if (clientDeviceYear >= 2015) {
                    System.out.println("Установите обычную версию приложения для Android по ссылке");

                } else
                    System.out.println("ведите праильно цифру");
            }

        }

    }




