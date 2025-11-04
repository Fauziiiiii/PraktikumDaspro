package jobsheet9;

import java.util.Scanner;

public class ArrayNilai21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];

        for(int i = 0; i < nilaiAkhir.length; i++){
            System.out.print("Masukkan nilai akhir ke-" + i + " : ");
            nilaiAkhir[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiAkhir.length; i++) {
            if(nilaiAkhir[i] > 70 && nilaiAkhir[i] <= 100){
                System.out.println("Mahasiswa ke-" + i + " lulus!");
            }else if(nilaiAkhir[i] >= 0  && nilaiAkhir[i] <= 70){
                System.out.println("Mahasiswa ke-" + i + " tidak lulus!");
            }else{
                System.out.println("Nilai mahasiswa ke-" + i + " tidak valid!");
            }
        }

        sc.close();
    }
}
