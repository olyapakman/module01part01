package ru.jonline.mod01_01.main;

//Составить линейную программу, печатающую значение true, если указанное значение является истинным, иначе false
//Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре
public class ThirtySeventhTaskSeven {
    public static void main(String[] args) {
        int n=385;

        int nNew=n;
        int x=(int)(nNew%10);
        nNew=nNew/10;
        int y=(int)(nNew%10);
        nNew=nNew/10;
        int z=(int)(nNew%10);

        if (x+y==z||x+z==y||y+z==x) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
