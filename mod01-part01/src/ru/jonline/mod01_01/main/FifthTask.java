package ru.jonline.mod01_01.main;

import java.util.Scanner;

//Создать алгоритм нахождения среднего арифметического двух чисел.

public class FifthTask {
    public static void main(String[] args) {
        Scanner arifm = new Scanner (System.in);
        Scanner arifmTwo = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        double x=arifm.nextDouble();
        System.out.println("Введите второе чило: ");
        double y=arifmTwo.nextDouble();

        double d = (x+y)/2;
        System.out.println("Среднее арифтметическое двух чисел: "+d);
    }
}
