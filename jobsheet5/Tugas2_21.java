package jobsheet5;

import java.util.Scanner;

public class Tugas2_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;

        System.out.print("Masukkan angka: ");
        angka = input.nextInt();

        if(angka % 2 == 0){
            System.out.println("Merupakan angka genap");
        }else{
            System.out.println("Merupakan angka ganjil");
        }

        input.close();
    }
}
