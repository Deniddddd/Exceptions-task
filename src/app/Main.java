package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AirBalloon airBalloon = new AirBalloon();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть висоту (від 120 до 355 метрів):");
        int height = scanner.nextInt();

        try {
            airBalloon.Air(height);
        } catch (AirBalloonException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
