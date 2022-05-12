package ru.jonline.mod01_01.main;

//Написать программу, которая выводит первые четыре степени числа PI

import java.math.BigDecimal;

public class FifteenthTask {
    public static void main(String[] args) {
        int x=1;
        double y;
        while (x<5) {
            y=Math.pow(Math.PI,x);
            BigDecimal result = BigDecimal.valueOf(y);
            System.out.println("Число PI в степени "+x+" равно "+result.setScale(5,BigDecimal.ROUND_HALF_UP));
            x=x+1;
        }
    }
}
