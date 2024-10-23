package jjy.프로그래머스.day241022.약수의합;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            answer += n % i == 0 ? i : 0;
        }
        return answer;
    }
}
