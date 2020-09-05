package lesson1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        name();

        System.out.println("Вычислим выражение a*(b+(c/d))");
        System.out.println("Введите число a");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println("Введите число b");
        double b = scanner.nextDouble();
        System.out.println("Введите число c");
        double c = scanner.nextDouble();
        System.out.println("Введите число d");
        double d = scanner.nextDouble();
        if (d == 0.0){
            System.out.println("На ноль делить нельзя !");
        }
        else {
            double resoult = a*(b+(c/d));
            System.out.println("Результат " + resoult);
        }

        //bool();


    }

    /*public static void bool (){
        System.out.println("Проверим сумму двух чисел");
        System.out.println("Введите первое число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        int resoult = a + b;


    }*/

    public static void  name (){
        System.out.println("Введите ваше имя");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Привет, " + name);
    }

}
