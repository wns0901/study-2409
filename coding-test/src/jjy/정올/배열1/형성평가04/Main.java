package jjy.정올.배열1.형성평가04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int cnt = 0;
        for (int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == -1) break;
            cnt = i;
        }

        if (cnt > 3) {
            for (int i = cnt - 2; i <= cnt; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            for (int i = 0; i <= cnt; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
