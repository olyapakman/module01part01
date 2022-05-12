package ru.jonline.mod01_01.main;

//Вычислить корни квадратного уравнения a*x^2+b*x+c=0

import java.util.Scanner;

public class TwentyFifthTask {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите значение а");
        double condA = a.nextDouble();
        Scanner b = new Scanner(System.in);
        System.out.println("Введите значение b");
        double condB = b.nextDouble();
        Scanner c = new Scanner(System.in);
        System.out.println("Введите значение c");
        double condC = c.nextDouble();

        double disc = Math.pow(condB, 2) - 4 * condA * condC;
        if (disc < 0) {
            System.out.println("Уравнение не имеет решения");
        } else {
            double xOne = (-condB + Math.sqrt(disc)) / (2 * condA);
            double xTwo = (-condB - Math.sqrt(disc)) / (2 * condA);
            System.out.println("Первый корень уравнения " + xOne + ". Второй корень уравнения " + xTwo);
        }
    }
}
