package hye.프로그래머스.day241029.정수_제곱근_판별;

public class Solution {
    public long solution(long n) {
        long answer = 0;
        double x = Math.sqrt((double)n);
        if(x == Math.floor(x)) {
            answer = (long)Math.pow((x + 1), 2);
        } else {
            answer = - 1;
        }
        return answer;
    }
}
