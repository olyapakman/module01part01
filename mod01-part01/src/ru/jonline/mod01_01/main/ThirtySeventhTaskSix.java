package ru.jonline.mod01_01.main;

//Составить линейную программу, печатающую значение true, если указанное значение является истинным, иначе false
//Треугольник со сторонами a, b, c является равнобедренным
public class ThirtySeventhTaskSix {
    public static void main(String[] args) {
        double a=4.0;
        double b=6.0;
        double c=12.0;

        if ((a==b && a!=c)||(b==c && b!=a)||(c==a && c!=b)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
