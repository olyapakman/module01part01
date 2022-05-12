package ru.jonline.mod01_01.main;

import java.util.Scanner;

//Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем куба.

public class EighteenthTask {
    public static void main(String[] args) {
        Scanner edge = new Scanner(System.in);
        System.out.println("Введите длину ребра куба ");
        double x = edge.nextInt();
        double facetSqr = Math.pow(x,2);
        double surfaceSqr = Math.pow(x,2)*6;
        double cubeValue = Math.pow(x,3);
        System.out.println("Площадь грани куба равна: "+facetSqr);
        System.out.println("Площадь полной поверхности куба равна: "+surfaceSqr);
        System.out.println("Объем куба равен: "+cubeValue);
    }
}
