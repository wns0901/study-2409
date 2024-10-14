package 배열1.자가진단01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars = new char[10];

        for (int i = 0; i < 10; i++) {
            chars[i] = sc.next().charAt(0);
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(chars[i]);
        }
    }
}
