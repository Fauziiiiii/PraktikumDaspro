package jobsheet8;

import java.util.Scanner;

public class NilaiKelompok21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai, kelompokTertinggi = 0;
        float totalNilai, rataNilai = 0, nilaiTertinggi = 0;

        int i = 1;
        while(i <= 6){
            System.out.println("Kelompok " + i);

            totalNilai = 0;
            for(int j = 1; j <= 5; j++){
                System.out.print("  Nilai dari Kelompok Penilai " + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }

            rataNilai = totalNilai / 5;

            if(rataNilai > nilaiTertinggi){
                nilaiTertinggi = rataNilai;
                kelompokTertinggi = i;
            }

            System.out.println("Kelompok " + i + ": nilai rata-rata = " + rataNilai);

            i++;
        }

        System.out.println("\n === Kelompok dengan rata-rata nilai tertinggi ===");
        System.out.println("Kelompok " + kelompokTertinggi + " dengan nilai = " + nilaiTertinggi);
    }
}
