package ru.jonline.mod01_01.main;

//Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов.

public class EleventhTask {
    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        double c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));

        double p = a+b+c;
        double s = (a*b)/2;

        System.out.println("Периметр прямоугольного треугольника равен "+p);
        System.out.println("Площадь прямоугольного треугольника равна "+s);
    }
}
