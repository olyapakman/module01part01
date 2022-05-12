package ru.jonline.mod01_01.main;

//Дана величина А, выражающаяобъем информации в байтах. Перевести А в более крупные единицы измерения информации
public class ThirtyForthTask {
    public static void main(String[] args) {
        long cond = 11111111111111L;

        double kBytes = cond / Math.pow(2, 10);
        double mBytes = cond / Math.pow(2, 20);
        double gBytes = cond / Math.pow(2, 30);
        double tBytes = cond / Math.pow(2, 40);
        double pBytes = cond / Math.pow(2, 50);

        System.out.println(cond + " байт");
        System.out.println(kBytes + " Кб");
        System.out.println(mBytes + " Мб");
        System.out.println(gBytes + " Гб");
        System.out.println(tBytes + " Тб");
        System.out.println(pBytes + " Пб");
    }
}
