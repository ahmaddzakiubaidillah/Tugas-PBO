import java.util.Scanner;
   public class DataMahasiswa {
      public static void main(String[] args) {
        // Membuat objek Scanner untuk input
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
        System.out.println("\nData Mahasiswa:");
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Fakultas: " + fakultas);

        // Menutup objek Scanner
        scanner.close();
    }
}
