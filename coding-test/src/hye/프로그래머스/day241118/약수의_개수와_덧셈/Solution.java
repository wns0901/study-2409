package hye.프로그래머스.day241118.약수의_개수와_덧셈;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int j = left; j <= right; j++) {
            int count = 0;

            for(int i = 1; i <= Math.sqrt(j); i++) {
                if(j % i == 0) {
                    count++;
                    if(i != j / i) {
                        count++;
                    }
                }
            }
            if(count % 2 == 0) {
                answer += j;
            } else {
                answer -= j;
            }
        }
        return answer;
    }
}


