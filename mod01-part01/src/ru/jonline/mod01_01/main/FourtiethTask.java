package ru.jonline.mod01_01.main;

//Получить значение выражения
public class FourtiethTask {
    public static void main(String[] args) {
        double x=3;
        double nOne=3*x*x;
        double nTwo=4*x*x*x+2*x;

        double resOne=nOne-nTwo;
        double resTwo=nOne+nTwo+1;
        System.out.println("При х = "+x+"значение первой функции равно "+resOne+", значение второй функции равно "+resTwo);

    }
}
