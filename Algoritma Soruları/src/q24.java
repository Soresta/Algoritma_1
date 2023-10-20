import java.util.Scanner;

public class q24 {
    public static void main(String[] args) {
        //klavyeden girilen stringteki sesli harfleri silip(çıkartıp) geriye kalan ahrfleri yazdıran progrmaı yazınız.

        Scanner read = new Scanner(System.in);

        System.out.println("String giriniz: ");
        String cumle = read.nextLine();
        String sesliHarfler = "aeoiuüöıAEOİIUÜÖ";
        String sonuc = "";

        for (int i = 0; i < cumle.length(); i++) {
            boolean sart = true;
            for (int j = 0; j < sesliHarfler.length(); j++) {
                if (cumle.charAt(i) == sesliHarfler.charAt(j)) {
                    sart = false;
                }
            }
            if (sart){
                sonuc += cumle.charAt(i);
            }
        }System.out.println(sonuc);
    }
}
