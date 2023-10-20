import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        //Klavyeden girilen bir cümlenin sondan 2'inci kelimesini ekrana yazan programı yazınız!

        Scanner raed = new Scanner(System.in);
        System.out.print("Cumleyi giriniz: ");
        String cumle = raed.nextLine();

        String istenilen = "";

        int lastSpace = cumle.lastIndexOf(" ");

        while (true) {
            char harf = cumle.charAt(lastSpace - 1);

            if (harf == ' ') {
                break;
            }
            istenilen = harf + istenilen;
            lastSpace -= 1;
        }
        System.out.println(istenilen);
    }
}
