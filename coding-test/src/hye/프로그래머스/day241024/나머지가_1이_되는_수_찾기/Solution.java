package hye.프로그래머스.day241024.나머지가_1이_되는_수_찾기;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int x = 1; x < 1000000; x++) {
            if(n % x == 1) {
                answer = x;
                break;
            }
        }
        return answer;
    }
}
