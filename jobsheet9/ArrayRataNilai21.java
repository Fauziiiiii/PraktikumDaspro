package jobsheet9;

import java.util.Scanner;

public class ArrayRataNilai21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jumlahMhs;
        int totalNilaiLulus = 0, totalMhsLulus = 0;
        int totalNilaiTidakLulus = 0, totalMhsTidakLulus = 0;
        double rata2Lulus, rata2TidakLulus;
        
        System.out.print("Masukkan jumlah mahasiswa : ");
        jumlahMhs = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];
        for(int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if(nilaiMhs[i] > 70 && nilaiMhs[i] <= 100){
                totalNilaiLulus += nilaiMhs[i];
                totalMhsLulus += 1;
            }else if(nilaiMhs[i] >= 0 && nilaiMhs[i] <= 70){
                totalNilaiTidakLulus += nilaiMhs[i];
                totalMhsTidakLulus += 1;
            }
        }

        rata2Lulus = (double) totalNilaiLulus / totalMhsLulus;
        rata2TidakLulus = (double) totalNilaiTidakLulus / totalMhsTidakLulus;
        
        System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TidakLulus);

        sc.close();
    }
}
