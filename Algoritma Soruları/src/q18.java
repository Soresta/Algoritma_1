import java.util.Scanner;

public class q18 {
    public static void main(String[] args) {
        //Sıfır –0 girilinceye kadar klavyeden okutulan değerlerin
        //ortalamasını hesaplayıp ekrana yazan algoritmayı geliştiriniz

        Scanner read = new Scanner(System.in);
        double sayi, toplam=0, sayac = 0;
        double ortalama;
        while (true) {
            System.out.print("Bir sayı giriniz: ");
            sayi = read.nextDouble();
            if (sayi == 0) break;
            else {
                toplam += sayi;
                sayac+=1;
            }
        }
        ortalama = toplam/sayac;
        System.out.println("Girilen sayıların ortalamsı = "+ ortalama);
    }
}

