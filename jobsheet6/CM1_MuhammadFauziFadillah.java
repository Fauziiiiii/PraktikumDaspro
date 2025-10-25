package jobsheet6;

import java.util.Scanner;

public class CM1_MuhammadFauziFadillah {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama, nim, matkul1 = "Algoritma dan Pemrograman", matkul2 = "Struktur Data", matkul3 = "Matematika", matkulTertinggi;
        double uts1, uts2, uts3, uas1, uas2, uas3, tugas1, tugas2, kuis3, nilaiAkhir1, nilaiAkhir2, nilaiAkhir3, nilaiTertinggi, rataRataNilaiAkhir;
        String nilaiHuruf1, nilaiHuruf2, nilaiHuruf3, statusMatkul1, statusMatkul2, statusMatkul3, statusSemester,
        formatUts1, formatUts2, formatUts3, formatUas1, formatUas2, formatUas3, formatTugas1, formatTugas2, formatKuis3, formatNilaiAkhir1, formatNilaiAkhir2, formatNilaiAkhir3, formatRataRataNilaiAkhir;

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

        System.out.println("\n--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS\t: ");
        uts2 = input.nextDouble();

        System.out.print("Nilai UAS\t: ");
        uas2 = input.nextDouble();

        System.out.print("Nilai Tugas\t: ");
        tugas2 = input.nextDouble();

        System.out.println("\n--- Mata Kuliah 3: Matematika ---");
        System.out.print("Nilai Kuis\t: ");
        kuis3 = input.nextDouble();

        System.out.print("Nilai UTS\t: ");
        uts3 = input.nextDouble();

        System.out.print("Nilai UAS\t: ");
        uas3 = input.nextDouble();

        
        // proses nilai akhir ketiga matkul
        nilaiAkhir1 = (uts1 * 0.3) + (uas1 * 0.4) + (tugas1 * 0.3);
        nilaiAkhir2 = (uts2 * 0.3) + (uas2 * 0.4) + (tugas2 * 0.3);
        nilaiAkhir3 = ( kuis3 + uts3 + uas3 ) / 3;

        // proses nilai huruf matkul1
        if (nilaiAkhir1 > 80 && nilaiAkhir1 <= 100) { 
            nilaiHuruf1 = "A"; 
        } else if (nilaiAkhir1 > 73 && nilaiAkhir1 <= 80) { 
            nilaiHuruf1 = "B+"; 
        } else if (nilaiAkhir1 > 65 && nilaiAkhir1 <= 73) { 
            nilaiHuruf1 = "B"; 
        } else if (nilaiAkhir1 > 60 && nilaiAkhir1 <= 65) { 
            nilaiHuruf1 = "C+"; 
        } else if (nilaiAkhir1 > 50 && nilaiAkhir1 <= 60) { 
            nilaiHuruf1 = "C"; 
        } else if (nilaiAkhir1 > 39 && nilaiAkhir1 <= 50) { 
            nilaiHuruf1 = "D"; 
        } else if(nilaiAkhir1 >= 0 && nilaiAkhir1 <= 39){ 
            nilaiHuruf1 = "E"; 
        } else{
            nilaiHuruf1 = "ERROR";
        }

        // proses nilai huruf matkul2
        if (nilaiAkhir2 > 80 && nilaiAkhir2 <= 100) { 
            nilaiHuruf2 = "A"; 
        } else if (nilaiAkhir2 > 73 && nilaiAkhir2 <= 80) { 
            nilaiHuruf2 = "B+"; 
        } else if (nilaiAkhir2 > 65 && nilaiAkhir2 <= 73) { 
            nilaiHuruf2 = "B"; 
        } else if (nilaiAkhir2 > 60 && nilaiAkhir2 <= 65) { 
            nilaiHuruf2 = "C+"; 
        } else if (nilaiAkhir2 > 50 && nilaiAkhir2 <= 60) { 
            nilaiHuruf2 = "C"; 
        } else if (nilaiAkhir2 > 39 && nilaiAkhir2 <= 50) { 
            nilaiHuruf2 = "D"; 
        } else if(nilaiAkhir2 >= 0 && nilaiAkhir2 <= 39){ 
            nilaiHuruf2 = "E"; 
        } else{
            nilaiHuruf2 = "ERROR";
        }

