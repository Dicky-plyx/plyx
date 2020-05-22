package Minggu2;

public class Rumus {

    public static int hitungRumus(int a, int b, int c) {
        if (c == 0) {
            return 1;
        } else {
            return (a + b) * hitungRumus(a, b, c - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("(2+3)^4=5^4=" + hitungRumus(2, 3, 4));
    }
}
