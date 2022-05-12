package ru.jonline.mod01_01.main;

//Найти площадь треугольника, две стороны которого равны a и b, и угол между этими сторонами С
import java.math.BigDecimal;

public class TwentySixthTask {
    public static void main(String[] args) {
        int a = 14; //Сторона а
        int b = 25; //Сторона b
        int c = 63; //Угол С

        double sqr = a*b*Math.sin(Math.toRadians(c));
        sqr = sqr/2;
        BigDecimal result = BigDecimal.valueOf(sqr);
        result = result.setScale(2,BigDecimal.ROUND_HALF_UP);
        System.out.println(result);
    }
}
