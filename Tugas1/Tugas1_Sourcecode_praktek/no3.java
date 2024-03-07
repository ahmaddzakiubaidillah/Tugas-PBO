/* Deskripsi : */
    /**Ahmad_Dzaki_Ubaidillah_Nim_13020220092_20_Februari_2024*/
/* Program ini berisi contoh sederhana untuk mendefinisikan */
/* variabel-variabel bilangan bulat (short int, int, long int), */
/* karakter, bilangan riil, */
public class ASIGNi {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // KAMUS
        short ks = 1;
        int ki = 1;
        long kl = 10000;
        char c = 65; /* inisialisasi karakter dengan integer */
        char c1 = 'Z'; /* inisialisasi karakter dengan karakter */
        double x = 50.2f;
        float y = 50.2f;
        // Algoritma
        // penulisan karakter sebagai karakter
        System.out.println("Karakter = " + c);
        System.out.println("Karakter = " + c1);
        // penulisan karakter sebagai integer
        System.out.println("Karakter = " + (int) c);
        System.out.println("Karakter = " + (int) c1);
        System.out.println("Bilangan integer (short) = " + ks);
        System.out.println("\t(int) = " + ki);
        System.out.println("\t(long)= " + kl);
        System.out.println("Bilangan Real x = " + x);
        System.out.println("Bilangan Real y = " + y);
    }
}
