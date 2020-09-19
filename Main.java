package lesson3;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        game();
    }

    private static void game() {

        int interval = 20;
        System.out.println("Угадайте число от 0 до " + interval);
        int number = (int) (Math.random() * interval);
        playGame(interval, number);
    }

    private static void playGame(int interval, int number) {

        while (true) {

            int in_number = scanner.nextInt();
            if (in_number == number) {
                System.out.println("Вы угадали !");
                break;
            } else if (in_number > number) {
                System.out.println("Загаданное число меньше.");
            } else {
                System.out.println("Загаданное число больше.");
            }

        }

    }

}
