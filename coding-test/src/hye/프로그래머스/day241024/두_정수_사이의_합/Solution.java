package hye.프로그래머스.day241024.두_정수_사이의_합;

public class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int max = a > b ? a : b;
        int min = a < b ? a : b;
        for(int i = min; i <= max; i++) {
            answer += i;
        }
        return answer;
    }
}
