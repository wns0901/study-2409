package lyn.프로그래머스.코딩테스트.day241029.정수_제곱근_판별;

public class Solution {
    public long solution(long n) {
        long answer = 0;
        // Math.sqrt() 제곱근 구하기
        // Math.pow() 제곱 구하기
        double sqrt = Math.sqrt(n); // sqrt = square root. 제곱근
        if(sqrt % 1 == 0) {
            answer = (long)Math.pow(sqrt + 1, 2);
        }
        else answer = -1;

        return answer;
    }
}


// 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
// n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고,
// n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

// 정수 = 1, 2, 3, 4.... 깔끔한 수
// 실수 = 0.1, 0.2 등 소숫점이 찍히는 수
// 3 같은 애들은 실수(0.nnn)가 제곱근이 될 수도 있음!