package Minggu3;

/**
 *
 * @author HP
 */
public class InsertionSort {

    public static void main(String args[]) {
        int a[] = {32,51, 323,15,34,94,35,23,14,99};
        for (int i = 0; i < a.length; i++) {
            int min = a[i];
            int j = i;
            while ((j > 0) && (min < a[j - 1])) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = min;
        }
        for (int h = 0; h < a.length; h++) {
            System.out.print(a[h] + " ");
        }
    }
}
