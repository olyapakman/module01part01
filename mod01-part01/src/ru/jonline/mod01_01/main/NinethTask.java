package ru.jonline.mod01_01.main;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения)
//(a/c)*(b/d)-(a*b-c)/c*d

public class NinethTask {
    public static void main(String[] args) {
        double a=10.2;
        double b=11.5;
        double c=1.02;
        double d=4.56;
        double result;

        result=((a/c)*(b/d))-((a*b-c)/(c*d));
        System.out.println("Значение функции = "+result);
    }
}
