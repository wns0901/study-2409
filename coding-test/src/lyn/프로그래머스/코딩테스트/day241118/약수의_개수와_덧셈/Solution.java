package lyn.프로그래머스.코딩테스트.day241118.약수의_개수와_덧셈;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; ++j) {
                if (i % j == 0) cnt++;
            }
            if (cnt % 2 == 0)
                answer += i;
            else answer -= i;
        }
        return answer;
    }
}


// 두 정수 left 와 right 가 매개변수로 주어집니다.
// left 부터 right 까지의 모든 수들 중에서,
// 약수의 개수가 짝수인 수는 더하고,
// 약수의 개수가 홀수인 수는 뺀 수를 return


// 약수는 숫자 n을 1~n 까지 나눴을 때 나머지가 0인 수.
// 1. n의 약수를 구하는 for 문. cnt++
// 2. left ~ right 까지 반복 ++. 이걸 1의 밖에 씌움

// if (cnt % 2 == 1) 홀수일 경우 -n 되도록. odd
// if (cnt % 2 == 0) 짝수일 경우 +n 되도록. even

// answer += (n)