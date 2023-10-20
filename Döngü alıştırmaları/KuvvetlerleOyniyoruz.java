import java.util.Scanner;

public class KuvvetlerleOyniyoruz {
    public static void main(String[] args) {
        //Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.

        Scanner read = new Scanner(System.in);
        System.out.println("Sayı girinz: ");
        int num = read.nextInt();
        int n = 0;
        while (true) {
            if (Math.pow(2, n) > num) {
                break;
            } else {
                System.out.println((int) (Math.pow(2, n)));
            }
            n += 1;
        }

        //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

        System.out.println("Sayı giriniz: ");
        int num1 = read.nextInt();
        int t = 0, m = 0;
        do {
            System.out.println((int) (Math.pow(4, m)));
            System.out.println((int) (Math.pow(5, t)));
            m += 1;
            t += 1;
        } while ((int) (Math.pow(4, m)) < num1 || (int) (Math.pow(5, t)) < num1);
    }
}
