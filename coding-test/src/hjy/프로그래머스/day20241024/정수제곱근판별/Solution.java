package hjy.프로그래머스.day20241024.정수제곱근판별;

/*
* 임의의 양의 정수 n에 대해, n이
*  어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고,
*  n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.*/
class Solution {
    public long solution(long n) {
        long answer = 0;
        for (int i = 1; i <= n; i++) {
            double sqrt = Math.sqrt(n);
            if (n % sqrt == 0) {
                answer = (long) ((sqrt + 1) * (sqrt + 1));
                return answer;
            } else {
                answer = -1;
                return answer;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(3));
    }
}
