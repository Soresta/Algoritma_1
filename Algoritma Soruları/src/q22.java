import java.util.Scanner;

public class q22 {
    public static void main(String[] args) {
        //Klavyeden girilen 10 sayıyı küçükten büyüğe sıralayan programı yazınız!

        Scanner read = new Scanner(System.in);

        int[] mylist = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Sayi giriniz: ");
            mylist[i] = read.nextInt();
        }
        int yedek = 0;

        for (int j = 0; j < mylist.length; j++) {
            for (int m = j + 1; m < mylist.length; m++) {
                if (mylist[j] > mylist[m]) {
                    yedek = mylist[j];
                    mylist[j] = mylist[m];
                    mylist[m] = yedek;
                }
            }
        }
        for (int sayi1 : mylist
        ) {
            System.out.println(sayi1);
        }
    }
}
