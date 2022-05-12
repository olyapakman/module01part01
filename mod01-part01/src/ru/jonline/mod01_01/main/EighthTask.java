package ru.jonline.mod01_01.main;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения)
//(b+sqr(b^2+4*a*c))/2*a-a^3*c+b^(-2)

public class EighthTask {
    public static void main(String[] args) {
        double a=7;
        double b=8;
        double c=9;
        double d;
        d = (b + Math.sqrt(Math.pow(b,2) + 4*a*c))/2*a - Math.pow(a,3)*c + Math.pow(b,-2);
        System.out.println("Значение функции = "+d);
    }
}
