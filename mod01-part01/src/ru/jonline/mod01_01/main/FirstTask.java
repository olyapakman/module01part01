package ru.jonline.mod01_01.main;

//Даны два действительных числа х и у. Вычислить их сумму, разность, произведение и частное.
public class FirstTask {
    public static void main(String[] args) {
        double x, y;
        x=521.4;
        y=326.8;
        double a, b, c, d;
        a=x+y;
        b=x-y;
        c=x*y;
        d=x/y;
        System.out.println("x + y = "+a);
        System.out.println("x - y = "+b);
        System.out.println("x * y = "+c);
        System.out.println("x / y = "+d);
    }
}
