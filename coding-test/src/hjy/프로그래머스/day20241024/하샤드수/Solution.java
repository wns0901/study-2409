package hjy.프로그래머스.day20241024.하샤드수;

import java.util.stream.Stream;

/*
양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
* */
class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        Object[] arrNum = Stream.of(String.valueOf(x).split("")).toArray();
        for (int i = 0; i < arrNum.length; i++) {
            sum += Integer.parseInt(arrNum[i].toString());
            System.out.println(sum);
            if( x % sum == 0 ){
                answer = true;
            } else {
                answer = false;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(18));
        System.out.println(solution.solution(11));
    }
}
