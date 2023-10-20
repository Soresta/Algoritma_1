import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        //Klavyeden girilen 10 tane sayı içinde 5e eşit olanların kaçıncı sırada girildiğini
        //ekrana yazan programı yazınız.

        Scanner read = new Scanner(System.in);
        int sayi, i;
        for (i = 1; i <= 10; i++) {
            sayi = read.nextInt();
            if (sayi == 5) {
                System.out.println(i + ". Sırada 5 sayısı mevcüt");
            }
        }
    }
}
