package dizi;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Dizi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int dizi[] = new int[16];
        int sayac = 1;
        int giris;

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rand.nextInt(89) + 10;
        }
        System.out.println("en küçük sayıyı bulunuz\n"
                + "****************");
        for (int i = 0; i < dizi.length; i++) {
            if (sayac % 4 == 0) {
                System.out.println(dizi[i] + " ");
            } else {
                System.out.print(dizi[i] + " ");
            }
            sayac++;
        }
        Arrays.sort(dizi);
        System.out.println("****************");
        int can = 3;
        while (true) {
            giris = input.nextInt();
            if (can == 0) {
                System.out.println("hakkınız doldu oyun bitti");
                break;
            } else {
                if (dizi[0] == giris) {
                    System.out.println("doğru bildiniz");
                    break;
                } else {
                    can--;
                    System.out.println("yanlış cevap tekrar deneyiniz\n"
                            + "kalan can : " + can);
                }
            }
        }
    }

}
