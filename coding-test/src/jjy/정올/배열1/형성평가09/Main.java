package 배열1.형성평가09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int cnt = 0;
        int print = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) break;

            cnt++;
        }

        System.out.println(cnt);
        for (int i = 0; i < cnt; i++) {
            print = arr[i] % 2 == 0 ? arr[i] / 2 : arr[i] * 2;
            System.out.print(print + " ");
        }
    }
}
