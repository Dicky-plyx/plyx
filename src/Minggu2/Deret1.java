package Minggu2;

import java.util.*;

/**
 *
 * @author Dicky
 */
public class Deret1 {

    public static int hitungDeret(int x) {
        if (x == 1 || x == 2) {
            return x + (x + 1);
        } else {
            return hitungDeret(x - 1) + x;
        }
    }

    public static void main(String[] args) {
        System.out.println("Masukkan jumlah deret");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        for (int i = 1; i <= x; i++) {
            System.out.print(hitungDeret(i) + "\t");
        }
    }
}
