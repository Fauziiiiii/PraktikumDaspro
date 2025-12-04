package jobsheet13;

import java.util.Scanner;

public class CM2_MuhammadFauziFadillah {
    static Scanner sc = new Scanner(System.in);

    // 10 merupakan baris maksimal untuk prod, 5 merupakan jumlah field dalam data prestasi (Nama mahasiswa, NIM, Jenis prestasi, Tingkat prestasi, Tahun prestasi)
    static int jumlahKategori = 5;
    static String[][] dataPrestasi = new String[10][jumlahKategori];
    static int jumlahData = 0;
    
    public static void inputMenu(){
        int menu = 0;
        do{
            System.out.println("=== PENCATATAN PRESTASI MAHASISWA ===");
            System.out.println("1. Tambah Data Prestasi");
            System.out.println("2. Tampilkan Semua Prestasi");
            System.out.println("3. Cari Data Prestasi Berdasarkan Tahun Prestasi");
            System.out.println("4. Hitung Jumlah Prestasi per Tingkat");
            System.out.println("5. Keluar");
    
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();
    
            switch (menu) {
                case 1:
                    tambahDataPrestasi();
                    break;

                case 2:
                    tampilSemuaPrestasi();
                    break;
                
                case 3:
                    cariDataPrestasi();
                    break;

                case 4:
                    hitungJumlahPrestasi();
                    break;

                case 5:
                    System.out.println("Sistem dihentikan.\n");
                    menu = 0;
                    break;
            
                default:
                    System.out.println("Menu tidak valid\n");
                    break;
            }
        }while(menu != 0);
    }

    public static void tambahDataPrestasi(){
        System.out.print("Masukkan Nama Mahasiswa: ");
        String namaMhs = sc.nextLine();
        dataPrestasi[jumlahData][0] = namaMhs;

        System.out.print("Masukkan NIM Mahasiswa: ");
        String NIM = sc.nextLine();
        dataPrestasi[jumlahData][1] = NIM;

        System.out.print("Masukkan Jenis Prestasi: ");
        String jenisPrestasi = sc.nextLine();
        dataPrestasi[jumlahData][2] = jenisPrestasi;

        String tingkatPrestasi = validasiInputTingkat();
        dataPrestasi[jumlahData][3] = tingkatPrestasi;

        String tahunPrestasi = validasiInputTahun();
        dataPrestasi[jumlahData][4] = tahunPrestasi;

        System.out.println("Data prestasi berhasil ditambahkan\n");

        jumlahData++;
    }

    public static void tampilSemuaPrestasi(){
        if(statusDataKosong()){
            return;
        }
        
        System.out.println("========================================= Data Prestasi Mahasiswa =========================================");
        System.out.printf("%-20s %-15s %-25s %-20s %-15s%n", "Nama", "NIM", "Jenis Prestasi", "Tingkat Prestasi", "Tahun Prestasi");
        System.out.println("===========================================================================================================");

        for (int i = 0; i < jumlahData; i++) {
            String namaMhs = dataPrestasi[i][0];
            String NIM = dataPrestasi[i][1];
            String jenisPrestasi = dataPrestasi[i][2];
            String tingkatPrestasi = dataPrestasi[i][3];
            String tahunPrestasi = dataPrestasi[i][4];
            
            System.out.printf("%-20s %-15s %-25s %-20s %-15s%n", namaMhs, NIM, jenisPrestasi, tingkatPrestasi, tahunPrestasi);
        }
        
        System.out.println();
    }

