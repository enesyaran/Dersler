package Hafta1;

import java.util.Scanner;

public class UçakBiletFiyatı {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mesafeyi KM türünden giriniz:");
        double mesafe = scanner.nextDouble();

        System.out.println("Yaşınızı giriniz:");
        double yas = scanner.nextDouble();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş):");
        int tip = scanner.nextInt();

        if (mesafe > 0 && yas > 0 && (tip == 1 || tip == 2)) {
            double fiyat = mesafe * 0.10;

            // Yaş indirimi
            if (yas < 12) {
                fiyat *= 0.5; // %50 indirim
            } else if (yas >= 12 && yas <= 24) {
                fiyat *= 0.9; // %10 indirim
            } else if (yas >= 65) {
                fiyat *= 0.7; // %30 indirim
            }

            // Gidiş-Dönüş indirimi
            if (tip == 2) {
                fiyat *= 2; // gidiş dönüş ücreti
                fiyat *= 0.8; // %20 indirim
            }

            System.out.println("Toplam bilet fiyatı: " + fiyat + " TL");
        } else {
            System.out.println("Hatalı veri girdiniz!");
        }
    }
}


