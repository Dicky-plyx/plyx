package Minggu3;

/**
 *
 * @author HP
 */
public class BubbleSort {

    public static void main(String args[]) {
        int a[] = {8, 20, 6, 23, 3, 4, 21, 1, 21, 35};
        for (int i = 1; i < a.length; i++) {
            for (int h = 0; h < a.length - 1; h++) {
                if (a[h + 1] < a[h]) {
                    int tmp = a[h + 1];
                    a[h + 1] = a[h];
                    a[h] = tmp;
                }
            }
        }
// mencetak hasil
        for (int h = 0; h < a.length; h++) {
            System.out.print(a[h] + " ");
        }
    }
}
