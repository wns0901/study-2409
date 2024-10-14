package 배열1.자가진단08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        int sum2 = 0;
        double avg = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if ((i + 1) % 2 == 0) {
                sum += arr[i];
            } else {
                sum2 += arr[i];
            }
        }

        avg = sum2 / 5.;

        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f", avg);
    }
}
