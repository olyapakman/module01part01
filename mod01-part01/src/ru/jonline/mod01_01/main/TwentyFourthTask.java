package ru.jonline.mod01_01.main;

//Найти площадь равнобедренной трапеции с основаниями a и b и углом A при большей стороне а

import java.math.BigDecimal;

public class TwentyFourthTask {
    public static void main(String[] args) {
        double a = 145.5;
        double b = 84.75;
        double angle = 30;

        double sqr = (Math.pow(a,2)-Math.pow(b,2))/2;
        sqr = sqr*Math.tan(Math.toRadians(angle));

        BigDecimal result = BigDecimal.valueOf(sqr);
        result = result.setScale(3,BigDecimal.ROUND_HALF_UP);
        System.out.println("Площадь равнобедренной трапеции равна "+result);
    }
}
