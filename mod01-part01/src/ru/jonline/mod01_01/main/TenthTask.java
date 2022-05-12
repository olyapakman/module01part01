package ru.jonline.mod01_01.main;

//(sinx+cosy)/(cosx-sinx)*tgxy

public class TenthTask {
    public static void main(String[] args) {
        double x = 54.3;
        double y = 32.1;
        double d;
        d = ((Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y)))*Math.tan(x*y);
        System.out.println("Значение функции = "+d);
    }
}
