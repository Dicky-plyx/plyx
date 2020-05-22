package Minggu2;

public class FPB {

    public static int hitungFPB(int a, int b) {
        if (a % b == 0) {
            return b;
        } else {
            return hitungFPB(b, a % b);
        }
    }

    public static void main(String[] args) {
        int x = 312;
        int y = 414;
        System.out.println("Hasil FPB Dari" + x + "dan" + y + "=" + hitungFPB(x, y));
    }
}