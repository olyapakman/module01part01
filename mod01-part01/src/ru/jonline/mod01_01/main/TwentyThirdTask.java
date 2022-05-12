package ru.jonline.mod01_01.main;

//Найти площадь кольца, внутренний радиус которого равен r, а внешний R (R>r)

import java.math.BigDecimal;

public class TwentyThirdTask {
    public static void main(String[] args) {
        int radOne = 64;
        int radTwo = 58;
        double ringSqr = (Math.PI*Math.pow(radOne,2))-(Math.PI*Math.pow(radTwo,2));
        BigDecimal result = BigDecimal.valueOf(ringSqr);
        result=result.setScale(3,BigDecimal.ROUND_HALF_UP);
        System.out.println("Площадь кольца "+result);
    }
}
