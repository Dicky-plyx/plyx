package Minggu3;

/**
 *
 * @author HP
 */
public class SelectionSort {

    public static void main(String[] args) {
        int angka[] = {28,24,47,32,135,59,31,46,23,10};
        int i = 0;
        while (i < angka.length - 1) {
            int tmp = i;
            for (int j = i + 1; j < angka.length; j++) {
                if (angka[j] < angka[tmp]) {
                    tmp = j;
                }
            }
            int hlp = angka[i];
            angka[i] = angka[tmp];
            angka[tmp] = hlp;
            i++;
        }
// mencetak hasil
        for (int h = 0; h < angka.length; h++) {
            System.out.print(angka[h] + " ");
        }
    }
}
