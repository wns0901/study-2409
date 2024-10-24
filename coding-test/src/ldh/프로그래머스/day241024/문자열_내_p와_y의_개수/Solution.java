package ldh.프로그래머스.day241024.문자열_내_p와_y의_개수;

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<n;i++){
            if(n%i==1){
                answer=i;
                break;
            }
        }
        return answer;
    }
}
