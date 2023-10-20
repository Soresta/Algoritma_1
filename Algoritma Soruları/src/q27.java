public class q27 {
    public static void main(String[] args) {
        //1 + (2^1 / 3!) + (3^2/4!) + (4^3/5!) ... şeklinde giden serinin ilk 50 elemanının toplamını ekrana yazdırın

        double baslangic = 1, us = 1;
        for (double n = 2; n <= 50; n++) {
            double fak = 1;
            double sonuc = 1;

            for (double j = 0; j < us; j++) {
                sonuc = n * sonuc;
            }

            for (double m = n + 1; m >= 1; m--) {
                fak = m * fak;
            }

            baslangic = baslangic + sonuc / fak;
            us += 1;
        }
        System.out.println(baslangic);
    }
}