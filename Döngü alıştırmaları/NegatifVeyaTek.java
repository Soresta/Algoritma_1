import java.util.Scanner;

public class NegatifVeyaTek {

    public static void main(String[] args) {
        //Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul
        // eden ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.

        Scanner read = new Scanner(System.in);
        int toplam = 0;
        while (true) {
            System.out.print("Sayı giriniz: ");
            int num = read.nextInt();

            if (num < 0) {
                break;
            } else {
                if (num % 2 == 1) {
                    toplam = toplam + num;
                }
            }
        }
        System.out.println("Girilen sayılardan tek olanların toplamı: " + toplam);


        //Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen
        // değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.

        int num1, toplam1 = 0;
        do {
            System.out.println("Sayı giriniz: ");
            num1 = read.nextInt();
            if (num1 % 2 == 0 && num1 % 4 == 0) {
                toplam1 = toplam1 + num1;
            }
        } while (num1 % 2 == 0);
        System.out.println("Girilen sayılardan çift ve 4'e tam bölüünen sayıların toplamı: " + toplam1);
    }
}


