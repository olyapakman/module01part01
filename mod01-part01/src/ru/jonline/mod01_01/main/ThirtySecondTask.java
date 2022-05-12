package ru.jonline.mod01_01.main;

//Текущее показание электронных часов m часов n минут k секунд.
// Какое время будут показывать часы через p часов q минут r секунд?
import java.util.Scanner;

public class ThirtySecondTask {
    public static void main(String[] args) {
        Scanner newHour = new Scanner(System.in);
        System.out.println("Введите количество часов");
        int p = newHour.nextInt();
        Scanner newMin = new Scanner(System.in);
        System.out.println("Введите количество минут");
        int q = newMin.nextInt();
        Scanner newSec = new Scanner(System.in);
        System.out.println("Введите количество секунд");
        int r = newSec.nextInt();

        int m=22; //Задаем исходное время (часы)
        int n=56; //Задаем исходное время (минуты)
        int k=49; //Задаем исходное время (секунды)

        int newK=k+r; //Вычисляем количество секунд через r секунд
        int dopK=Math.floorDiv(newK, 59); //Определяем число секунд, составляющих количество целых минут
        if (newK>59) { //При условии, что итоговое число секунд больше 59
            if ((newK / 59) >= 2) { //При условии, что итоговое число секунд больше 59 в 2 или более раза
                newK = newK - dopK * 60; //Из итогового числа секунд вычитаем значение секунд,
                                         // составляющее количество целых минут
            } else {
                newK = newK - 60; //в ином случае из итогового числа секунд вычитаем значение секунд,
                                  // составляющее 1 минуту
            }
        }

        int newN=n+q;
        int dopN=Math.floorDiv(newN,59);
        if (newN>59) {
            if ((newN/59)>=2) {
                newN=newN-dopN*60+dopK; //Из итогового числа минут вычитаем значение минут,
                                        //составляющее количество целых часов и добавляем кол-во целых минут,
                                        //полученных из секунд
            } else {
                newN=newN-60+1; //Из итогового числа минут вычитаем значение минут, составляющих 1 час
                                //и добавляем 1 минуту
            }
        }
        int newM=m+p;
        int dopM=Math.floorDiv(newM,24);
        if (newM>23) {
            if ((newM/23)>=2) {
                newM = newM-dopM*24+dopN;
            } else {
                newM=newM-24+1;
            }
        }
        System.out.println("Новое время на часах "+newM+"ч "+newN+"мин "+newK+"с");
    }
}
