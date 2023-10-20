import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //ödev:2 matrixin toplamlarını, farklarını, çarpımlarını ve her birinin transpozunu bulan java kodunu yazınız:

        //MatrixA VE MatrixB tanımlama ve boyutlarını belirleme:
        int[][] matrixA = new int[4][4];
        int[][] matrixB = new int[4][4];

        //Toplam, fark, çarpım şartları sağlamak için sonra lazım olucak değerler.
        int aMsatirS = matrixA.length;
        int aMsutunS = matrixA[0].length;
        int bMsatirS = matrixB.length;
        int bMsutunS = matrixB[0].length;

        //MatrixA'nın elemanlarını atamak:
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                matrixA[i][j] = (int) (Math.random() * 100);
            }
        }

        //MatrixB'nın elemanlarını atamak:
        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                matrixB[i][j] = (int) (Math.random() * 100);
            }
        }
        //MatrixA Ve Matrixb'nin içeriğini görmek için matrixleri ekrana ayzdırmak.
        System.out.println(Arrays.deepToString(matrixA));
        System.out.println(Arrays.deepToString(matrixB));

        //Toplam,Fark,Çarpım matrixlerinin boyutlarını tanımlıyoruz:
        int[][] toplamMatrix = new int[matrixA.length][matrixB.length];
        int[][] farkMatrix = new int[matrixA.length][matrixB.length];
        int[][] carpimMatrix = new int[aMsatirS][bMsutunS];

        //1.MatrixA ve MatrixB Toplamırını ve Farklarını hesaplama:
        //MatrixA ve MatrixB'nin Toplamlarını ve Farklarını hesaplayıp sonçları toplamMatrix'i ve FarkMatrix'ine atıyoruz:
        for (int i = 0; i < matrixA.length; i++) {
            int toplam = 0, fark = 0;
            for (int j = 0; j < matrixA.length; j++) {
                toplam = matrixA[i][j] + matrixB[i][j];
                fark = matrixA[i][j] - matrixB[i][j];
                toplamMatrix[i][j] = toplam;
                farkMatrix[i][j] = fark;
            }
        }

        //3.MatrixA ve MatrixB Çarpımını (MatrixA * MatrixB) hesaplama ve ÇarpımMatrix'ine sonuçları atama:
        if (aMsutunS == bMsatirS) {
            for (int i = 0; i < matrixA.length; i++) {
                int t = 0;
                while (t <= matrixB[0].length - 1) {
                    int toplam = 0;
                    for (int j = 0; j < matrixB.length; j++) {
                        toplam += matrixA[i][j] * matrixB[j][t];
                    }
                    carpimMatrix[i][t] = toplam;
                    t++;
                }
            }
        }
        //4.MatrixA ve MatrixB'nin Transpozunu hesaplama:
        //Transpoz matrixlerinin boyutlarını belirleme:
        int[][] transpozA = new int[matrixA[0].length][matrixA.length];
        int[][] transpozB = new int[matrixB[0].length][matrixB.length];

        //MatrixA'nın transpozunu hesaplama:
        for (int i = 0; i < matrixA[0].length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                transpozA[i][j] = matrixA[j][i];
            }
        }

        //MatrixB'nın transpozunu hesaplama:
        for (int i = 0; i < matrixB[0].length; i++) {
            for (int j = 0; j < matrixB.length; j++) {
                transpozB[i][j] = matrixB[j][i];
            }
        }

        //Final:Sonuçları yazdırma:
        System.out.println("MatrixA ve MatrixB Toplamının sonucu: " + Arrays.deepToString(toplamMatrix));
        System.out.println("MatrixA ve MatrixB Farkının sonucu: " + Arrays.deepToString(farkMatrix));
        System.out.println("MatrixA ve MatrixB Çarpımının sonucu: " + Arrays.deepToString(carpimMatrix));
        System.out.println("MatrixA'nın transpozu: " + Arrays.deepToString(transpozA));
        System.out.println("MatrixB'nın transpozu: " + Arrays.deepToString(transpozB));
    }
}