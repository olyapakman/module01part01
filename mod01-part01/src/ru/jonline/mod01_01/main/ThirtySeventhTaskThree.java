package ru.jonline.mod01_01.main;

//Составить линейную программу, печатающую значение true, если указанное значение является истинным, иначе false
//Сумма цифр заданного трехзначного числа является четным числом
import java.util.Scanner;

public class ThirtySeventhTaskThree {
    public static void main(String[] args) {
        Scanner cond = new Scanner(System.in);
        System.out.println("Введите трехзначное число");
        int nOne=cond.nextInt();

        int sum=0;
        int count=0;
        while (count<3) {
            sum=sum+(nOne%10);
            nOne=nOne/10;
            count++;
        }
        if (sum%2==0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
