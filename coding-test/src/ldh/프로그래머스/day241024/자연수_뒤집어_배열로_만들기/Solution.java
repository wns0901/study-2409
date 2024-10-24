package ldh.프로그래머스.day241024.자연수_뒤집어_배열로_만들기;

import java.util.Arrays;

class Solution{
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int[] result = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(str.length() - 1 - i) - '0';
        }

        return result;
    }
}

