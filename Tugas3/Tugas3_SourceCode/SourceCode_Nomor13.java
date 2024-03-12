// Ahmad_Dzaki_Ubaidillah_Nim_13020220092_8_Maret_2024
import java.util.Scanner;
/* Baca N, Print i = 1 s/d N dengan WHILE */
public class PrintWhile {
    public static void main(String[] args) {
        /* Kamus : */
        int N;
        int i;
        Scanner masukan = new Scanner(System.in);
        /* Program */
        System.out.print("Nilai N >0 = "); /* Inisialisasi */
        N = masukan.nextInt();
        i = 1; /* First Elmt */

        System.out.print("Print i dengan WHILE: \n");
        while (i <= N) /* Kondisi pengulangan */   {
            System.out.println(i); /* Proses */
            i++; /* Next Elmt */
        }
    }
}
