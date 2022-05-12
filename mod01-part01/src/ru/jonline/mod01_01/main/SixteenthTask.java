package ru.jonline.mod01_01.main;

import java.util.Scanner;

//Найти произведение цифр заданного четырехзначного числа

public class SixteenthTask {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите четырехзначное число: ");
        int x = vvod.nextInt();
        int a,b,c,d;
        a=Math.floorDiv(x,1000);
        b=Math.floorDiv(x-a*1000,100);
        c=Math.floorDiv(x-a*1000-b*100,10);
        d=x-a*1000-b*100-c*10;
        int y = a*b*c*d;
        System.out.println("Проиведение цифр числа "+x+" равно "+y);
    }
}
