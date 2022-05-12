package ru.jonline.mod01_01.main;

//График функции y=a*x^2+b*x+c проходит через заданную точку с координатами (m,n)
public class ThirtySeventhTaskNine {
    public static void main(String[] args) {
        double a=3.0;
        double b=5.0;
        double c=1.0;
        double y=23.0; //задаем координату n
        double x=2.0; //Задаем координату m

        if (y==a*x*x+b*x+c) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
