package 배열1.형성평가04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int n;
        for (n = 0; n < arr.length; n++) {
            arr[n] = sc.nextInt();
            if (arr[n] == -1) break;
        } // end for

        int startIndex = (n - 3 >= 0) ? n - 3 : 0;
        for (int i = startIndex; i < n; i++) {
            System.out.print(arr[i] + " ");
        } // end for
        System.out.println();
        sc.close();
    }
}
