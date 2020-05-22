package Minggu2;

import java.util.*;

/**
 *
 * @author HP
 */
public class Deret2 {

    public static int hitungDeret(int a) {
        if (a == 1 || a == 2) {
            return a;
        } else {
            return hitungDeret(a - 1) + hitungDeret(a - 2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah deret:");
        int a = input.nextInt();
        for (int i = 1; i <= a; i++) {
            System.out.print(hitungDeret(i) + "\t");
        }
    }
}