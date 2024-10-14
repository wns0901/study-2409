package 배열1.형성평가08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int cnt = 0;
        int sum = 0;
        double avg = 0;

        for (int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] == 0) break;

            if (arr[i] % 5 == 0) {
                cnt++;
                sum += arr[i];
            }

        }

        avg = (double) sum / cnt;

        System.out.println("Multiples of 5 : " + cnt);
        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f", avg);
    }
}
