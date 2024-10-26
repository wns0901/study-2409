package jjy.프로그래머스.day241029.나누어_떨어지는_숫자_배열;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(x -> x % divisor == 0).sorted().toArray();
        return answer.length != 0 ? answer : new int[] {-1};
    }
}
