public class s2 {
    //       3   3
    //soru2: Σ   ∏ [((i+j)^k!)/cos(k)]
    //      j=1  k=1

    //1.yöntem
    public static int fonksiyon() {
        int toplam = 0;
        for (int j = 1; j < 4; j++) {
            double carpim = 1;
            for (int k = 1; k < 4; k++) {
                int fak = 1;
                int sonuc = 1;
                for (int i = k; i > 0; i--) {
                    fak *= i;
                }
                for (int t = 0; t < fak; t++) {
                    sonuc *= (1 + j);
                }
                carpim *= (sonuc / Math.cos(k));
            }
            toplam += carpim;
        }
        return toplam;
    }
    //-----------------------------------------------------------------------------------------------------//
    //yöntem 2
    public static int fak(int sayi) {
        int sonuc = 1;
        for (int i = sayi; i > 0; i--) {
            sonuc *= i;
        }
        return sonuc;
    }

    public static int fonskiyon1() {
        int toplam = 0;
        for (int i = 1; i < 4; i++) {
            double carpim = 1;
            for (int j = 1; j < 4; j++) {
                double sonuc = 1;
                for (int k = 0; k < fak(j); k++) {
                    sonuc *= 1 + i;
                }
                carpim *= sonuc / Math.cos(j);
            }
            toplam += carpim;
        }
        return toplam;
    }

    public static void main(String[] args) {
        System.out.println(fonksiyon());
        System.out.println(fonskiyon1());
    }
}


