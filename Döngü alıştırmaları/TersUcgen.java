import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        //Java'da döngüler kullanılarak yıldızlar ile Ters üçgen yapınız.
        String bosluk = " ", yildiz = "*";
        int i, j, m;
        int boslukSayisi = 0;

        Scanner read = new Scanner(System.in);
        System.out.print("Üçgenin kenar uzunluğunu giriniz: ");

        int kenar = read.nextInt();
        int yildizSayisi = kenar;

        for (i = 0; i < kenar; i++) {
            for (j = 0; j < boslukSayisi; j++) {
                System.out.print(bosluk);
            }
            boslukSayisi += 1;

            for (m = 0; m < yildizSayisi; m++) {
                System.out.print(bosluk);
                System.out.print(yildiz);
            }
            yildizSayisi -= 1;
            System.out.println("");
        }
    }
}
