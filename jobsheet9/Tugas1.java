package jobsheet9;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahMahasiswa;
        double nilaiTertinggi = 0, nilaiTerendah = 100;
        double jumlahNilai = 0, rata2Nilai;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = sc.nextInt();
        
        double[] nilaiMhs = new double[jumlahMahasiswa];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();

            jumlahNilai += nilaiMhs[i];

            if(nilaiMhs[i] > nilaiTertinggi){
                nilaiTertinggi = nilaiMhs[i];
            }

            if(nilaiMhs[i] < nilaiTerendah){
                nilaiTerendah = nilaiMhs[i];
            }
        }

        rata2Nilai = jumlahNilai / jumlahMahasiswa;

        System.out.println("\n====== TABEL NILAI  ======");
        System.out.println("\nNo\tNilai");
        System.out.println("-------------");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println((i + 1) + "\t" + nilaiMhs[i]);
        }

        System.out.println("\n====== HASIL PENILAIAN  ======");
        System.out.println("Nilai Tertinggi = " + nilaiTertinggi);
        System.out.println("Nilai Terendah = " + nilaiTerendah);
        System.out.println("Rata-rata nilai mahasiswa = " + rata2Nilai);

        sc.close();
    }
}