        // proses nilai huruf matkul3
        if (nilaiAkhir3 > 80 && nilaiAkhir3 <= 100) { 
            nilaiHuruf3 = "A"; 
        } else if (nilaiAkhir3 > 73 && nilaiAkhir3 <= 80) { 
            nilaiHuruf3 = "B+"; 
        } else if (nilaiAkhir3 > 65 && nilaiAkhir3 <= 73) { 
            nilaiHuruf3 = "B"; 
        } else if (nilaiAkhir3 > 60 && nilaiAkhir3 <= 65) { 
            nilaiHuruf3 = "C+"; 
        } else if (nilaiAkhir3 > 50 && nilaiAkhir3 <= 60) { 
            nilaiHuruf3 = "C"; 
        } else if (nilaiAkhir3 > 39 && nilaiAkhir3 <= 50) { 
            nilaiHuruf3 = "D"; 
        } else if(nilaiAkhir3 >= 0 && nilaiAkhir3 <= 39){ 
            nilaiHuruf3 = "E"; 
        } else{
            nilaiHuruf3 = "ERROR";
        }


        // proses status kelulusan matkul

        // matkul1
        if(nilaiAkhir1 >= 60 && nilaiAkhir1 <= 100){
            statusMatkul1 = "LULUS";
        }else if(nilaiAkhir1 >= 0 && nilaiAkhir1 < 60){
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

        // matkul3
        if(nilaiAkhir3 >= 60 && nilaiAkhir3 <= 100){
            statusMatkul3 = "LULUS";
        }else if(nilaiAkhir3 >= 0){
            statusMatkul3 = "TIDAK LULUS";
        } else{
            statusMatkul3 = "ERROR";
        }

        if(nilaiAkhir1 > nilaiAkhir2 && nilaiAkhir1 > nilaiAkhir3){
            nilaiTertinggi = nilaiAkhir1;
            matkulTertinggi = matkul1;
        }else{
            nilaiTertinggi = nilaiAkhir2;
            matkulTertinggi = matkul2;
        }

        if(nilaiAkhir2 > nilaiAkhir3 && nilaiAkhir2 > nilaiAkhir1){
            nilaiTertinggi = nilaiAkhir2;
            matkulTertinggi = matkul2;
        }else{
            nilaiTertinggi = nilaiAkhir3;
            matkulTertinggi = matkul3;
        }
        
        if(nilaiAkhir3 > nilaiAkhir1 && nilaiAkhir3 > nilaiAkhir2){
            nilaiTertinggi = nilaiAkhir3;
            matkulTertinggi = matkul1;
        }else{
            nilaiTertinggi = nilaiAkhir3;
            matkulTertinggi = matkul3;
        }

        // proses rata-rata nilai akhir
        rataRataNilaiAkhir = (nilaiAkhir1 + nilaiAkhir2 + nilaiAkhir3) / 3;

        // proses kelulusan semester
        if(statusMatkul1 == "LULUS" && statusMatkul2 == "LULUS" && statusMatkul3 == "LULUS"){
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
        formatUts3 = String.format("%.2f", uts3);
        formatUas1 = String.format("%.2f", uas1);
        formatUas2 = String.format("%.2f", uas2);
        formatUas3 = String.format("%.2f", uas3);
        formatTugas1 = String.format("%.2f", tugas1);
        formatTugas2 = String.format("%.2f", tugas2);
        formatKuis3 = String.format("%.2f", kuis3);
        formatNilaiAkhir1 = String.format("%.2f", nilaiAkhir1);
        formatNilaiAkhir2 = String.format("%.2f", nilaiAkhir2);
        formatNilaiAkhir3 = String.format("%.2f", nilaiAkhir3);
        formatRataRataNilaiAkhir = String.format("%.2f", rataRataNilaiAkhir);


        // output hasil penilaian akademik
        System.out.println("\n================== HASIL PENILAIAN AKADEMIK ==================");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);

        System.out.println("\nMata Kuliah\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Algoritma Pemrograman\t" + formatUts1 + "\t" + formatUas1 + "\t" + formatTugas1 + "\t" + formatNilaiAkhir1 + "\t\t" + nilaiHuruf1 + "\t\t" + statusMatkul1);
        System.out.println("Struktur Data\t\t" + formatUts2 + "\t" + formatUas2 + "\t" + formatTugas2 + "\t" + formatNilaiAkhir2 + "\t\t" + nilaiHuruf2 + "\t\t" + statusMatkul2);

        System.out.println("\nMata Kuliah\t\tKuis\tUTS\tUAS\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Matematika\t\t" + formatKuis3 + "\t" + formatUts3 + "\t" + formatUas3 + "\t" + formatNilaiAkhir3 + "\t\t" + nilaiHuruf3 + "\t\t" + statusMatkul3);

        System.out.println("\nNilai tertinggi\t: " + nilaiTertinggi + " (" + matkulTertinggi + ")");
        System.out.println("\nRata-rata Nilai Akhir\t: " + formatRataRataNilaiAkhir); 
        System.out.println("Status Semester \t: " + statusSemester);

        input.close();
    }
}   