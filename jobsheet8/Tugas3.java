package jobsheet8;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahCabang, jumlahPelanggan = 0, jumlahItem = 0;

        System.out.print("Jumlah cabang kafe: ");
        jumlahCabang = sc.nextInt();

        System.out.println("\n=== Input Penjualan Per Cabang ===");
        
        for (int i = 1; i <= jumlahCabang ; i++) {
            int jumlahPelangganPerCabang = 0, jumlahItemPerCabang = 0;

            System.out.println("\n--- Cabang " + i + " ---");

            System.out.print("Jumlah pelanggan: ");
            jumlahPelangganPerCabang = sc.nextInt();
            for (int j = 1; j <= jumlahPelangganPerCabang; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                jumlahItemPerCabang += sc.nextInt();
                sc.nextLine();
            }

            jumlahPelanggan += jumlahPelangganPerCabang;
            jumlahItem += jumlahItemPerCabang;

            System.out.println("Cabang " + i + ":");
            System.out.println("- Pelanggan: " + jumlahPelangganPerCabang + " orang");
            System.out.println("- Item terjual: " + jumlahItemPerCabang);
        }

        System.out.println("\nTotal selurh Cabang:");
        System.out.println("Pelanggan: " + jumlahPelanggan + " orang");
        System.out.println("Item terjual: " + jumlahItem + " item");

        sc.close();
    }
}
