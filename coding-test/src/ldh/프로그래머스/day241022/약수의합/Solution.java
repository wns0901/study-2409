package 프로그래머스.약수의합;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int i=1;
        while(i<=n){
            if(n%i==0){
                answer+=i;
            }
            i++;
        }
        return answer;
    }
}
