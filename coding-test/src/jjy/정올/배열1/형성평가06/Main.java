package 배열1.형성평가06;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Character[] arr = {'J', 'U', 'N', 'G', 'O', 'L'};

        Character input = sc.next().charAt(0);

        int result = Arrays.asList(arr).indexOf(input);

        System.out.println(result == -1 ? "none" : result);
    }
}
