import java.util.Scanner;

public class s4 {
    //soru4:Klavyeden girilen sayılar içerisinde sıfır sayısı girildiğnde o ana kadar girilen
    //sayıları toplayan sonucu ekrana yazan ve bu işlemi 10 kez tekrarlayan programı yazınız.

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int toplam = 0;
            boolean cond = true;
            while (cond) {
                System.out.print("Sayı giriniz: ");
                int sayi = read.nextInt();
                if (sayi == 0) {
                    System.out.println(toplam);
                    cond = false;
                } else toplam += sayi;
            }
        }
    }
}
