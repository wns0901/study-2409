package ldh.프로그래머스.day241024.두_정수_사이의_합;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;

        int x = Math.max(a, b);
        int n = Math.min(a, b);

        answer = (long)(x + n) * (x - n + 1) / 2;

        return answer;
    }
}

