package ru.jonline.mod01_01.main;

//Составить линейную программу, печатающую значение true, если указанное значение является истинным, иначе false
//Заданное число N является степенью числа а (показатель степени нах-ся в диапазоне от 0 до 4)
public class ThirtySeventhTaskEight {
    public static void main(String[] args) {
        int n=64;
        int a=4;

        if ((n==1)||(n==n)||(n==a*a)||(n==(int)Math.pow(a,3))||(n==(int)Math.pow(a,4))) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
