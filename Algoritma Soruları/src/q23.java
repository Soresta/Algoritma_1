
import java.util.Scanner;

public class q23 {
    public static void main(String[] args) {
        //Klavyeden girilen bir Stringte "Herhangi bir kelimenin" var oluup olmadığını bulan ,
        //varsa ekana bulunuyor yazan yoksa bulunmuyor yazan programı yazınız!

        Scanner read = new Scanner(System.in);
        System.out.print("String girin: ");
        String kelime = read.nextLine();
        String istenilenKelim = "Evel İçinde", yedek = "";
        int j = 0;

        for (int i = 0; i < kelime.length(); i++) {

            if (kelime.charAt(i) == istenilenKelim.charAt(j)) {
                j++;
                yedek += kelime.charAt(i);
            }
            if (yedek.equals(istenilenKelim)) {
                System.out.println("Girilen stringte: '" + istenilenKelim + "' Kelimesi Bulunuyor");
                break;
            }
        }
        if (!yedek.equals(istenilenKelim)) {
            System.out.println("Girilen stringte: '" + istenilenKelim + "' Kelimesi Bulunmuyor!");
        }
    }
}
