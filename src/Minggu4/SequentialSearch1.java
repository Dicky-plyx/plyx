package Minggu4;

/**
 *
 * @author Dicky
 */
public class SequentialSearch1 {

    public static void main(String[] args) {
        String[] nama = {"Dicky", "Syiful", "Rama", "Andien", "Ndaru", "Fii"};
        boolean ketemu = false;
        String key = "ndaru";
        for (int i = 0; i < nama.length; i++) {
            if (key.equalsIgnoreCase(nama[i])) {
                System.out.println("Data ditemukan pada index ke-" + i);
                ketemu = true;
                break;
            }
            if (ketemu = false) {
                System.out.println("Data tidak ditemukan");
            }
        }
    }
}
