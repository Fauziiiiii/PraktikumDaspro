import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tiket, totalTiket = 0;
        double totalHarga, hargaTiket = 50000, totalPenjualan = 0;
        String namaPelanggan;

        do{
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();

            if(namaPelanggan.equalsIgnoreCase("batal")){
                System.out.println("Program dihentikan.");
                break;
            }

            System.out.print("Masukkan jumlah tiket: ");
            tiket = sc.nextInt();

            if(tiket < 0){
                System.out.println("Input tidak valid. Masukkan lagi input yang valid!");
                sc.nextLine();
                continue;
            }

            if(tiket > 10){
                totalHarga = (hargaTiket * tiket) - (hargaTiket * 0.15);
            }else if(tiket > 4){
                totalHarga = (hargaTiket * tiket) - (hargaTiket * 0.1);
            }else{
                totalHarga = hargaTiket * tiket;
            }

            System.out.println("Total yang harus dibayar: Rp. " + totalHarga);
            
            totalTiket += tiket;
            totalPenjualan += totalHarga;

            sc.nextLine();

        } while(true);

        System.out.println("\n=== Penjualan Tiket Bioskop Hari Ini ===");
        System.out.println("Total tiket yang terjual: " + totalTiket);
        System.out.println("Total penjualan tiket satu hari: Rp. " + totalPenjualan);

        sc.close();
    }
}
