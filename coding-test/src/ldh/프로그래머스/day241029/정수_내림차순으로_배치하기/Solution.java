package ldh.프로그래머스.day241029.정수_내림차순으로_배치하기;

import java.util.*;

public class Solution {
    public long solution(long n) {
        char[] numbers = Long.toString(n).toCharArray();
        Arrays.sort(numbers);
        StringBuilder sortStr = new StringBuilder(new String(numbers)).reverse();
        return Long.parseLong(sortStr.toString());
    }
}

