package Minggu2;

public class FibonacciRekrusif {

    public static int hitungFibonacci(int x) {
        if (x == 1 || x == 2) {
            return 1;
        } else {
            return hitungFibonacci(x - 1) + hitungFibonacci(x - 2);
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            System.out.print(hitungFibonacci(i) + "");
        }
    }
}
