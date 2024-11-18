package hye.프로그래머스.day241031.제일_작은_수_제거하기;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};

        List<Integer> arrList = new ArrayList<>();
        for(int e : arr) {
            arrList.add(e);
        }

        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        arrList.remove(Integer.valueOf(min));

        answer = new int[arrList.size()];
        for(int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }
        if(arrList.size() < 1) {
            return new int[] {-1};
        } else {
            return answer;
        }
    }
}
