package ru.jonline.mod01_01.main;

//Тр сопротивления R1, R2 и R3 соединены параллельно. Найти сопротивление соединения
public class ThirtiethTask {
    public static void main(String[] args) {
        double rOne=10;
        double rTwo=11;
        double rThree=12;
        double rFinal;

        rFinal=(rOne*rTwo*rThree)/(rTwo*rThree+rOne*rThree+rOne*rTwo); // 1/R=1/R1+1/R2+1/R3

        System.out.println("Сопротивление соединения равно "+rFinal);

    }
}
