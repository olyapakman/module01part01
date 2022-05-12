package ru.jonline.mod01_01.main;

//Заданы координаты трех вершин треугольника (х1,у1), (х2,у2), (х3,у3).
//Найти его периметр и площадь

public class ThirteenthTask {
    public static void main(String[] args) {
        int x1=-2;
        int y1=3;
        int x2=4;
        int y2=1;
        int x3=2;
        int y3=-3;

        double a;
        double b;
        double c;
        a=Math.sqrt(Math.pow(Math.abs(x1)+x2,2)+Math.pow(y1-y2,2));
        b=Math.sqrt(Math.pow(x2-x3,2)+Math.pow(y2+Math.abs(y3),2));
        c=Math.sqrt(Math.pow(Math.abs(x1)+x3,2)+Math.pow(y1+Math.abs(y3),2));

        double p=a+b+c;
        double s;
        s=p/2*((p/2-a)*(p/2-b)*(p/2-c));
        s=Math.sqrt(s);

        System.out.println("Периметр треугольника равен "+p);
        System.out.println("Площадь треугольника равна "+s);
    }
}
