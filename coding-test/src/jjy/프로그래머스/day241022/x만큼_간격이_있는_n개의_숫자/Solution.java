package jjy.프로그래머스.day241022.x만큼_간격이_있는_n개의_숫자;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for (int i = 0; i < n; i++) {
            answer[i] = (long) (i + 1) * x;
        }

        return answer;
    }
}
