package 배열1.자가진단05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] avg = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();
        double result = avg[n1 - 1] + avg[n2 - 1];
        System.out.printf("%.1f", result);
    }
}
