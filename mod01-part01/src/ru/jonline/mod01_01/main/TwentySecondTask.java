package ru.jonline.mod01_01.main;

//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
//Вывести данное значение длительности в виде ННчММминSSс

public class TwentySecondTask {
    public static void main(String[] args) {
        int cond = 15678;
        int hours = Math.floorDiv(cond,3600);
        int min = Math.floorDiv(cond-(hours*3600),60);
        int sec = cond-min*60-hours*3600;
        System.out.println(hours+"ч"+min+"мин"+sec+"с");
    }
}
