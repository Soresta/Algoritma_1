public class s3 {
    //soru3:Klavyeden girilmiş olan iki boyutlu string dizisi içindeki tek karaktere sahip
    //olanları ekrana yazan methodu yazınız.
    public static void tekYaz(String[][] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                if (dizi[i][j].length() == 1) System.out.println(dizi[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        String[][] dizi1 = {{"Nawa", "A"}, {"Sorest", "F"}};
        tekYaz(dizi1);
    }
}
