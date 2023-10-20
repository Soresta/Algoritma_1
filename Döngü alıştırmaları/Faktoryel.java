import java.util.Scanner;

public class Faktoryel {
    public static void main(String[] args) {
        //Java ile faktöriyel hesaplayan program yazınız.

        Scanner read = new Scanner(System.in);
        long top = 1;

        System.out.print("Lütfen faktöryelini hesaplamak istediğiniz sayıyı giriniz: ");
        long number = read.nextLong();
        if (number >= 0) {
            for (int i = 1; i <= number; i++) {
                top = top * i;
            }
            System.out.println(number + ". Sayısının Faktöryeli: " + top);
        } else {
            System.out.println("Lütfen pozitif bir tam sayı giriniz!");
            System.out.println("Faktöryel hesaplanamadı!");
        }
    }
}
