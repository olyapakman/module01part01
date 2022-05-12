package ru.jonline.mod01_01.main;

import java.util.Scanner;

//Вычислить длину окружности и площадь круга одного и того же заданного радиуса R

public class FourteenthTask {
    public static void main(String[] args) {
        Scanner radius = new Scanner(System.in);
        System.out.println("Введите радиус окружности/круга R: ");
        int x= radius.nextInt();
        double legth = Math.round(2*Math.PI*x);
        double square = Math.round(Math.PI*Math.pow(x,2));
        System.out.println("Длина окружности радиусом R равна "+legth);
        System.out.println("Площадь круга радиусом R равна "+square);
    }
}
