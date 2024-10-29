package ldh.프로그래머스.day241029.정수_제곱근_판별;

public class Solution {
    public long solution(long n) {
        long answer = -1;
        double sqrt=Math.sqrt(n);
        if(sqrt==(long)sqrt){
            long m=(long)sqrt+1;
            answer=m*m;
        }
        return answer;
    }
}
