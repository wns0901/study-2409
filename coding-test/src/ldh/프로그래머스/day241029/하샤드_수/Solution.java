package ldh.프로그래머스.day241029.하샤드_수;

public class Solution {
    public boolean solution(int x) {
        int originalX=x;
        boolean answer = false;
        int k=0;
        while(x>0){
            k+=x%10;
            x=x/10;
        }
        if (originalX%k==0){
            answer=true;
        }
        return answer;
    }
}
