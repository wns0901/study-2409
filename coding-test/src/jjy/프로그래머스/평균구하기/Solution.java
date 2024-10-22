package jjy.프로그래머스.평균구하기;

import java.util.Arrays;

public class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int sum = Arrays.stream(arr).sum();
        answer = (double) sum / arr.length;
        return answer;
    }
}
