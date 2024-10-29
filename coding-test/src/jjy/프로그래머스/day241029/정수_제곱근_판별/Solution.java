package jjy.프로그래머스.day241029.정수_제곱근_판별;

public class Solution {
    public long solution(long n) {
        return Math.sqrt(n) % 1 == 0 ? (long) Math.pow(Math.sqrt(n) + 1, 2) : -1L;
    }
}
