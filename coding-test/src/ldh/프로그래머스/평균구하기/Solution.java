package 프로그래머스.평균구하기;

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for(int num:arr){
            answer+=num;
        }
        return answer/arr.length;
    }
}