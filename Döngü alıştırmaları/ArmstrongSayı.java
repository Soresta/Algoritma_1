import java.util.Scanner;

public class Armstrong {
    //Armstrong Sayı Nedir ?
    //N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse,
    //böyle sayılara Armstrong sayı denir.
    //Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir,
    //Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.

    //Klavyeden girilen sayının armstrong sayı olup olmadığını bulan metodu yazınız.
    //Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int sayi = input.nextInt();
        int sonuc = armstrong(sayi);
        if (sonuc == sayi) System.out.println(sayi + ". Sayısı armstrong sayıdır!");
        else System.out.println(sayi + ". Sayısı armstrong sayı değildir!");
    }

    public static int armstrong(int sayi) {
        int basamakS = 0, sonuc = 0, yedek = sayi;
        while (yedek != 0) {
            yedek = yedek / 10;
            basamakS++;
        }
        while (sayi != 0) {
            int carpim = 1;
            for (int i = 0; i < basamakS; i++) {
                carpim *= sayi % 10;
            }
            sonuc += carpim;
            sayi /= 10;
        }
        return sonuc;
    }
}
