import java.util.Scanner;

public class YildizlarIleUcgen {
    public static void main(String[] args) {
        //Java'da döngüler kullanılarak yıldızlar ile üçgen yapınız.

        String bosluk = " ", yildiz = "*";
        int i, j, m;
        int ortaBosluk = 0;

        Scanner read = new Scanner(System.in);
        System.out.println("Üçgenin kenar uzunluğunu giriniz: ");
        int kenar = read.nextInt();

        int bSayisi = kenar;
        System.out.println(bSayisi);

        for (i = 0; i < kenar; i++) {
            for (j = 0; j < bSayisi - 1; j++) {
                System.out.print(bosluk);
            }
            System.out.print(yildiz);
            bSayisi -= 1;

            for (m = 0; m < ortaBosluk; m++) {
                System.out.print(bosluk);
                System.out.print(yildiz);
            }
            System.out.println("");
            ortaBosluk += 1;
        }
    }
}

