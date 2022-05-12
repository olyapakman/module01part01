package ru.jonline.mod01_01.main;

//Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы
public class ThirtyThirdTask {
    public static void main(String[] args) {
        char firstChar='M';
        int numOne=(int)firstChar;
        int numPrev=numOne-1;
        char prevChar=(char)numPrev;
        int numNext=numOne+1;
        char nextChar=(char)numNext;
        System.out.println("Исходный символ "+firstChar+"; его порядковый номер "+numOne);
        System.out.println("Предыдущий символ "+prevChar+"; его порядковый номер "+numPrev);
        System.out.println("Следующий символ "+nextChar+"; его порядковый номер "+numNext);
    }
}
