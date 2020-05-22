package stack;

import java.util.Stack;//import library stack

public class StrukturData {

    public static void main(String[] args) {
        Stack kotor = new Stack();//deklarasi objek stack kotor
        Stack bersih = new Stack();//deklarasi objek stack bersih
        for (int i = 1; i <= 5; i++)//perulangan for
        {
            kotor.push("baju " + i);//proses memasukkan data pada stack
        }
        System.out.println("SEBELUM DICUCI" + "\nJumlah baju kotor : " + kotor.size() + "\nJumlah baju bersih : " + bersih.size() + "\nTumpukan baju kotor :"); //menampilkan jumlah naju kotor

        for (int i = 1; i <= 5; i++)//perulangan for
        {
            System.out.println(kotor.peek());
            bersih.push(kotor.pop());//proses pengeluaran data pada stack
        }
        System.out.println("\nSETELAH DICUCI" + "\nJumlah baju kotor : " + kotor.size() + "\nJumlah baju bersih : " + bersih.size() + "\nTumpukan baju bersih :");//menampilkan jumlah baju bersih dan baju yang telah dicuci
        for (int i = 4; i >= 0; i--) {
            System.out.println(bersih.elementAt(i));
        }
    }
}