    public static void cariDataPrestasi(){
        int tempJumlahData = 0;
        String[][] tempDataPrestasi = new String[10][jumlahKategori];

        if(statusDataKosong()){
            return;
        }

        System.out.println("Cari data prestasi berdasarkan tahun");
        String inputTahunPrestasi = validasiInputTahun();

        // proses filter data berdsarkan tahun
        for (int i = 0; i < dataPrestasi.length; i++) {
            if(dataPrestasi[i] == null){
                continue;
            }

            if(dataPrestasi[i][4] != null && dataPrestasi[i][4].equals(inputTahunPrestasi)){
                tempDataPrestasi[tempJumlahData][0] = dataPrestasi[i][0];
                tempDataPrestasi[tempJumlahData][1] = dataPrestasi[i][1];
                tempDataPrestasi[tempJumlahData][2] = dataPrestasi[i][2];
                tempDataPrestasi[tempJumlahData][3] = dataPrestasi[i][3];
                tempDataPrestasi[tempJumlahData][4] = dataPrestasi[i][4];
                
                tempJumlahData++;
            }
        }

        // output data prestasi berdasarkan tahun
        if(tempJumlahData == 0){
            System.out.println("Belum ada data prestasi di tahun " + inputTahunPrestasi);
            System.out.println();
        }else{

            System.out.println("========================================= Data Prestasi Mahasiswa =========================================");
            System.out.printf("%-20s %-15s %-25s %-20s %-15s%n", "Nama", "NIM", "Jenis Prestasi", "Tingkat Prestasi", "Tahun Prestasi");
            System.out.println("===========================================================================================================");

            for (int i = 0; i < tempJumlahData; i++) {
                String namaMhs = tempDataPrestasi[i][0];
                String NIM = tempDataPrestasi[i][1];
                String jenisPrestasi = tempDataPrestasi[i][2];
                String tingkatPrestasi = tempDataPrestasi[i][3];
                String tahunPrestasi = tempDataPrestasi[i][4];

                System.out.printf("%-20s %-15s %-25s %-20s %-15s%n", namaMhs, NIM, jenisPrestasi, tingkatPrestasi, tahunPrestasi);
            }
            
            System.out.println();
        }
        
    }

    public static void hitungJumlahPrestasi(){
        int jumlahLokal = 0;
        int jumlahNasional = 0;
        int jumlahInternasional = 0;

        if(statusDataKosong()){
            return;
        }else{
            // proses cari jumlah data prestasi berdasarkan tingkat
            for (int i = 0; i < dataPrestasi.length; i++) {
                if(dataPrestasi[i][3] != null && dataPrestasi[i][3].equalsIgnoreCase("Lokal")){
                    jumlahLokal++;
                }else if(dataPrestasi[i][3] != null && dataPrestasi[i][3].equalsIgnoreCase("Nasional")){
                    jumlahNasional++;
                }else if(dataPrestasi[i][3] != null && dataPrestasi[i][3].equalsIgnoreCase("Internasional")){
                    jumlahInternasional++;
                }else{
                    continue;
                }
            }

            System.out.println("\n=== JUMLAH PRESTASI PER TINGKAT");
            System.out.println("Lokal\t\t: " + jumlahLokal);
            System.out.println("Nasional\t: " + jumlahNasional);
            System.out.println("Internasional\t: " + jumlahInternasional);

            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        inputMenu();
    }

    public static String validasiInputTingkat(){
        String tingkatPrestasi;

        while (true) {
            System.out.print("Masukkan Tingkat Prestasi (Lokal/Nasional/Internasional): ");
            tingkatPrestasi = sc.nextLine();

            if (tingkatPrestasi.equalsIgnoreCase("Lokal") || 
                tingkatPrestasi.equalsIgnoreCase("Nasional") || 
                tingkatPrestasi.equalsIgnoreCase("Internasional")){
                return tingkatPrestasi;
            }else{
                System.out.println("Tingkat Prestasi hanya boleh diisi Lokal, Nasional, dan Internasional");
            }
        }
    }

    public static String validasiInputTahun(){
        String tahunPrestasi;
        
        while (true) {
            System.out.print("Masukkan Tahun Prestasi (2015 - 2025): ");
            tahunPrestasi = sc.nextLine();
            
            int formatTahunPrestasi = Integer.parseInt(tahunPrestasi);
            
            if(formatTahunPrestasi >= 2015 && formatTahunPrestasi <= 2025 ) {
                return tahunPrestasi;
            }else{
                System.out.println("Tahun harus antara 2015 - 2025");
            }
        }
    }

    public static boolean statusDataKosong(){
        if(dataPrestasi[0][0] != null){
            return false;
        }else{
            System.out.println("Belum ada data prestasi");
            System.out.println();
            return true;
        }
    }

}
