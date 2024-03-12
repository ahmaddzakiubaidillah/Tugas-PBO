// Ahmad_Dzaki_Ubaidillah_Nim_13020220092_8_Maret_2024

import java.util.Scanner;

/* Baca N, Print 1 s/d N dengan FOR */
public class PriFor {

    public static void main(String[] args) {
        /* Kamus */
        int i, N;
        Scanner masukan = new Scanner(System.in);

        /* Program */
        System.out.print("Baca N, print 1 s/d N ");
        System.out.print("N = ");
        N = masukan.nextInt();

        for (i = 1; i <= N; i++) {
            System.out.println(i);
        }

        System.out.println("Akhir program \n");
    }
}
