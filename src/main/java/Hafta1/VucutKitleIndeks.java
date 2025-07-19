package Hafta1;

import java.util.Scanner;

public class VucutKitleIndeks {
    public static <string> void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Kilonuzu giriniz ");
        Double kilo = scanner.nextDouble(); //Kilo değerini okuması için

        System.out.println("Boyunuzu giriniz (metre cinsinden)");
        Double boy = scanner.nextDouble(); //Boy değerini okuması için

        Double ind = kilo/(boy*boy); // Kilomuzu boyun karesine bölüp hesağlıyoruz.

        System.out.println("Vücut Kitle indeksiniz " + ind);
    }


}
