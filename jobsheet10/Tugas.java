package jobsheet10;

import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int responden = 10;
        int pertanyaan = 6;
        int[][] survei = new int[responden][pertanyaan];
        String[] daftarPertanyaan = {
            "Seberapa puas Anda dengan pelayanan CS?",
            "Bagaimana penilaian Anda terhadap kecepatan layanan?",
            "Apakah karyawan bersikap ramah?",
            "Seberapa mudah proses pemesanan?",
            "Apakah Anda puas dengan harga yang diberikan?",
            "Apakah Anda akan merekomendasikan perusahaan ini?"
        };

        System.out.println("=== INPUT DATA SURVEY ===");

        for (int i = 0; i < responden; i++) {
            System.out.println("\nResponden " + (i + 1) + ":");
            for (int j = 0; j < pertanyaan; j++) {
                do {
                    System.out.println("  " + daftarPertanyaan[j]);
                    System.out.print("  Nilai (1-5): ");
                    survei[i][j] = sc.nextInt();
                } while (survei[i][j] < 1 || survei[i][j] > 5);
            }
        }

        System.out.println("\n=== RATA-RATA PER RESPONDEN ===");
        for (int i = 0; i < responden; i++) {
            double total = 0;
            for (int j = 0; j < pertanyaan; j++) {
                total += survei[i][j];
            }
            double rata = total / pertanyaan;
            System.out.printf("Responden %d: %.2f%n", (i + 1), rata);
        }

        System.out.println("\n=== RATA-RATA PER PERTANYAAN ===");
        for (int j = 0; j < pertanyaan; j++) {
            double total = 0;
            for (int i = 0; i < responden; i++) {
                total += survei[i][j];
            }
            double rata = total / responden;
            System.out.printf("Pertanyaan %d (%s): %.2f%n", (j + 1), daftarPertanyaan[j], rata);
        }

        double totalSemua = 0;
        for (int i = 0; i < responden; i++) {
            for (int j = 0; j < pertanyaan; j++) {
                totalSemua += survei[i][j];
            }
        }

        double rataKeseluruhan = totalSemua / (responden * pertanyaan);

        System.out.println("\n=== RATA-RATA KESELURUHAN ===");
        System.out.printf("Rata-rata keseluruhan: %.2f%n", rataKeseluruhan);

        sc.close();
    }
}
