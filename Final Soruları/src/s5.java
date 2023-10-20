import java.util.Scanner;

public class s5 {
    //soru5:Klayveden rastgele sayılar giriliyor. Bu sayılar içinde 10 tane asal sayı
    // girildiğnde bu sayıları diziye atan ve dizidekş en büyük sayıyı ekrana yazan programı yazınız.
    //NOT: Main programı yazılması yeterlidir!

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] dizi = new int[10];
        int sayac = 0;
        while (sayac < 10) {
            boolean cond = true;
            int sayi = read.nextInt();
            if (sayi > 0)
                for (int i = 2; i < sayi; i++) {
                    if (sayi % i == 0) cond = false;
                }
            if ((cond == true || sayi == 2) && sayi != 1) {
                dizi[sayac] = sayi;
                sayac++;
            }
        }
        int enb = dizi[0];
        for (int i = 1; i < 10; i++) {
            if (dizi[i] > enb) enb = dizi[i];
        }
        System.out.println(enb);
    }
}
