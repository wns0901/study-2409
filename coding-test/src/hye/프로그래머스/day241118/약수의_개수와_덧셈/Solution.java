package hye.프로그래머스.day241118.약수의_개수와_덧셈;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        answer = s.matches("^[0-9]{4}$|^[0-9]{6}$");
        return answer;
    }
}


