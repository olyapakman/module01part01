package ru.jonline.mod01_01.main;

//Составить линейную программу, печатающую значение true, если указанное значение является истинным, иначе false
//Точка с координатами (х,у) принадлежит части плоскости между прямыми x=m, x=n
public class ThirtySeventhTaskFour {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        int m = 2;
        int n = 3;

        if (x >= m && x <= n) {
            System.out.print("True: ");
        }
        else{
            System.out.print("False: ");
        }
    }
}
