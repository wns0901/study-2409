package jjy.프로그래머스.day241024.문자열_내_p와_y의_개수;

public class Solution {
    boolean solution(String s) {
        int pCnt = 0;
        int yCnt = 0;
        s = s.toLowerCase();

        for (char c : s.toCharArray()) {
            if (c == 'p') pCnt++;
            if (c == 'y') yCnt++;
        }

        return pCnt == yCnt;
    }
}
