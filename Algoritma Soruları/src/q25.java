import java.util.Scanner;

public class q25 {
    public static void main(String[] args) {
        //Girilen 10 string değerini asci karakter tablosuna göre harflerin değerinin
        //toplamasını yapıp ekrana yazdıran program
        Scanner k = new Scanner(System.in);
        int toplam = 0;
        String kelime = " ";
        for (int i = 0; i < 3; i++) {
            System.out.println("String girin: ");
            kelime = k.nextLine();
            for (int j = 0; j < kelime.length(); j++) {
                if (kelime.charAt(j) != ' ')
                    toplam += kelime.charAt(j);
            }
        }
        System.out.println("Stringlerin harflerinin ascci değerleri toplamı : " + toplam);
    }
}

