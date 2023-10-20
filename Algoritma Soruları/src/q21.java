public class q21 {

    public static void main(String[] args) {
        //bir dizide en büyük 2'inci sayıyı bulan programı yazınız.

        int[] list = {5, 3, 7, 11};

        int largest = list[0];
        int largest2 = Integer.MIN_VALUE;

        for (int i = 0; i < list.length; i++) {
            if (list[i] > largest) {
                largest2 = largest;
                largest = list[i];
            }
        }
        System.out.println(largest2);
    }
}
