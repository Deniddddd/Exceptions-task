package app;

import java.util.Scanner;
public class AirBalloon {
    public void Air(int height) throws AirBalloonException {
        if (height < 120 || height > 355) {
            throw new AirBalloonException("Неможливо зняти показники за межами висотного діапазону (від 120 до 355 метрів).");
        } else {
            System.out.println("Показники стану повітря зняті успішно на висоті " + height + " метрів.");
        }
    }

}
//    public static void main(String[] args) {
//        Scanner balloon = new Scanner(System.in);
//        System.out.println("Введіть число від 120 до 355:");
//        int number;
//
//        while (true) {
//            while (!balloon.hasNextInt()) {
//                System.out.println("Будь ласка, введіть ціле число:");
//                balloon.next();
//            }
//            number = balloon.nextInt();
//
//            if (number >= 120 && number <= 355) {
//                break;
//            } else {
//                System.out.println("Число повинно бути в межах від 120 до 355. Спробуйте ще раз:");
//            }
//        }
//
//        System.out.println("Ви ввели число: " + number);
//
//        balloon.close();

