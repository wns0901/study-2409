package jjy.프로그래머스.day241031.콜라츠_추측;

public class Solution {
    public int solution(int num) {
        return collatz(num, 1);
    }

    public static int collatz(long n, int i) {
        if (n == 1) return 0;
        n = n % 2 == 0 ? n / 2 : n * 3 + 1;
        System.out.println(i + " : " +n);
        return n == 1 ? i : i == 500 ? -1 : collatz(n, ++i);
    }
}
