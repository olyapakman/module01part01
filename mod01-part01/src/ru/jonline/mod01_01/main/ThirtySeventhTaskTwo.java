package ru.jonline.mod01_01.main;

import java.util.Scanner;

//Составить линейную программу, печатающую значение true, если указанное значение является истинным, иначе false
//Сумма первых двух цифр заданного четырехзначного числа равна сумме двух его последних цифр
public class ThirtySeventhTaskTwo {
    public static void main(String[] args) {
        Scanner cond = new Scanner(System.in);
        System.out.println("Введите четырехзначное число");
        int nOne=cond.nextInt();
        int sumOne=0;
        int count=0;
        while (count<2) {
            sumOne=sumOne+(nOne%10);
            nOne=nOne/10;
            count++;
        }
        int sumTwo=0;
        count=0;
        while (count<2) {
            sumTwo=sumTwo+(nOne%10);
            nOne=nOne/10;
            count++;
        }

        if (sumOne==sumTwo) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
