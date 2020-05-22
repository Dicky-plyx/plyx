package Minggu2;

public class PangkatRekrisufInteratif {

    public static int pangkatInteratif(int x, int y) {
        int hasil = 1;
        int i = 1;
        while (i <= y) {
            hasil = hasil * x;
            i++;
        }
        return hasil;
    }

    public static int pangkatRekrusif(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * pangkatRekrusif(x, y - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hasil 7 pangkat 4=" + pangkatInteratif(7, 4));
        System.out.println("Hasil 8 pangkat 2=" + pangkatRekrusif(8, 2));
    }
}
