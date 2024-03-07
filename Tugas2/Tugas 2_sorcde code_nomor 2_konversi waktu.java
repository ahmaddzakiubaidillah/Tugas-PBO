import java.util.Scanner;

public class KonversiWaktu {
    private int totalDetik;

    public KonversiWaktu() {
        // Constructor
    }

    public void setTotalDetik(int detik) {
        totalDetik = detik;
    }

    public int hitungDetikSekarang() {
        int detikSekarang = totalDetik % 60;
        System.out.println("2. Hitung detikSekarang = " + detikSekarang);
        return detikSekarang;
    }

    public int hitungTotalMenit() {
        int totalMenit = totalDetik / 60;
        System.out.println("3. Hitung totalMenit = " + totalMenit);
        return totalMenit;
    }

    public int hitungMenitSekarang() {
        int menitSekarang = hitungTotalMenit() % 60;
        System.out.println("4. Hitung menitSekarang = " + menitSekarang);
        return menitSekarang;
    }

    public int hitungTotalJam() {
        int totalJam = hitungTotalMenit() / 60;
        System.out.println("5. Hitung totalJam = " + totalJam);
        return totalJam;
    }

    public int hitungJamSekarang() {
        int jamSekarang = hitungTotalJam() % 24;
        System.out.println("6. Hitung jamSekarang = " + jamSekarang);
        return jamSekarang;
    }

    public void tampilWaktu() {
        System.out.println("7. Tampil waktu (Jam:Menit:Detik)");
        System.out.println("Waktu sekarang: " + hitungJamSekarang() + ":" + hitungMenitSekarang() + ":" + hitungDetikSekarang());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan total detik: ");
        int totalDetik = scanner.nextInt();

        KonversiWaktu waktu = new KonversiWaktu();
        waktu.setTotalDetik(totalDetik);
        waktu.tampilWaktu();

        scanner.close();
    }
}