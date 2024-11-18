package ldh.프로그래머스.day241114.수박수박수박수박수박수;

class Solution {
    public String solution(int n) {

        String answer = "수박".repeat((n + 1) / 2);
        return answer.substring(0, n);
    }
}