import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        //kalvyeden girilen bir sayıya göre elmas şekli çizen programı yazınız!
        Scanner read = new Scanner(System.in);
        int ortaUzunluk, gapA, gapB, sayac, sayac2;
        int i, j, t, l, m, n;
        sayac = 1;

        String gap = " ";
        String star = "*";

        System.out.print("Yıldızın ortasının uzunluğunu giriniz: ");
        ortaUzunluk = read.nextInt();
        sayac2 = ortaUzunluk - 2;
        gapA = (ortaUzunluk / 2);

        if (ortaUzunluk % 2 == 1) {
            for (i = 0; i < ortaUzunluk / 2 + 1; i++) {
                for (j = 0; j < gapA; j++) {
                    System.out.print(gap);
                }

                gapA -= 1;
                for (t = 0; t < sayac; t++) {
                    System.out.print(star);
                }
                sayac += 2;
                System.out.println("");

            }
        } else if (ortaUzunluk % 2 == 0) {
            String star1 = "**";
            gapA = gapA - 1;
            for (i = 0; i < ortaUzunluk / 2; i++) {
                for (j = 0; j < gapA; j++) {
                    System.out.print(gap);
                }

                gapA -= 1;
                for (t = 0; t < sayac; t++) {
                    System.out.print(star1);
                }
                sayac += 1;
                System.out.println("");
            }
        }
        gapA = 1;
        for (l = 0; l < ortaUzunluk / 2; l++) {

            for (n = 0; n < gapA; n++) {
                System.out.print(gap);
            }
            gapA += 1;

            for (m = 0; m < sayac2; m++) {
                System.out.print(star);
            }
            System.out.println("");
            sayac2 -= 2;
        }
    }
}
