package 배열1.자가진단07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int min = 10000;

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            if (n < 100) {
                max = Math.max(max, n);
            } else {
                min = Math.min(min, n);
            }
        }
        max = max == 0 ? 100 : max;
        min = min == 10000 ? 100 : min;
        System.out.print(max + " " + min);
    }
}
