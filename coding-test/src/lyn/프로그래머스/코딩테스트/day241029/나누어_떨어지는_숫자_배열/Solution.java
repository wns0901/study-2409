package lyn.프로그래머스.코딩테스트.day241029.나누어_떨어지는_숫자_배열;


import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int cnt = 0;
        int num = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                cnt++;
            }
        }

        if (cnt == 0) {
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[cnt];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                answer[num] = arr[i];
                num++;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}
