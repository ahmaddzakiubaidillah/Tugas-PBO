// Ahmad_Dzaki_Ubaidillah_Nim_13020220092_8_Maret_2024
import java.util.Scanner;
public class PrintRepeat {
    public static void main(String[] args) {
        /* Kamus : */
        int N;
        int i;
        Scanner masukan = new Scanner(System.in);
        /* Program */
        System.out.print("Nilai N >0 = ");
        /* Inisialisasi */
        N = masukan.nextInt();

        i = 1;
        /* First Elmt */
        System.out.print("Print i dengan REPEAT: \n");

        do {
            System.out.print(i + "\n"); /* Proses */
            i++; /* Next Elmt */
        } while (i <= N); /* Kondisi pengulangan */
    }
}
