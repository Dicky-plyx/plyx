package Minggu4;
import java.util.*;

/**
 *
 * @author Dicky
 */
public class SequentialSearch2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nama = {"dicky","umi","diah","ojet","sueb"};
        boolean ketemu = false;
        System.out.println("Masukkan Nama:");
        String key = input.nextLine();
        System.out.println("Hasil yang dicari:");
        for (int i = 0; i < nama.length; i++) {
            if (key.equalsIgnoreCase(nama[i])) {
                ketemu = true;
                System.out.println("Nama " + nama[i] + " Ditemukan pada data ke-" + (1 + i));
                System.out.println("");
                break;
            }
        }
        if (ketemu == false) {
            System.out.println("Data tidak ada");
        }
    }
}
