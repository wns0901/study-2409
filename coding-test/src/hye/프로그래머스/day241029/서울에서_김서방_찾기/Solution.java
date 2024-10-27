package hye.프로그래머스.day241029.서울에서_김서방_찾기;

public class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int i = 0;
        for(String e : seoul) {
            if(e.matches("Kim")) {break;}
            i++;
        }
        answer = "김서방은 " + i + "에 있다";
        return answer;
    }
}
