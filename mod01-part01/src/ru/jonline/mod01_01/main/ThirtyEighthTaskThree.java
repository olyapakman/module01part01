package ru.jonline.mod01_01.main;

//Для данных областей составить программу, которая печатает true, если точка с координатами (х,у)
// принадлежит заданной области, иначе - false

import java.util.Scanner;

public class ThirtyEighthTaskThree {
    public static void main(String[] args) {
        Scanner condOne=new Scanner(System.in);
        System.out.println("Введите координату х");
        int x=condOne.nextInt();
        Scanner condTwo=new Scanner(System.in);
        System.out.println("Введите координату у");
        int y=condTwo.nextInt();

        if ((x*x+y*y<=16 && x>=0 && y>=0)||(x*x+y*y<=25 && x<=0 && y<=0)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
