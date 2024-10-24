package nkm.프로그래머스.day241024.문자열을_정수로_바꾸기;

class Solution {
    public int solution(String s) {
        int answer = 0;
        // 문자열 길이가 1 이상, 5 이하일 때만 처리
        if (s.length() > 1 && s.length() <= 5) {
            answer = Integer.parseInt(s); // 문자열에서 정수타입으로 변환
        }
        return answer;
    }
}