package jobsheet5;

import java.util.Scanner;

public class ifCetakKRS21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan;

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT udah lunas? (true/false) ");
        boolean uktLunas = sc.nextBoolean();

        // if(uktLunas){
        //     System.out.println("Pembayaran UKT terverifikasi");
        //     System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
        // }else{
        //     System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        // }

        pesan = (uktLunas)
            ? "Pembayaran UKT terverifikasi\nSilakan cetak KRS dan minta tanda tangan DPA"
            : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";

        System.out.println("--- Ouput dengan Ternary Operator ---");
        System.out.println(pesan);

        sc.close();
    }
}
