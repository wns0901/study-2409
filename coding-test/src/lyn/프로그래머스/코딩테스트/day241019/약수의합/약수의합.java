package lyn.프로그래머스.코딩테스트.day241019.약수의합;

public class 약수의합 {
    class Solution {
    public int solution(int n) {
        // 솔루션이라는 인트타입 변수는 인트타입 n을 매개변수로 가짐
        // 아마 n이 입력받을 숫자인듯..
        int answer = 0; // 리턴할 변수 초기화

        for(int i = 1; i <= n; i++) { // n과 크기가 같아질 때까지 1씩 더하고
            if(n % i == 0) { // 1부터 n(자기자신)까지 나누어 떨어지면 약수
                answer += i; // 딱 맞아 떨어질 때마다 더하기
            }
        }

        return answer;
    }
}
}
