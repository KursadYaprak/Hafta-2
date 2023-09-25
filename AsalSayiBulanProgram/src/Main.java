import java.util.Scanner;

public class Main {

    static int i = 2;

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int number = inp.nextInt();
        if (number < 2)
            System.out.println("En küçük asal sayı 2'dir. Başka bir sayı giriniz.");
        else if (isPrime(number))
            System.out.println(number + " sayısı ASALDIR !");
        else
            System.out.println(number + " sayısı ASAL değildir !");

    }

    public static boolean isPrime(int number) {

        if (i == (number / 2) + 1)
            return true;
        if (number % i == 0)
            return false;
        i++;
        return isPrime(number);
    }
}
