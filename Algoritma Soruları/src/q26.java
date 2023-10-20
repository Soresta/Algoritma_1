import java.util.Scanner;

public class q26 {
    public static void main(String[] args) {
        //Klavyeden kenar uzunluğu girilen üçgeni çizen programı yazınız!
        Scanner read = new Scanner(System.in);

        System.out.println("Yıldız sayısını girin: ");
        int yildizS = read.nextInt();
        for (int i = 1; i<=yildizS;i++){
            for (int j = 1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = yildizS-1; i>=0;i--){
            for (int j = 1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
