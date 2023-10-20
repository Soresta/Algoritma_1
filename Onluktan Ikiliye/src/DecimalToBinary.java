import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int number, bolum, kalan;
        System.out.print("Tamsayı giriniz: ");
        number = read.nextInt();
        bolum = number;
        String sonuc  ="";

        while (bolum != 0) {
            bolum = bolum / 2;
            kalan = number - bolum * 2;
            sonuc=kalan + sonuc;
            number = bolum;
        }
        System.out.println(sonuc);
    }
}
