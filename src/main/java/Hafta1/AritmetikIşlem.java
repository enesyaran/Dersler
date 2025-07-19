package Hafta1;

import java.util.Scanner;

public class AritmetikIşlem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a sayısını giriniz.");

        int a = scanner.nextInt();
        System.out.println("b saysını giriniz.");
        int b = scanner.nextInt();

        System.out.println("c sayısını giriniz.");
        int c = scanner.nextInt();
double d = a+b*c-b;
        System.out.println("Sonuç " + d);
    }
}
