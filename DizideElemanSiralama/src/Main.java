import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int i = 1, eleman, num = 0;

        System.out.print("Dizinin boyutu n : ");
        int n = inp.nextInt();

        int[] numbers = new int[n];

        System.out.println("Dizinin elemanlarını giriniz :");

        while (i <= n) {
                System.out.print(i + ". Elemanı : ");
                eleman = inp.nextInt();
                i++;
                numbers[num] = eleman;
                num++;
        }
        System.out.print("Sıralama : ");
        System.out.println(Arrays.toString(numbers));
    }
}
