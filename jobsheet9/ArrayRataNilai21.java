package jobsheet9;

import java.util.Scanner;

public class ArrayRataNilai21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] nilaiMhs = new int[10];
        double total = 0;
        double rata2;
        int totalMhsLulus = 0;

        for(int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if(nilaiMhs[i] > 70 && nilaiMhs[i] <= 100){
                totalMhsLulus += 1;
            }
            total += nilaiMhs[i];
        }

        rata2 = total / nilaiMhs.length;

        System.out.println("Total mahasiswa yang lulus = " + totalMhsLulus);
        System.out.println("Rata-rata nilai = " + rata2);
    }
}
