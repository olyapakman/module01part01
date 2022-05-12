package ru.jonline.mod01_01.main;

//Дано действительное число х. Не пользуясь никакими другими арифметическими операциями,
//кроме умножения, сложения и вычитания, вычислите значение выражения 2*x^4-3*x^3+4*x^2-5*х+6
public class ThirtyNinethTask {
    public static void main(String[] args) {
        double x = 3;
        double y = x*x*x*(2*x-3)+x*(4*x-5)+6;
        System.out.println("При х = "+x+" значение функции равно "+y);
    }
}
