package hye.프로그래머스.day241118.부족한_금액_계산하기;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long countPrice = 0;
        for (int i = 1; i <= count; i++) {
            countPrice += price * i;
        }
        long change = countPrice - money;
        answer = change > 0 ? change : 0;
        return answer;
    }
}


