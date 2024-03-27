import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Map<String, Integer> nilaiMap = new HashMap<>();
            
            System.out.println("Masukkan data nilai (nama nilai):");
            String key = scanner.nextLine();
            while (!key.equals("selesai")) {
                System.out.print("Masukkan nilai untuk " + key + ": ");
                int nilai = scanner.nextInt();
                scanner.nextLine(); // Membuang karakter newline (\n) dari input sebelumnya
                
                nilaiMap.put(key, nilai);
                
                System.out.println("Data berhasil dimasukkan. Masukkan nama nilai berikutnya atau ketik 'selesai' untuk mengakhiri:");
                key = scanner.nextLine();
            }
            
            System.out.println("\nDaftar nilai:");
            for (Map.Entry<String, Integer> entry : nilaiMap.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
