import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataMahasiswa {
    public static void main(String[] args) {
        // Membuat objek BufferedReader untuk input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Memasukkan data NIM
         System.out.print("Masukkan NIM: ");
            String nim = reader.readLine();

            // Memasukkan data nama
            System.out.print("Masukkan Nama: ");
            String nama = reader.readLine();

            // Memasukkan data fakultas
            System.out.print("Masukkan Fakultas: ");
            String fakultas = reader.readLine();

            // Menampilkan data yang dimasukkan
            System.out.println("\nData Mahasiswa:");
            System.out.println("NIM: " + nim);
            System.out.println("Nama: " + nama);
            System.out.println("Fakultas: " + fakultas);

            // Menutup objek BufferedReader
            reader.close();
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan pada input/output.");
            e.printStackTrace();
        }
    }
}
