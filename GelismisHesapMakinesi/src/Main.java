import java.util.Scanner;

public class Main {

    static int plus(int a, int b) {
        int result = a + b;
        System.out.println("Toplam : " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma : " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Çarpma : " + result);
        return result;
    }

    static int divided(int a, int b) {
        if (b == 0) {
            System.out.println("Bir sayı sıfıra bölünemez !");
            return 0;
        }
        else {
            int result = a / b;
            System.out.println("Bölme : " + result);
            return result;
        }
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Üs Hesabı : " + result);
        return result;
    }

    static int factoriel() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Faktöriyeli Alınacak Sayı : ");
        int fakt = inp.nextInt();
        int result = 1;
        for (int i = 1; i <= fakt; i++) {
            result *= i;
        }
        System.out.println("Sayının Faktöriyeli : " + result);
        return result;
    }

    static int mod(int a, int b) {
        int result = a % b;
        System.out.println("Mod İşlemi : " + result);
        return result;
    }

    static void rectangle(int a, int b) {
        System.out.println("Çevresi : " + (2 * (a + b)));
        System.out.println("Alan : " + (a * b));
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int select;

        String menu = "1 - Toplama İşlemi\n2 - Çıkarma İşlemi\n3 - Çarpma İşlemi\n4 - Bölme İşlemi\n5 - Üslü Sayı Hesaplama\n6 - Faktoriyel Hesaplama\n7 - Mod Alma\n8 - Dikdörtgen Alan ve Çevre Hesabı\n0 - Çıkış Yap\n";

        while (true) {
            System.out.print(menu);
            System.out.print("Bir işlem seçiniz : ");
            select = inp.nextInt();

            if (select == 0) {
                System.out.println("Program Sonlandı.");
                break;
            }
            else if (select < 0 || select > 8) {
                System.out.println("Yanlış İşlem Seçimi. Yeniden Deneyiniz.");
            }
            else if (select == 6) {
                factoriel();
            }
            else {
                System.out.print("İlk Sayı : ");
                int a = inp.nextInt();
                System.out.print("İkinci Sayı : ");
                int b = inp.nextInt();


                switch (select) {
                    case 1:
                        plus(a, b);
                        break;
                    case 2:
                        minus(a, b);
                        break;
                    case 3:
                        times(a, b);
                        break;
                    case 4:
                        divided(a, b);
                        break;
                    case 5:
                        power(a, b);
                        break;
                    case 7:
                        mod(a, b);
                        break;
                    case 8:
                        rectangle(a, b);
                        break;
                }
            }
        }
    }
}