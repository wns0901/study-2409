package 배열1.형성평가03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if ((i + 1) % 2 == 0) {
                even += arr[i];
            } else {
                odd += arr[i];
            }
        }

        System.out.println("odd : " + odd);
        System.out.println("even : " + even);
    }
}
