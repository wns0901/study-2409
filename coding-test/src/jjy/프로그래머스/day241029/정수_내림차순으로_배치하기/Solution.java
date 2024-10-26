package jjy.프로그래머스.day241029.정수_내림차순으로_배치하기;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public long solution(long n) {
        String[] arr = Long.toString(n).split("");
        Arrays.sort(arr, Comparator.reverseOrder());

        return Long.parseLong(String.join("", arr));
    }
}
