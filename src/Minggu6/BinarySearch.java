package Minggu6;

/**
 *
 * @author Dicky
 */
public class BinarySearch {
    public static void main(String[] args) {
        int angka [] ={1,2,5,7,8,9,12};
        int kunci = 8;
        int index = angka.length/2;
        boolean ketemu = false;
        
        int tengah = index;
        while(index >= 0 && index < angka.length && ketemu == false){
            if(kunci == angka[index]){
                System.out.println("Data ditemukan pada index ke-"+index);
                ketemu = true;
            }else{
                if(kunci < angka[tengah]){
                    index--;
                }else{
                    index++;
                }
            }
        }
        if(ketemu == false){
            System.out.println("Data tidak ditemukan");
        }
    }
}
