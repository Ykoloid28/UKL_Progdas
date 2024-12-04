import java.util.Random;
import java.util.Scanner;

public class no3sedang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {

            int bilangan1 = random.nextInt(10) + 1;
            int bilangan2 = random.nextInt(10) + 1;
            char operator = random();

            System.out.print(bilangan1 + " " + operator + " " + bilangan2 + " = ");

            int jawabanuser = scanner.nextInt();

            int jawaban = menghitungjawaban(bilangan1, bilangan2, operator);

            if (jawabanuser == jawaban) {
                System.out.println("BENAR!!!!");
            } else {
                System.out.println("SALAH. Jawaban Yang benar adalah: " + jawaban);
            }

            System.out.print("Mau Lanjut? (ya/tidak): ");
            String continueQuiz = scanner.next().toLowerCase();
            if (!continueQuiz.equals("ya")) {
                break;
            }
        }

        System.out.println("Terimakasih Telah Bermain!");
        scanner.close();
    }

    private static char random() {
        char[] operators = { '*', '/', '+', '-', '%' };
        return operators[new Random().nextInt(operators.length)];
    }

    private static int menghitungjawaban(int no1, int no2, char operator) {
        Random random = new Random();
        switch (operator) {
            case '*':
                return no1 * no2;
            case '/':
                while (no2 == 0) {
                    no2 = random.nextInt(10) + 1;
                }
                return no1 / no2;
            case '+':
                return no1 + no2;
            case '-':
                return no1 - no2;
            case '%':
                return no1 - no2;
            default:
                return 0;
        }
    }
}