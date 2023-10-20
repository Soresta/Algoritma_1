import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {
        //Klavyeden girilecek 20 sayının tek olanlarını ayrı çift olanlarını ayrı toplayıp
        //sonuçları ekrana yazan algoritmayı geliştiriniz

        Scanner read = new Scanner(System.in);
        int sayi ,toplamC=0,toplamT=0;

        for (int i = 0; i<20; i++){
            System.out.println("Sayı girin: ");
            sayi = read.nextInt();
            if(sayi%2 == 0){
                toplamC += sayi;
            }else toplamT += sayi;
        }
        System.out.println("Tek sayıların toplamı : "+ toplamT);
        System.out.println("Çift sayıların toplamı : "+ toplamC);
    }
}
