import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(list);

        for (int i = 0; i < list.length; i++) {
            int repeat = 0;
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j]) {
                    repeat++;
                }
            }
            if (i == 0) {
                System.out.println(list[i] + " sayısı " + repeat + " kere tekrar edildi.");
            }
            if (i != 0 && list[i] != list[i-1]) {
                System.out.println(list[i] + " sayısı " + repeat + " kere tekrar edildi.");
            }
        }
    }
}
