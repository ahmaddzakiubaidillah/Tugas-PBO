package pertemuan2.modul3.nilai;

import java.util.Scanner;

public class TestNilai {
    public static void main(String[] args) {
        HitungRata hitung = new HitungRata();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Input Nilai");
            System.out.println("2. Input Nilai Baru");
            System.out.println("0. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Jumlah Data : ");
                    int banyakData = input.nextInt();
                    int nilai[] = new int[banyakData];
                    System.out.print("Masukkan Nilai : ");
                    hitung.inputNilai(nilai);
                    System.out.print("Daftar Nilai : ");
                    hitung.cetakNilai(nilai);
                    System.out.println("Rata Nilai : " + hitung.rataNilai(banyakData));
                    break;
                case 2:
                    System.out.print("Masukkan Nilai Baru: ");
                    hitung.inputNilaiBaru();
                    System.out.print("Daftar Nilai Baru : ");
                    hitung.cetakNilaiBaru();
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Opsi tidak valid. Silakan pilih opsi yang benar.");
                    break;
            }
        } while (pilihan != 0);
        input.close();
    }
}
