package hjy.프로그래머스.day20241024.나누어떨어지는_숫자_배열;
/*
array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수,
 solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
* */
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
           if(arr[i] % divisor == 0){
               cnt++;
           }

        }
        return answer;
    }
}