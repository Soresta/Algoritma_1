import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Klavyeden girilen 10 tam sayının pozitif olanların ortalamasını hesapalyan programı yazınız.
        Scanner read = new Scanner(System.in);
        int i, sayi;
        double ortalama, sayac = 0.0, toplam = 0.0;
        for (i = 0; i < 10; i++) {
            System.out.print("Sayi giriniz: ");
            sayi = read.nextInt();

            if (sayi > 0) {
                toplam = toplam + sayi;
                sayac += 1;
            }
        }
        ortalama = toplam / sayac;

        if (ortalama != ortalama) {
            System.out.println("Ortalama bulunmuyor ");//(Girilen sayıların hepsi 0 veya negatif ise boyle yazar)
        } else {
            System.out.println("Girilen pozitif sayıların ortalaması = " + ortalama);
        }
    }
}
