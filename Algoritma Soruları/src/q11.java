import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        // klavyeden girilen 10 stringin son girilenden ilk girilene yazdıran programı yazınız.

        Scanner read = new Scanner(System.in);
        String a;
        String sonuc = "";


        for (int i = 0; i < 10; i++) {
            a = read.nextLine();
            sonuc = a + " " + sonuc;
        }
        System.out.println(sonuc);
    }
}
