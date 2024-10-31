package hjy.프로그래머스.day241031.제일_작은_수_제거하기;

import java.util.ArrayList;
import java.util.List;

/*
* 문제 설명
정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수,
*  solution을 완성해주세요. 단, 리턴하려는
* 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
*  예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고,
*  [10]면 [-1]을 리턴 합니다.*/
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        if (arr.length == 1) {
            arr[0] = -1;
            return arr;

        }

        int min = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[min]) {
                min = i;
            }
        }
        int[] result = new int[arr.length - 1];
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != min) {
                result[num++] = arr[i];
            }

        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{1, 2, 3, 4}));
    }
}