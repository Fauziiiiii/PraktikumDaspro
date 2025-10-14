package CaseMethode1;

import java.util.Scanner;

public class CM1_MuhammadFauziFadillah {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama, nim;
        double uts1, uts2, uas1, uas2, tugas1, tugas2, nilaiAkhir1, nilaiAkhir2, rataRataNilaiAkhir;
        String nilaiHuruf1, nilaiHuruf2, statusMatkul1, statusMatkul2, statusSemester,
        formatUts1, formatUts2, formatUas1, formatUas2, formatTugas1, formatTugas2, formatNilaiAkhir1, formatNilaiAkhir2, formatRataRataNilaiAkhir;

        //Inputan
        System.out.println("==== INPUT DATA MAHASISWA ====");
        System.out.print("Nama : ");
        nama = input.nextLine();

        System.out.print("NIM  : ");
        nim = input.next();

        System.out.println("\n--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS\t: ");
        uts1 = input.nextDouble();

        System.out.print("Nilai UAS\t: ");
        uas1 = input.nextDouble();

        System.out.print("Nilai Tugas\t: ");
        tugas1 = input.nextDouble();

        System.out.println("\n--- Mata Kuliah 2: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS\t: ");
        uts2 = input.nextDouble();

        System.out.print("Nilai UAS\t: ");
        uas2 = input.nextDouble();

        System.out.print("Nilai Tugas\t: ");
        tugas2 = input.nextDouble();
        
        // proses nilai akhir kedua matkul
        nilaiAkhir1 = (uts1 * 0.3) + (uas1 * 0.4) + (tugas1 * 0.3);
        nilaiAkhir2 = (uts2 * 0.3) + (uas2 * 0.4) + (tugas2 * 0.3);

        // proses nilai huruf matkul1
        if (nilaiAkhir1 > 80 && nilaiAkhir1 <= 100) { 
            nilaiHuruf1 = "A"; 
        } else if (nilaiAkhir1 > 73) { 
            nilaiHuruf1 = "B+"; 
        } else if (nilaiAkhir1 > 65) { 
            nilaiHuruf1 = "B"; 
        } else if (nilaiAkhir1 > 60) { 
            nilaiHuruf1 = "C+"; 
        } else if (nilaiAkhir1 > 50) { 
            nilaiHuruf1 = "C"; 
        } else if (nilaiAkhir1 > 39) { 
            nilaiHuruf1 = "D"; 
        } else if(nilaiAkhir1 >= 0){ 
            nilaiHuruf1 = "E"; 
        } else{
            nilaiHuruf1 = "ERROR";
        }

        // proses nilai huruf matkul2
        if (nilaiAkhir2 > 80 && nilaiAkhir2 <= 100) { 
            nilaiHuruf2 = "A"; 
        } else if (nilaiAkhir2 > 73) { 
            nilaiHuruf2 = "B+"; 
        } else if (nilaiAkhir2 > 65) { 
            nilaiHuruf2 = "B"; 
        } else if (nilaiAkhir2 > 60) { 
            nilaiHuruf2 = "C+"; 
        } else if (nilaiAkhir2 > 50) { 
            nilaiHuruf2 = "C"; 
        } else if (nilaiAkhir2 > 39) { 
            nilaiHuruf2 = "D"; 
        } else if(nilaiAkhir2 >= 0 ){ 
            nilaiHuruf2 = "E"; 
        } else{
            nilaiHuruf2 = "ERROR";
        }


        // proses status kelulusan matkul

        // matkul1
        if(nilaiAkhir1 >= 60 && nilaiAkhir1 <= 100){
            statusMatkul1 = "LULUS";
        }else if(nilaiAkhir1 >= 0){
            statusMatkul1 = "TIDAK LULUS";
        }else{
            statusMatkul1 = "ERROR";
        }

        // matkul2
        if(nilaiAkhir2 >= 60 && nilaiAkhir2 <= 100){
            statusMatkul2 = "LULUS";
        }else if(nilaiAkhir2 >= 0){
            statusMatkul2 = "TIDAK LULUS";
        } else{
            statusMatkul2 = "ERROR";
        }


        // proses rata-rata nilai akhir
        rataRataNilaiAkhir = (nilaiAkhir1 + nilaiAkhir2) / 2;

        // proses kelulusan semester
        if(statusMatkul1 == "LULUS" && statusMatkul2 == "LULUS"){
            if(rataRataNilaiAkhir >= 70){
                statusSemester = "LULUS";
            }else{
                statusSemester = "TIDAK LULUS";
            }
        }else{
            statusSemester = "TIDAK LULUS";
        }

        formatUts1 = String.format("%.2f", uts1);
        formatUts2 = String.format("%.2f", uts2);
        formatUas1 = String.format("%.2f", uas1);
        formatUas2 = String.format("%.2f", uas2);
        formatTugas1 = String.format("%.2f", tugas1);
        formatTugas2 = String.format("%.2f", tugas2);
        formatNilaiAkhir1 = String.format("%.2f", nilaiAkhir1);
        formatNilaiAkhir2 = String.format("%.2f", nilaiAkhir2);
        formatRataRataNilaiAkhir = String.format("%.2f", rataRataNilaiAkhir);


        // output hasil penilaian akademik
        System.out.println("\n================== HASIL PENILAIAN AKADEMIK ==================");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);

        System.out.println("\nMata Kuliah\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Algoritma Pemrograman\t" + formatUts1 + "\t" + formatUas1 + "\t" + formatTugas1 + "\t" + formatNilaiAkhir1 + "\t\t" + nilaiHuruf1 + "\t\t" + statusMatkul1);
        System.out.println("Struktur Data\t\t" + formatUts2 + "\t" + formatUas2 + "\t" + formatTugas2 + "\t" + formatNilaiAkhir2 + "\t\t" + nilaiHuruf2 + "\t\t" + statusMatkul2);

        System.out.println("\nRata-rata Nilai Akhir\t: " + formatRataRataNilaiAkhir); 
        System.out.println("Status Semester \t: " + statusSemester);

        input.close();
    }
}   