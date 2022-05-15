// Mengambil input dengan class Scanner
/* Scanner merupakan class yang menyediakan
fungsi-fungsi untuk mengambil input dari keyboard. */

import java.util.Scanner;

public class Konversi_MataUang {
    public static void main(String[] args) throws Exception {
        // Membuat Scanner baru untuk fungsi input
        Scanner inputan = new Scanner(System.in);

        // Menginiliasisai Variabel dengan dua tipe data
        // Tipe data RP(long) untuk inputan
        // Tipe data Dolar, Euro(double) untuk proses hitung mata Uang Dolar dan Euro
        long RP;
        double Dolar, Euro;
        System.out.print("Masukan Nilai Tukar Rupiah Ke Dolar US: ");
        RP = inputan.nextInt();
        Dolar = RP * 0.000070;
        System.out.print("Masukan Nilai Tukar Rupiah Ke Euro: ");
        RP = inputan.nextInt();
        Euro = RP * 0.000064;
        System.out.println();
        System.out.println("Hasil Nilai Tukar Rupiah ke Dolar US Adalah = " + Dolar + " USD");
        System.out.println();
        System.out.println("Hasil Nilai Tukar Rupiah ke Euro Adalah = " + Euro + " EUR");
        System.out.println();
    }
}
