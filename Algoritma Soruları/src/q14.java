import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        //1-100 arasında asal sayıları bulan program.
        Scanner read  = new Scanner(System.in);

        System.out.println("Sayi giriniz: ");
        int n = read.nextInt();
        int sayac = 1;
        for (int i = 2; i <= n; i++) {
            boolean asal = true;
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    asal = false;
                    break;
                }
            }
            if (asal) {
                System.out.println(sayac + " Asal sayı : " + i);
                sayac+=1;
            }
        }
    }
}
