package ru.jonline.mod01_01.main;

//Вычислить расстояние между двумя точками с данными координатами (х1,у1) и (х2,у2)

public class TwelfthTask {
    public static void main(String[] args) {
        int x1=4;
        int y1=8;
        int x2=-5;
        int y2=-7;
        int a = Math.abs(x1)+Math.abs(x2);
        int b = Math.abs(y1)+Math.abs(y2);
        double c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));

        System.out.println("Расстояние между точками = "+c);
    }
}
