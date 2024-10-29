package lyn.프로그래머스.코딩테스트.day241029.정수_내림차순으로_배치하기;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr, Comparator.reverseOrder());

        // 정렬된 숫자들 문자열로 붙임
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }

        answer = Long.parseLong(sb.toString());

        return answer;
    }
}
