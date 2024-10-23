package jjy.프로그래머스.day241024.자연수_뒤집어_배열로_만들기;

public class Solution {
    public int[] solution(long n) {
        String[] sArr =  String.valueOf(n).split("");
        int[] answer = new int[sArr.length];

        for (int i = 0; i < sArr.length; i++) {
            answer[i] = Integer.parseInt(sArr[sArr.length - 1 - i]);
        }

        return  answer;
    }
}
