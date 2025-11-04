package jobsheet9;

import java.util.Scanner;

public class SearchNilai21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int banyakNilai;
        int key;
        int hasil = 0;
        
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        banyakNilai = sc.nextInt();
        
        int[] arrNilai = new int[banyakNilai];

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        key = sc.nextInt();

        for (int i = 0; i < arrNilai.length; i++) {
            if(key == arrNilai[i]){
                hasil = i;
                break;
            }
        }

        System.out.println();
        System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
        System.out.println();

        sc.close();
    }
}
