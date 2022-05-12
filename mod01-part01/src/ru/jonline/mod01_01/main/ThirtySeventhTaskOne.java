package ru.jonline.mod01_01.main;

//Составить линейную программу, печатающую значение true, если указанное значение является истинным, иначе false
//Целое число N является четным двузначным числом

import java.util.Scanner;

public class ThirtySeventhTaskOne {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Введите двухзначное число");
        int nOne=n.nextInt();
        if (nOne/100==0 && nOne%2==0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
