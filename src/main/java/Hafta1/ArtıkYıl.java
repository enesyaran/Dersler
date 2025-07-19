package Hafta1;

import java.util.Scanner;

public class ArtıkYıl {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Yıl Giriniz");
    int Yıl = scanner.nextInt();

    if ((Yıl % 4 == 0 && Yıl % 100 != 0) || (Yıl % 400 == 0)) {
        // 4 e bölümü 0 ama 100 bölümü 0 değil sonra 400 e bölümü 0 süzüyor
        System.out.println(Yıl + " bir artık yıldır.");
    } else {
        System.out.println(Yıl + " bir artık yıl değildir.");
    }
}
}
