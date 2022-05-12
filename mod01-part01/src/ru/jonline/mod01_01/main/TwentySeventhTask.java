package ru.jonline.mod01_01.main;

//Дано значение а. Не используя никаких функций и никаких операций, кроме умножения, получить значение а^8
//за три операции, и a^10 за четыре операции
import java.util.Scanner;

public class TwentySeventhTask {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите переменную а");
        int a = vvod.nextInt();
        int b = a;
        a=a*a;
        a=a*a;
        a=a*a;
        System.out.println("а в степени 8 равно "+a);
        a=a*b;
        System.out.println("a в степени 10 равно "+a);
    }
}
