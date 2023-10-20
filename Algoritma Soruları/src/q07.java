public class q7 {
    public static void main(String[] args) {
        //Find the difference between the sum of the squares of the first one hundred
        // natural numbers and the square of the sum.

        //İlk yüz doğal sayının kareleri toplamı ile ilk yüz doğal sayının toplamının karesi arasındaki farkı bulun.

        int tKaresi = 0, kToplami = 0, sonuc;

        for (int i = 0; i < 100; i++) {
            tKaresi = tKaresi + i;
        }
        tKaresi = (int) Math.pow(tKaresi, 2);

        for (int j = 0; j < 100; j++) {
            int kare = j * j;
            kToplami = kare + kToplami;
        }

        sonuc = tKaresi - kToplami;
        System.out.println("kareler farkı : " + sonuc);
    }
}
