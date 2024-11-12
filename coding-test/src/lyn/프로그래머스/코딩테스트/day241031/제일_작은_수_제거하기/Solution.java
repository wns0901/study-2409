package lyn.프로그래머스.코딩테스트.day241031.제일_작은_수_제거하기;

public class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        if (arr.length == 1) {
            answer = new int[]{-1}; // 길이가 1이면 -1 반환
        } else {
            answer = new int[arr.length - 1];
        } //배열의 길이가 2 이상이라면 가장 작은 수를 제외해
         // arr의 길이에서 1을 뺀 값이 길이가 되도록.

        int min = arr[0];
        min = Math.min(arr[0], arr[arr.length - 1]);
        // 최소값 찾기

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
            //arr 의 i번째 숫자가 min 이 아니라면
                answer[index++] = arr[i];
                // answer 의 index 번째 자리에 arr 의 i번째 숫자를 넣어라
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
    }
}




//정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution 을 완성해주세요.
// 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
// 예를들어 arr 이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
//
//제한 조건
//arr 은 길이 1 이상인 배열입니다.
//인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.