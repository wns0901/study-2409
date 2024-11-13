package jjy.프로그래머스.day241114.가운데_글자_가져오기;

class Solution {
    public String solution(String s) {
        int targetIndex = s.length() / 2;
        return s.length() % 2 == 0 ? s.substring(targetIndex - 1, targetIndex + 1) : s.substring(targetIndex, targetIndex + 1);
    }
}