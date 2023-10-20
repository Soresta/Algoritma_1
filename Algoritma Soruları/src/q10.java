import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        //Klavyeden girilen tipi integer olan sayının gerçekten integer aralıgında olup olmadıgını bulan
        //programı yazınız.

        Scanner read = new Scanner(System.in);


        System.out.println("Sayı giriniz: ");
        int sayi = read.nextInt();

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        if (sayi < max && sayi > min) {
            System.out.println("Girilen sayı Integer aralığında'dır.");
        } else {
            System.out.println("Girilen sayı Integer aralığında değildir.");
        }
    }
}
