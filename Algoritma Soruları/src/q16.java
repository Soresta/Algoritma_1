import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {
        //girilen sayının Palindromik bir sayı olup olmadığını bulan programı yazınız.

        Scanner read = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int number = read.nextInt();

        int bolumKalani = number, haneSayisi = 0, bolum, numberTers, kuvvet = 1, onceki = 0, last = 0, kayitN = number;

        do {
            bolumKalani = bolumKalani / 10;
            haneSayisi += 1;
        } while (bolumKalani != 0);
        int i = haneSayisi - 1;
        int[] haneler = new int[haneSayisi];

        while (kayitN != 0) {
            bolum = kayitN % 10;
            kayitN = kayitN / 10;
            haneler[i] = bolum;
            i--;
        }
        for (
                int sayi : haneler) {
            numberTers = sayi * kuvvet;
            last = numberTers + last;
            kuvvet = kuvvet * 10;
        }
        if (last == number) {
            System.out.println("Girilen sayı bir polindromik bir sayıdır.");
        } else {
            System.out.println("Girilen sayı palindromik bir sayı değildir.");
        }
    }
}
