package ru.jonline.mod01_01.main;

//Составить программу перевода радианной меры угла в градусы, минуты и секунды.
public class TwentyEighthTask {
    public static void main(String[] args) {
        double xRad = 2.67;

        double xDegree = xRad*(180/Math.PI);
        int grad = (int)Math.floor(xDegree);
        double y = (xDegree-grad)*60;
        int min = (int)Math.floor(y);
        double z = (y-min)*60;
        int sec = (int)z;
        System.out.println(grad+"г"+min+"'"+sec+"''");
    }
}
