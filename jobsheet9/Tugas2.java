package jobsheet9;

import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = sc.nextInt();
        
        sc.nextLine(); 

        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];

        System.out.println("\n--- Masukkan Data Pesanan ---");

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("Pesanan ke-" + (i + 1));
            
            System.out.print("  Nama Makanan/Minuman: ");
            namaPesanan[i] = sc.nextLine();
            
            System.out.print("  Harga: ");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine(); 
        }

        System.out.println("\n==============================");
        System.out.println("    DAFTAR PESENAN ANDA");
        System.out.println("==============================");

        double totalBiaya = 0;

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " \t- Rp" + hargaPesanan[i]);
            
            totalBiaya += hargaPesanan[i];
        }

        System.out.println("------------------------------");
        System.out.println("Total Biaya: Rp" + totalBiaya);
        System.out.println("==============================");

        sc.close();
    }
}