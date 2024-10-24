package hye.프로그래머스.day241022.평균_구하기;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        String[] arr = str.split("");
        for(int i = 0; i < arr.length; i++) {
            Integer num = Integer.parseInt(arr[i]);
            answer += num;
        }
        return answer;
    }
}

