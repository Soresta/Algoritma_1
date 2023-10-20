import java.util.Scanner;

public class q20 {
    public static void main(String[] args) {
        //Klavyeden rastgele karakterler giriliyor. bu karakterleri birleştirip bilgisayar kelimesi oluşturulmak
        //isteniyor. bu işlemi gerçekleştiren progamı yazınız..

        Scanner read = new Scanner(System.in);
        String kelime = "";
        int sayac = 0;
        String istneilen = "Bilgisayar";
        while (true) {
            if (kelime.equals(istneilen)) {
                break;
            }
            System.out.println("Bir karakter giriniz: ");
            char harf = read.next().charAt(0);

            if (harf == istneilen.charAt(sayac)) {
                kelime = kelime + harf;
                sayac += 1;
            }
        }
        System.out.println(kelime);
    }
}

