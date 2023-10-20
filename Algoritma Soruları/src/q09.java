import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        //klavyeden girilen stringteki kaç tane rakam olduğunu bulan ve bunu ekrana yazdıran programı yazınız!

        Scanner read = new Scanner(System.in);
        String sayi;

        System.out.print("String giriniz: ");
        sayi = read.nextLine();


        int sayac = 0;
        for (int i = 0; i < sayi.length(); i++) {
            if (sayi.charAt(i) <= '9' && sayi.charAt(i) >= '0') {
                sayac+=1;
            }
        }
        System.out.println("Stringteki rakamların sayısı : " + sayac);
    }
}
