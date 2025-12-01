package jobsheet11;

import java.util.Scanner;

public class NilaiMahasiswa21 {
    static Scanner sc = new Scanner(System.in);
    
    public static void isianArray(double[] nilaiMahasiswa){
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = sc.nextInt();
        }
    }

    public static void tampilArray(double[] nilaiMahasiswa){
        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            System.out.println(nilaiMahasiswa[i]);
        }
    }

    public static double hitTot(double[] nilaiMahasiswa){
        double total = 0;

        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            total += nilaiMahasiswa[i];
        }

        return total;
    }
    
    public static void main(String[] args) {
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        double[] nilaiMahasiswa = new double[jumlahMahasiswa];

        isianArray(nilaiMahasiswa);
        tampilArray(nilaiMahasiswa);

        double totalNilai = hitTot(nilaiMahasiswa);
        System.out.println("\nTotal nilai seluruh mahasiswa: " + totalNilai);
    }
}
