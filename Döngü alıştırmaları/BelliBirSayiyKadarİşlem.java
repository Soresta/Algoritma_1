import java.util.Locale;
import java.util.Scanner;

public class BelliBirSayiyKadarİşlem {
    public static void main(String[] args) {

        //Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.
        System.out.println(" -Çift sayı bulan program-".toUpperCase(Locale.ROOT));
        Scanner read = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int num = read.nextInt();

        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i + ". Sayısı çift sayı.");
            } else {
                continue;
            }
        }

        //Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e
        // tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

        System.out.println("3 ve 4'e Tam bölünen sayıları bulan program!");
        System.out.print("Farklı bir sayı giriniz: ");
        int num1 = read.nextInt();

        for (int j = 0; j <= num1; j++) {
            if (j % 3 == 0 && j % 4 == 0) {
                System.out.println(j + ". Sayısı 3 ve 4 'e tam bölünüyor");
            }
        }
    }
}


