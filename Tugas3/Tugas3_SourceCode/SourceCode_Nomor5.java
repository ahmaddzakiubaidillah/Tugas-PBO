// Ahmad_Dzaki_Ubaidillah_Nim_13020220092_8_Maret_2024

import java.util.Scanner;

public class If3 {

    /**
    * @param args
    */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */
        int a;
        Scanner masukan = new Scanner(System.in);

        /* Program */
        System.out.print("Contoh IF tiga kasus \n");
        System.out.print("Ketikkan suatu nilai integer :");
        a = masukan.nextInt();

        if (a > 0) {
            System.out.println("Nilai a positif " + a);
        } else if (a == 0) {
            System.out.println("Nilai Nol " + a);
        } else {
            System.out.println("Nilai a negatif " + a);
        }
    }
}
