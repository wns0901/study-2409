package hye.프로그래머스.day241118.문자열_내림차순으로_배치하기;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        ArrayList<String> list = new ArrayList<>();

        for(char c : s.toCharArray()) {
            list.add(String.valueOf(c));
        }

        Collections.sort(list, Collections.reverseOrder());
        for(String c : list) {
            answer = answer.concat(c);
        }

        return answer;
    }
}


