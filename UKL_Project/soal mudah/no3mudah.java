import java.util.Scanner;

public class no3mudah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = input.nextInt(); i >= 1; i--) {
            if (i % 3 == 0) {
                System.out.println(i + ". saya angkatan 33");
            } else if (i % 2 == 0) {
                System.out.println(i + ". saya anak moklet");
            } else {
                System.out.println(i + ". saya anak wikusama");
            }
        }
        System.out.println("1. saya senang");
    }
}
