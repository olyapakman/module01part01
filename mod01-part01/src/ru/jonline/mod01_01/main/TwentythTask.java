package ru.jonline.mod01_01.main;

import java.math.BigDecimal;
import java.util.Scanner;

//Известна длина окружности. Найти площадь круга, ограниченного этой окружности.

public class TwentythTask {
    public static void main(String[] args) {
        Scanner length = new Scanner(System.in);
        System.out.println("Введите длину окружности");
        double x = length.nextDouble();
        double y = Math.pow(x,2)/(4*Math.PI);
        BigDecimal sqr = BigDecimal.valueOf(y);
        sqr = sqr.setScale(5,BigDecimal.ROUND_HALF_UP);
        System.out.println("Площадь круга равна "+sqr);
    }
}
