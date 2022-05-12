package ru.jonline.mod01_01.main;

import java.util.Scanner;

//Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел.

public class SeventeenthTask {
    public static void main(String[] args) {
        Scanner firstNum = new Scanner(System.in);
        Scanner secondNum = new Scanner(System.in);
        double x;
        double y;
        System.out.println("Введите первое число ");
        x=firstNum.nextDouble();
        System.out.println("Введите второе число ");
        y=secondNum.nextDouble();

        double a;
        double b;
        a=(Math.pow(x,3)+Math.pow(y,3))/2;
        b=(Math.abs(x)*Math.abs(y))/2;
        System.out.println("Среднее арифметическое кубов чисел "+x+" и "+y+" равно "+a);
        System.out.println("Среднее геометрическое модулей чисел "+x+" и "+y+" равно "+b);
    }
}
