import java.util.Scanner;

public class s1 {
    //Klavyeden girilen 2 tamsayı arasında ki bir basamaklı,iki basamaklı ve üç basamaklı sayıları ayrı ayrı toplayan ve sonucu ekrana yazdıran
    //java kodunu yazınız.
    
    public static void main(String[] args) {

        //soru1
        int bToplam = 0, iToplam = 0, uToplam = 0;
        Scanner read = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz: ");
        int sayi1 = read.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        int sayi2 = read.nextInt();
        int yedek;
        if (sayi1 < 0) sayi1 = sayi1 * -1;
        if (sayi2 < 0) sayi2 = sayi2 * -1;

        if (sayi1 > sayi2) {
            yedek = sayi1;
            sayi1 = sayi2;
            sayi2 = yedek;
        }

        for (int i = sayi1; i < sayi2; i++) {
            if (i > 0 && i < 10) bToplam += i;
            if (i >= 10 && i < 100) iToplam += i;
            if (i >= 100 && i < 1000) uToplam += i;
        }
        System.out.println("Bir basamaklı sayıların toplamı: " + bToplam + ", İki basamaklı sayıların toplamı: "
                + iToplam + ", Üç basamklı sayıların toplamı: " + uToplam);
    }
}
