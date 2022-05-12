package ru.jonline.mod01_01.main;

//Составить программу для вычисления пути, пройденного лодкой, если ее скорость в стоячей воде v км/ч,
//скорость течения реки v1 км/ч, время движения по озеру t1, по реке - t2
public class ThirtyFirstTask {
    public static void main(String[] args) {
        double v=30;
        double vOne=12;
        double tOne=2.5;
        double tTwo=3.1;
        double s;

        s=tOne*v+tTwo*(v-vOne);
        System.out.println("Общаа длина пути, пройденного лодкой - "+s+" км");
    }
}
