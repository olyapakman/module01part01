package ru.jonline.mod01_01.main;

//Составить линейную программу, печатающую значение true, если указанное значение является истинным, иначе false
//Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа
import java.util.Scanner;

public class ThirtySeventhTaskFive {
    public static void main(String[] args) {
        Scanner nOne=new Scanner(System.in);
        System.out.println("Введите трехзначное число");
        int n=nOne.nextInt();
        int cond=n;

        int sum=0;
        int count=0;
        while (count<3) {
            sum=sum+(cond%10);
            cond=cond/10;
            count++;
        }
        if ((n*n)==Math.pow(sum,3)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
