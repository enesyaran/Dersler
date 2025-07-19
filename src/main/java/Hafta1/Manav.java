package Hafta1;

import java.util.Scanner;

public class Manav {
    public static <string> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Armut kaç kilo ?");
        Double Armut = scanner.nextDouble();
          Armut = Armut*2.14;

        System.out.println("Elma kaç kilo ?");
        Double Elma = scanner.nextDouble();
        Elma = Elma*3.67;

        System.out.println("Domates kaç kilo ?");
        Double Domates = scanner.nextDouble();
        Domates = Domates*1.11;

        System.out.println("Muz kaç kilo ?");
        Double Muz = scanner.nextDouble();
        Muz = Muz*0.95;

        System.out.println("Patlıcan kaç kilo ?");
        Double Patlıcan = scanner.nextDouble();
        Patlıcan = Patlıcan*5;

        Double Toplam = Armut+ Elma+ Domates+ Muz+ Patlıcan ;
        System.out.println("Toplam tutar " + Toplam);


    }
}
