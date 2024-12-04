import java.util.Scanner;

public class no1sedang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat positif: ");
        int bilangan = scanner.nextInt();

        int faktorial = 1;
        System.out.print(bilangan + " = ");
        for (int i = bilangan; i >= 1; i--) {
            System.out.print(i);
            if (i > 1) {
                System.out.print(" x ");
            }
            faktorial *= i;
        }
        System.out.println(" = " + faktorial);
        scanner.close();

    }
}