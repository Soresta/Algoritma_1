import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        //Klavyeden girilen stringteki sayılardan çift olanların sayısını bulan programı yazınız..

        Scanner read = new Scanner(System.in);

        System.out.print("String girin: ");
        String giris = read.nextLine();
        int sayac = 0;

        for (int i = 0; i < giris.length(); i++) {
            char karaktetr = giris.charAt(i);
            if (karaktetr >= '0' && karaktetr <= '9') {
                if ((karaktetr - 48) % 2 == 0) {
                    sayac += 1;
                }
            }
        }
        System.out.println("Stringte ki çift sayıların sayısı: " + sayac);
    }
}
