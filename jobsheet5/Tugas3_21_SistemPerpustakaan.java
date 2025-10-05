package jobsheet5;

import java.util.Scanner;

public class Tugas3_21_SistemPerpustakaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean bawaKartu, registrasiOnline;

        System.out.println("=== Sistem Perpustakaan ===");
        System.out.print("Apakah mahasiswa membawa kartu mahasiswa? (true/false) ");
        bawaKartu = input.nextBoolean();

        System.out.print("Apakah mahasiswa sudah registrasi online? (true/false) ");
        registrasiOnline = input.nextBoolean();

        if(bawaKartu || registrasiOnline){
            System.out.println("Mahasiswa boleh masuk ke perpustakaan");
        }else{
            System.out.println("Mahasiswa tidak boleh masuk ke perpustakaan");
        }

        input.close();
    }
}
