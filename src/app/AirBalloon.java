package app;

import java.util.Scanner;

public class AirBalloon {
    public static void main(String[] args) {
        Scanner balloon = new Scanner(System.in);
        System.out.println("Введіть число від 120 до 355:");
        int number;

        while (true) {
            while (!balloon.hasNextInt()) {
                System.out.println("Будь ласка, введіть ціле число:");
                balloon.next();
            }
            number = balloon.nextInt();

            if (number >= 120 && number <= 355) {
                break; // Виходимо з циклу, якщо число вірне
            } else {
                System.out.println("Число повинно бути в межах від 120 до 355. Спробуйте ще раз:");
            }
        }

        // Виводимо введене число
        System.out.println("Ви ввели число: " + number);

        // Закриваємо Scanner
        balloon.close();
    }
}
