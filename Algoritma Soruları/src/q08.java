import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        // Klavyeden sürekli tamsayılar giriliyor ,girilen sayılar
        // içinde 5 sayısının adedi 10 olunca duran programı yazınız.

        Scanner read = new Scanner(System.in);
        int sayi, sayac = 0;
        while (true) {
            System.out.print("Sayı giriniz: ");
            sayi = read.nextInt();
            if (sayi == 5) {
                sayac += 1;
            }
            if (sayac == 10) break;
        }
        System.out.println("5 sayısı 10 kere girildi program sonlandırıldı !");
    }
}
