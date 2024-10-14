package 배열1.형성평가02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            if ((i + 1) % 2 == 1) {
                sum += arr[i];
            }
        }

        System.out.println(sum);
    }
}
