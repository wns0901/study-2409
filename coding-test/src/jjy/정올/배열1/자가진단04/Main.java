package 배열1.자가진단04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            cnt++;
            if (arr[i] == 0) break;
        }

        sc.close();

        for (int i = cnt - 2; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
