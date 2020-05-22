package Minggu2;

public class FaktorialRekrusif {

    public static int hitungFaktorial(int x) {
        if (x == 1) {
            return x;
        } else {
            return x * hitungFaktorial(x - 1);
        }
    }

    public static void main(String[] args) {
        int nilai = 8;
        System.out.println("Hasil faktorial dari" + nilai + "=" + hitungFaktorial(nilai));
    }
}
