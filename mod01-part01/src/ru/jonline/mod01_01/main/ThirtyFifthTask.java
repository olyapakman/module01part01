package ru.jonline.mod01_01.main;

//Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N
public class ThirtyFifthTask {
    public static void main(String[] args) {
        int m=312;
        int n=9;


        int younger = (int)(((double)m/n)%10);
        int older = (int)((((double)m/n)*10)%10);
        System.out.println(younger+" "+older);
    }
}
