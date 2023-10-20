import java.util.Scanner;

public class s3 {
    public static void main(String[] args) {
        //klavyeden girilen 2 string'in uzunlukları aynı ise her stringin aynı indisinde olan karakteri diğer stringin yanına yazan
        // ve sonucu ekrana yazan java kodunu yazınız.
        //örnek:         str1             |           str2             |        sonuç
        //              "ali"             |          "def"             |       "adleif"
        //              "akif"            |          "emre"            |      "aekmirfe"

        Scanner read = new Scanner(System.in);

        System.out.println("1.kelime girin: ");
        String str1 = read.nextLine();

        System.out.println("2.kelime girin: ");
        String str2 = read.nextLine();
        String sonuc = "";
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                sonuc += str1.chatAt(i) + ""+ str2.charAt(i);
            }
            System.out.println("Sonuc string: " + sonuc);
        }
    }
}
