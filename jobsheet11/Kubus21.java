package jobsheet11;

import java.util.Scanner;

public class Kubus21 {

    public static int hitungVolume(int s){
        int volume = s * s * s;

        return volume;
    }

    public static int hitungLuasPermukaan(int s){
        int luasPermukaan = 6 * s * s;

        return luasPermukaan;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus(m): ");
        int panjangSisi = sc.nextInt();

        int volume = hitungVolume(panjangSisi);
        System.out.println("Volume kubus adalah: " + volume + " m3");

        int luasPermukaan = hitungLuasPermukaan(panjangSisi);
        System.out.println("Luas permukaan kubus adalah: " + luasPermukaan + " m2");

        sc.close();
    }
}
