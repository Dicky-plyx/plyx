package Minggu6;

/**
 *
 * @author Dicky
 */
public class BinarySearch1 {

    public static void main(String[] args) {
        String[] nama = {"Dicky","Firman","Gembor","Wempy","Ade","Sueb","Ahot"};
        String key = "Ade";
        boolean ketemu = false;
        int i = nama.length / 2;
        int j = nama.length / 2;

        while (i >= 0 && j < nama.length && ketemu == false) {
            if (key.equalsIgnoreCase(nama[i])) {
                System.out.println("Data ditemukan pada index ke-" + i);
                ketemu = true;
            } else if (key.equalsIgnoreCase(nama[j])) {
                System.out.println("Data ditemukan pada index ke-" + j);
                ketemu = true;

            } else {
                i--;
                j++;
            }
        }
        if (ketemu == false) {
            System.out.println("Data tidak ditemukan");
        }
    }
}
