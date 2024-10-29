package jjy.프로그래머스.day241029.서울에서_김서방_찾기;

import java.util.Arrays;

public class Solution {
    public String solution(String[] seoul) {
        int index = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 " + index +"에 있다";
    }
}
