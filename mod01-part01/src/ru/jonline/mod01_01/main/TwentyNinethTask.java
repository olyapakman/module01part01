package ru.jonline.mod01_01.main;

//Найти (в радианах в градусах) все углы треугольника со сторонами a,b и c
public class TwentyNinethTask {
    public static void main(String[] args) {
        int a = 12;
        int b = 9;
        int c = 5;

        double x = (Math.pow(a,2)+Math.pow(c,2)-Math.pow(b,2))/2*a*c;
        double xRad = Math.acos(x/Math.PI);
        double y = (Math.pow(a,2)+Math.pow(b,2)-Math.pow(c,2))/2*a*b;
        double yRad = Math.acos(y/Math.PI);
        double z = (Math.pow(b,2)+Math.pow(c,2)-Math.pow(a,2))/2*b*c;
        double zRad = Math.acos(z/Math.PI);
        double xDeg = Math.toDegrees(xRad);
        double yDeg = Math.toDegrees(yRad);
        double zDeg = Math.toDegrees(zRad);
        System.out.println("Значение угла 1 равно "+xRad+" радиан и "+xDeg+" градусов.");
        System.out.println("Значение угла 2 равно "+yRad+" радиан и "+yDeg+" градусов.");
        System.out.println("Значение угла 3 равно "+zRad+" радиан и "+zDeg+" градусов.");
    }
}
