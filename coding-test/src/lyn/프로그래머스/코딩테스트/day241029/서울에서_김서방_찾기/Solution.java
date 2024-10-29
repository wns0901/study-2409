package lyn.프로그래머스.코딩테스트.day241029.서울에서_김서방_찾기;

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        for (int i = 0; i < seoul.length; i++) {
            if("Kim".equals(seoul[i])) {
                answer = "김서방은 " + i + "에 있다";
                break;
            }
        }
        return answer;
    }
}
