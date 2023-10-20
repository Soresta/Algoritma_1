import java.util.Scanner;

public class s5 {
    public static void main(String[] args) {
        //Klavyeden girilen tamsayı kadar adınızı ekrana yazan java kodunu yazınız!.
        String ad = "Akif";

        Scanner read = new Scanner(System.in);
        System.out.print("Adınızı kaç kere yazdırmak istiyorsunuz: ");
        int sayi = read.nextInt();

        for (int i = 1; i <= sayi; i++) {
            System.out.println(i + ". Kere :" + ad);
        }
    }
}
