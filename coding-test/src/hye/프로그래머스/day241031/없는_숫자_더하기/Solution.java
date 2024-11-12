package hye.프로그래머스.day241031.없는_숫자_더하기;

public class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int sumAll = 45;
        int sum = 0;
        for(int e : numbers) {
            sum += e;
        }
        answer = sumAll - sum;
        return answer;
    }
}
