import java.util.Scanner;

public class UssuSayi {
    //Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int number, ussu, i;
        long sonuc = 1;

        System.out.print("Üssü alıncak sayıyı giriniz: ");
        number = read.nextInt();

        System.out.print("Üs olacak sayıyı giriniz: ");
        ussu = read.nextInt();

        for (i = 0; i < ussu; i++) {
            sonuc = number * sonuc;
        }
        System.out.println(number + "^" + ussu + " = " + sonuc);
    }
}
