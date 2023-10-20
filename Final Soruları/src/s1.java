public class s1 {
    //soru1:KLavyeden girilen iki stringin karakterleri arasında yerleri aynı olmak şartıyla
    //birbirinden farklı olan karakterleri birleştirip geri döndüren methodu çalışır şekilde
    //(main programını yazarak) gerçekleştiriniz.
    //NOT: Stringler eşit uzunluktadır!
    public static void main(String[] args) {
        System.out.println(birlestir("SoresT","SseroT"));
    }

    public static String birlestir(String str1,String str2){
        String sonuc = "";
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i)!= str2.charAt(i)) sonuc+= str1.charAt(i) + "" + str2.charAt(i);
        }
        return sonuc;
    }
}
