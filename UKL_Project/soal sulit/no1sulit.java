import java.util.Scanner;

public class no1sulit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();
        double nilai[] = new double[jumlahSiswa];
        double totalNilai = 0;

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan nilai untuk siswa ke-" + i + ": ");
            nilai[i] = scanner.nextDouble();
            totalNilai += nilai[i];
        }
        for (int i = 0; i < jumlahSiswa; i++)
            System.out.println(nilai[i]);
        {
            ;

            System.out.println("Total Nilai: " + totalNilai);

            double rataRata = totalNilai / jumlahSiswa;
            System.out.println("Nilai rata-rata dari seluruh siswa adalah: " + rataRata);

            scanner.close();
        }
    }
}