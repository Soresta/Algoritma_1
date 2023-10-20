import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        //N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı
        //n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
        //Java ile kombinasyon hesaplayan program yazınız.

        // n -- kümede ki toplam eleman sayısını giriniz
        // r -- alt kumelerin eleman sayısı kaç olsun
        long nFak = 1, rFak = 1, sFak = 1, kSonuc;
        long s;
        System.out.println("--Kombinasyon hesaplayan programa hoşegeldiniz--");
        System.out.println("Kombinasyon formülü: C(n,r) = n! / (r! * (n-r)!)");
        Scanner read = new Scanner(System.in);

        System.out.print("n : kümedeki toplam eleman sayısını giriniz = ");
        long n = read.nextLong();

        System.out.print("r : alt kumelerin eleman sayısı kaç olsun = ");
        long r = read.nextLong();

        s = n - r;
        //n ve r'nin faktöryeli lazım olucaığı için faktoyel bulan program yazıyoruz:
        if (n >= 0) {
            for (int i = 1; i <= n; i++) {
                nFak = nFak * i;
                nFak = Math.abs(nFak);
            }
        } else {
            System.out.println("Lütfen pozitif bir tam sayı giriniz!");
            System.out.println("Faktöryel hesaplanamadı!");
        }
        if (r <= n) {
            if (r >= 0) {
                for (int i = 1; i <= r; i++) {
                    rFak = rFak * i;
                    rFak = Math.abs(rFak);
                }
            } else {
                System.out.println("Lütfen pozitif bir tam sayı giriniz!");
                System.out.println("Faktöryel hesaplanamadı!");

            }
        } else {
            System.out.println("r'nin n'den büyük veya eşit olması lazım.");
            System.exit(1);
        }

        if (s >= 0) {
            for (int i = 1; i <= s; i++) {
                sFak = sFak * i;
                sFak = Math.abs(sFak);
            }
        } else {
            System.out.println("Lütfen pozitif bir tam sayı giriniz!");
            System.out.println("Faktöryel hesaplanamadı!");
        }
        kSonuc = nFak / (rFak * (sFak));
        System.out.println("C(" + n + "," + r + ") = " + n + "!/(" + r + "!)*(" + n + "-" + r + ")!) = " + kSonuc);

    }
}
