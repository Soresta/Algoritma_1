import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        //Klavyeden girilen bir sayının tüm tam bölenlerini bulup listeleyen (Ekrana yazan) bir algoritma geliştiriniz

        Scanner read = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = read.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                System.out.println(sayi + ". böleni : " + i);
            }
        }
    }
}
