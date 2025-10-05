package jobsheet5;

import java.util.Scanner;

public class Tugas3_21_AksesWiFiKampus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jenisPengguna;
        int SKS;

        System.out.println("=== Akses WiFi Kampus ===");
        System.out.print("Masukkan jenis pengguna: (dosen/mahasiswa) ");
        jenisPengguna = input.nextLine();

        if (jenisPengguna.equalsIgnoreCase("dosen")) {
            System.out.println("Akses WiFi diberikan (dosen)");
        }else if (jenisPengguna.equalsIgnoreCase("mahasiswa")) {
            System.out.print("Masukkan jumlah SKS: ");
            SKS = input.nextInt();
            
            if (SKS >= 12) {
                System.out.println("Akses WiFi diberikan (mahasiswa aktif)");
            }else{
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }
        }else{
            System.out.println("Akses ditolak");
        }
        
        input.close();
    }
}