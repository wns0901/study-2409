package 배열1.형성평가05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[6];
        double sum = 0;
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }

        System.out.printf("%.1f", sum / 6);
    }
}
