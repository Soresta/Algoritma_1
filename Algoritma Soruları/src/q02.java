import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        //Klavyeden girilecek bir N değerine kadar fibonecci dizisini bulan algoritmayı geliştiriniz.

        Scanner read = new Scanner(System.in);

        System.out.println("N değerini giriniz: ");
        int n = read.nextInt();

        int a = 0, b = 1;
        int c = a + b;
        System.out.println(1);

        for (int i = a; c < n; i += b) {
            System.out.println(c);
            a = b;
            b = c;
            c = a + b;
        }
    }
}
