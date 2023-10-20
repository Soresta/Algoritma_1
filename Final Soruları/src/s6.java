public class s6 {
    //soru6:kendisine parametre olarak gelen strinteki boşlukları silip stringi geri döndüren reküsrif fonksiyonu yazınız.
    public static String bosSil(String str, int i) {
        if (i == str.length()) return "";
        else {
            if (str.charAt(i) != ' ') return str.charAt(i) + "" + bosSil(str, i + 1);
            return bosSil(str, i + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(bosSil("SOREST sorest   __  ?? !'^+%& 09874", 0));
    }
}
