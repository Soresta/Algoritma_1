import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Klavyeden girilen String'in küçük harflerinin sayısını ekrana yazdıran program yazınız.

        Scanner read = new Scanner(System.in);

        System.out.print("String giriniz: ");
        String kelime1 = read.nextLine();
        String kelime2 = kelime1.toLowerCase();

        char harf1, harf2;
        int sayac = 0;

        for (int i = 0; i < kelime1.length(); i++) {
            harf1 = kelime1.charAt(i);
            harf2 = kelime2.charAt(i);
            if (harf1 == harf2) {
                sayac += 1;
            }
        }
        System.out.println("Girilen kelimenin küçük harfler sayısı = " + sayac);
    }
}
