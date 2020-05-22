package Minggu4;

/**
 *
 * @author Dicky
 */
public class SequentialSearch4 {

    public static void main(String[] args) {

        String[] kt = {"DeskripsiJava ", "adalah ", "bahasa ", "pemrograman ", "yang ", "dapat ", "dijalankan ", "di ", "berbagai ", "komputer ", "termasuk ", "telepon ", "genggam",
            "Bahasa", "ini", "awalnya", "dibuat", "oleh", "James", "Gosling", "saat", "masih", "bergabung", "di", "Sun", "Microsystems", "saat", "ini", "merupakan", "bagian", "dari", "Oracle", "dan", "dirilis", "tahun", "1995",
            "Salah", "satu", "penggunaan", "terbesar", "Java", "adalah", "dalam", "pembuatan", "aplikasi", "native", "untuk", "Android",
            "Selain", "itu", "Java", "pun", "menjadi", "pondasi", "bagi", "berbagai", "bahasa", "pemrograman", "seperti", "Kotlin", "Scala", "Clojure", "Groovy", "JRuby", "Jython",
            "Tipe", "data", "dasar", "di", "Java", "antara", "lain", "int", "float", "double", "String", "Boolean", "dan", "lainya"};

        String key = "untuk";
        boolean f = false;

        for (int i = 0; i < 13; i++) {
            if (key.equalsIgnoreCase(kt[i])) {
                f = true;
                for (int j = 0; j < 13; j++) {
                    System.out.print(kt[j] + " ");
                }
            }
        }
        System.out.println(" ");
        for (int i = 13; i < 36; i++) {
            String string = kt[i];
            if (key.equalsIgnoreCase(kt[i])) {
                f = true;
                for (int j = 13; j < 36; j++) {
                    System.out.print(kt[j] + " ");
                }
            }
        }
        System.out.println(" ");
        for (int i = 36; i < 48; i++) {
            String string = kt[i];
            if (key.equalsIgnoreCase(kt[i])) {
                f = true;
                for (int j = 36; j < 48; j++) {
                    System.out.print(kt[j] + " ");
                }
            }
        }
        System.out.println(" ");
        for (int i = 48; i < 65; i++) {
            String string = kt[i];
            if (key.equalsIgnoreCase(kt[i])) {
                f = true;
                for (int j = 48; j < 65; j++) {
                    System.out.print(kt[j] + " ");
                }
            }
        }

        System.out.println(" ");
        for (int i = 65; i < 79; i++) {
            String string = kt[i];
            if (key.equalsIgnoreCase(kt[i])) {
                f = true;
                for (int j = 65; j < 79; j++) {
                    System.out.print(kt[j] + " ");
                }
            }
        }
        if (f == false) {
            System.out.println("data tidak ditemukan");
        }
    }
}
