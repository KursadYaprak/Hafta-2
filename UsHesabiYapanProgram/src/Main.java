import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Taban sayısını giriniz : ");
        int taban = inp.nextInt();
        System.out.print("Üst olacak sayıyı giriniz : ");
        int üst = inp.nextInt();

        System.out.println(power(taban, üst));
    }

    public static int power(int taban, int üst) {
        if (taban == 1 || üst == 0) {
            return 1;
        }
        int result = taban * power(taban, üst - 1);
        return result;
    }
}
