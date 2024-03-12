// Ahmad_Dzaki_Ubaidillah_Nim_13020220092_8_Maret_2024
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BacaString {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // Kamus
        String str;
        int num;

        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        // Program
        System.out.println("\nBaca string dan Integer: ");
        
        // Read a string
        System.out.print("Masukkan sebuah string: ");
        str = dataIn.readLine();
        System.out.println("String yang dibaca: " + str);

        // Read an integer
        System.out.print("Masukkan sebuah integer: ");
        try {
            num = Integer.parseInt(dataIn.readLine());
            System.out.println("Integer yang dibaca: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Input bukan integer.");
        }
    }
}
