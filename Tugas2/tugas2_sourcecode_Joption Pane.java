import java.util.Scanner;
public class DataMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Memasukkan data NIM
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        // Memasukkan data nama
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        // Memasukkan data fakultas
        System.out.print("Masukkan Fakultas: ");
        String fakultas = scanner.nextLine();

        // Menampilkan data yang dimasukkan
        String outputMessage = "Data Mahasiswa:\nNIM: " + nim + "\nNama: " + nama +
 "\nFakultas: " + fakultas;
        System.out.println(outputMessage);

        // Menutup objek Scanner
        scanner.close();
    }
}
