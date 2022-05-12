package ru.jonline.mod01_01.main;

import java.math.BigDecimal;
import java.util.Scanner;

//Дана сторона равностороннего треугольника. Найти площадь этого трегольника, его высоту,
// радиусы вписанной и описанной окружностей

public class NineteenthTask {
    public static void main(String[] args) {
        Scanner trian = new Scanner(System.in);
        System.out.println("Введите длину стороны равностороннего треугольника ");
        double x = trian.nextDouble();

        double a = (Math.cbrt(3)/4)*Math.pow(x,2);
        double b = (Math.cbrt(3)/2)*x;
        double c = (Math.cbrt(3)/3)*x;
        double d = (Math.cbrt(3)/6)*x;

        BigDecimal trianSqr = BigDecimal.valueOf(a);
        trianSqr = trianSqr.setScale(3,BigDecimal.ROUND_HALF_UP);
        BigDecimal trianHeight = BigDecimal.valueOf(b);
        trianHeight = trianHeight.setScale(3,BigDecimal.ROUND_HALF_UP);
        BigDecimal trianRadOne = BigDecimal.valueOf(c);
        trianRadOne = trianRadOne.setScale(3,BigDecimal.ROUND_HALF_UP);
        BigDecimal trianRadTwo = BigDecimal.valueOf(d);
        trianRadTwo = trianRadTwo.setScale(3,BigDecimal.ROUND_HALF_UP);

        System.out.println("Площадь равностороннего треугольника "+trianSqr);
        System.out.println("Высота равностороннего треугольника "+trianHeight);
        System.out.println("Радиус окружности, описанной вокруг равностороннего треугольника "+trianRadOne);
        System.out.println("Радиус окружности, вписанной в равносторонний треугольник "+trianRadTwo);
    }
}
