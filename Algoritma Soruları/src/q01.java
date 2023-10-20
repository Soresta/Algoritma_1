import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        //Klavyeden girilecek X değerinden N değerine kadar tüm doğal sayıları listeleyen algoritmayı geliştiriniz.

        Scanner input = new Scanner(System.in);

        System.out.println("X değerini giriniz: ");
        int x = input.nextInt();

        System.out.println("N değerini giriniz: ");
        int n = input.nextInt();


        for (int j = x; j <= n; j++) {
            System.out.println(j);
        }
    }
}