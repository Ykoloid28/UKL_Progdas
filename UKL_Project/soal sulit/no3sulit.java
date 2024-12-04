import java.util.Scanner;

public class no3sulit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka: ");
        int n = scanner.nextInt();
        int[] angka = new int[n];

        System.out.println("Masukkan angka:");
        for (int i = 0; i < n; i++) {
            angka[i] = scanner.nextInt();
        }

        int[] frekuensi = new int[angka.length];
        boolean[] sudahDihitung = new boolean[angka.length];

        for (int i = 0; i < angka.length; i++) {
            if (!sudahDihitung[i]) {
                int count = 1;
                for (int j = i + 1; j < angka.length; j++) {
                    if (angka[i] == angka[j]) {
                        count++;
                        sudahDihitung[j] = true;
                    }
                }
                frekuensi[i] = count;
            }
        }
        for (int i = 0; i < angka.length; i++) {
            if (!sudahDihitung[i]) {
                System.out.println(angka[i] + " muncul " + frekuensi[i] + " kali");
            }
        }
        scanner.close();

    }
}