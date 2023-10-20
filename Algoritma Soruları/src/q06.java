import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        //Klavyeden girilen üç sayıdan büyüklük sıralamasına göre
        //ortadakini bulup ekrana yazan program için algoritma yazınız.

        Scanner read = new Scanner(System.in);

        int sayi1, sayi2, sayi3, ortaDeger;

        System.out.print("1.Sayıyı giriniz: ");
        sayi1 = read.nextInt();

        System.out.print("2.Sayıyı giriniz: ");
        sayi2 = read.nextInt();

        System.out.print("3.Sayıyı giriniz: ");
        sayi3 = read.nextInt();
        ortaDeger = Integer.MIN_VALUE;

        if (sayi1 > sayi2 && sayi2 > sayi3) {
            ortaDeger = sayi2;
        } else if (sayi1 > sayi3 && sayi3 > sayi2) {
            ortaDeger = sayi3;
        } else if (sayi2 > sayi1 && sayi1 > sayi3) {
            ortaDeger = sayi1;
        } else if (sayi2 > sayi3 && sayi3 > sayi1) {
            ortaDeger = sayi3;
        } else if (sayi3 > sayi1 && sayi1 > sayi2 ) {
            ortaDeger = sayi1;
        } else if (sayi3 > sayi2 && sayi2 > sayi1) {
            ortaDeger = sayi2;
        }
        if (ortaDeger != sayi1 && ortaDeger != sayi2 && ortaDeger != sayi3) {
            System.out.println("Ortda değer bulunmamaktadır!");
        } else {
            System.out.println(ortaDeger);
        }
    }
}
