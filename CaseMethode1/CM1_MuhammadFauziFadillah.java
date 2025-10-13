package CaseMethode1;

import java.util.Scanner;

public class CM1_MuhammadFauziFadillah {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama, nim;
        int uts1, uts2, uas1, uas2, tugas1, tugas2;
        double nilaiAkhir1, nilaiAkhir2, rataRataNilaiAkhir;
        String nilaiHuruf1, nilaiHuruf2, statusMatkul1, statusMatkul2, statusSemester;

        //INputan
        System.out.println("==== INPUT DATA MAHASISWA ====");
        System.out.print("Nama : ");
        nama = input.nextLine();

        System.out.print("NIM  : ");
        nim = input.nextLine();

        System.out.println("\n--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS\t: ");
        uts1 = input.nextInt();

        System.out.print("Nilai UAS\t: ");
        uas1 = input.nextInt();

        System.out.print("Nilai Tugas\t: ");
        tugas1 = input.nextInt();

        System.out.println("\n--- Mata Kuliah 2: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS\t: ");
        uts2 = input.nextInt();

        System.out.print("Nilai UAS\t: ");
        uas2 = input.nextInt();

        System.out.print("Nilai Tugas\t: ");
        tugas2 = input.nextInt();
        
        // proses nilai akhir kedua matkul
        nilaiAkhir1 = (uts1 * 0.3) + (uas1 * 0.4) + (tugas1 * 0.3);
        nilaiAkhir2 = (uts2 * 0.3) + (uas2 * 0.4) + (tugas2 * 0.3);

        // proses nilai huruf matkul1
        if (nilaiAkhir1 >= 80 && nilaiAkhir1 <= 100) { 
            nilaiHuruf1 = "A"; 
        } else if (nilaiAkhir1 >= 73) { 
            nilaiHuruf1 = "B+"; 
        } else if (nilaiAkhir1 >= 65) { 
            nilaiHuruf1 = "B"; 
        } else if (nilaiAkhir1 >= 60) { 
            nilaiHuruf1 = "C+"; 
        } else if (nilaiAkhir1 >= 50) { 
            nilaiHuruf1 = "C"; 
        } else if (nilaiAkhir1 >= 40) { 
            nilaiHuruf1 = "D"; 
        } else { 
            nilaiHuruf1 = "E"; 
        }

        // proses nilai huruf matkul2
        if (nilaiAkhir2 >= 80 && nilaiAkhir2 <= 100) { 
            nilaiHuruf2 = "A"; 
        } else if (nilaiAkhir2 >= 73) { 
            nilaiHuruf2 = "B+"; 
        } else if (nilaiAkhir2 >= 65) { 
            nilaiHuruf2 = "B"; 
        } else if (nilaiAkhir2 >= 60) { 
            nilaiHuruf2 = "C+"; 
        } else if (nilaiAkhir2 >= 50) { 
            nilaiHuruf2 = "C"; 
        } else if (nilaiAkhir2 >= 40) { 
            nilaiHuruf2 = "D"; 
        } else { 
            nilaiHuruf2 = "E"; 
        }


        // proses status kelulusan matkul

        // matkul1
        if(nilaiAkhir1 >= 60){
            statusMatkul1 = "LULUS";
        }else{
            statusMatkul1 = "TIDAK LULUS";
        }

        // matkul2
        if(nilaiAkhir2 >= 60){
            statusMatkul2 = "LULUS";
        }else{
            statusMatkul2 = "TIDAK LULUS";
        }


        // proses rata-rata nilai akhir
        rataRataNilaiAkhir = (nilaiAkhir1 + nilaiAkhir2) / 2;

        // proses kelulusan semester
        if(statusMatkul1 == "LULUS" && statusMatkul2 == "LULUS"){
            if(nilaiAkhir1 >= 70 && nilaiAkhir2 >= 70){
                statusSemester = "LULUS";
            }else{
                statusSemester = "TIDAK LULUS (Rata-rata < 70)";
            }
        }else{
            statusSemester = "TIDAK LULUS";
        }


        // output hasil penilaian akademik
        System.out.println("\n================== HASIL PENILAIAN AKADEMIK ==================");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);

        System.out.println("\nMata Kuliah\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Algoritma Pemrograman\t" + uts1 + "\t" + uas1 + "\t" + tugas1 + "\t" + nilaiAkhir1 + "\t\t" + nilaiHuruf1 + "\t\t" + statusMatkul1);
        System.out.println("Struktur Data\t\t" + uts2 + "\t" + uas2 + "\t" + tugas2 + "\t" + nilaiAkhir2 + "\t\t" + nilaiHuruf2 + "\t\t" + statusMatkul2);

        System.out.println("\nRata-rata Nilai Akhir\t: " + rataRataNilaiAkhir); 
        System.out.println("Status Semester \t: " + statusSemester);

        input.close();
    }
}   