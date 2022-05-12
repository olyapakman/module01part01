package ru.jonline.mod01_01.main;

//Дано действительное число R вида nnn.ddd (три цифровых ряда в дробной и целой частях).
//Поменять местами дробную и целую части и вывести полученное значение числа
import java.math.BigDecimal;
import java.util.Scanner;

public class TwentyFirstTask {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Введите число ");
        double cond=r.nextDouble();
        double a = Math.floor(cond);
        double b = cond - a;
        double result = a/1000 + b*1000;
        BigDecimal itog = BigDecimal.valueOf(result);
        itog=itog.setScale(3,BigDecimal.ROUND_HALF_UP);
        System.out.println("Новое число "+itog);
    }
}
