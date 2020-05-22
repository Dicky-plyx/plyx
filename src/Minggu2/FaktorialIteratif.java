package Minggu2;

public class FaktorialIteratif {

    public static void main(String[] args) {
        int nilai = 8;
        int faktorial = 1;
        for (int i = nilai; i >= 1; i--) {
            faktorial = i * faktorial;
        }
        System.out.println("Nilai faktorial dari" + nilai + "=" + faktorial);
    }
}
