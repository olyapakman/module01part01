package ru.jonline.mod01_01.main;

//В n малых бидонах 80 л молока. Сколько литров молока в m больших бидонах ,
//  если в каждом большом бидоне на 12 л больше, чем в малом.

public class SixthTask {
    public static void main(String[] args) {
        double a=6; // количество малых бидонов
        double b=3; // количество больших бидонов
        double c; // количество литров в b бидонах

        c=(80*b+12*a*b)/a; //Формула выведена из пропорции c/b = (80/a)+12
        System.out.println("В "+b+" больших бидонах "+c+ " литров молока");
    }
}
