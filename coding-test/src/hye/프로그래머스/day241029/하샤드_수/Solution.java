package hye.프로그래머스.day241029.하샤드_수;

public class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int xClone = x;
        int tens = (int) Math.log10(x);
        for (int i = 0; tens >= i; i++) {
            if (x >= 1) {
                sum += x % 10;
                x /= 10;
            }
        }
        answer = (xClone % sum == 0);
        return answer;
    }
}
