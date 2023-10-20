import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        //Klavyeden girilen A ve B gibi iki sayının bölme işlemi kullanmadan sadece
        //toplama ve çıkarma kullanarak kalanlı bölme yapan algoritmayı yazınız.

        Scanner read = new Scanner(System.in);

        System.out.println("A/B işelmini çarpma ve bölme işlemleri kullanmadan yapıcaksınız!");
        System.out.println("A'nın değerini giriniz: ");
        int a = read.nextInt();

        System.out.println("B'nın değerini giriniz: ");
        int b = read.nextInt();

        int bolum = 0, kalan = 0;
        while (true) {
            if (a < b) {
                kalan = a;
                break;
            } else {
                a -= b;
                bolum += 1;
            }
        }
        System.out.println(bolum + ", " + kalan);
    }
}
