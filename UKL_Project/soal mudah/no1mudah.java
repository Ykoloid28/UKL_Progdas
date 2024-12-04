import java.util.Scanner;

public class no1mudah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jarakminimum = 10;
        int harga1 = 4250;
        int harga2 = 6000;
        int harga3 = 50000;
        int volumeminimal = 100;

        System.out.print("Masukkan Berat Paket (kg): ");
        int berat = input.nextInt();
        System.out.print("Masukkan Jarak Tempuh (km): ");
        int jarakTempuh = input.nextInt();
        System.out.print("Masukkan Tinggi Barang (cm): ");
        int t = input.nextInt();
        System.out.print("Masukkan Lebar Barang (cm): ");
        int l = input.nextInt();
        System.out.print("Masukkan Panjang Barang (cm): ");
        int p = input.nextInt();

        int hasilvolume = p * l * t;// Hasil

        if (jarakTempuh <= jarakminimum) {
            int hasil1 = harga1 * berat; // 4250*10=42500
            if (hasilvolume > volumeminimal) {
                int hasilakhir = hasil1 + harga3;
                System.out.println("Biaya Yang Harus Dibayar Rp " + hasilakhir);
            } else {
                System.out.println("Biaya Yang Harus Dibayar Rp");
            }
        } else if (jarakTempuh > jarakminimum) {
            int hasil2 = harga2 * berat;
            if (hasilvolume > volumeminimal) {
                int hasilakhir = harga2 + berat;
                System.out.println("Biaya Yang Harus Dibayar Rp " + hasilakhir);
            } else {
                System.out.println("Biaya Yang Harus Dibayar Rp" + hasil2);
            }

            input.close();
        }
    }
}