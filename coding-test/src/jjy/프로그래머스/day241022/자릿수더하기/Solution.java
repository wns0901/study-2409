package jjy.프로그래머스.day241022.자릿수더하기;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);

        for (int i = 0; i < str.length(); i++) {
            answer += Character.getNumericValue(str.charAt(i));
        }

        return answer;
    }
}
