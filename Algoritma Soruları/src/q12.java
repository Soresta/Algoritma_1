import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        //klavyeden girilen Stringteki sayıların toplamını bulan programı yazınız!

        Scanner read = new Scanner(System.in);

        System.out.print("String girin: ");
        String giris = read.nextLine();
        int toplam = 0;

        for (int i = 0; i < giris.length(); i++) {
            char karakter = giris.charAt(i);
            if (karakter >= '0' && karakter <= '9') {
                toplam += karakter - 48;
            }
        }
        System.out.println("Stringteki sayıların  toplamı: " + toplam);
    }
}
