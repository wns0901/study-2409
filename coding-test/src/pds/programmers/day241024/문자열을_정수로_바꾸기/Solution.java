package pds.programmers.day241024.문자열을_정수로_바꾸기;

class Solution {
    public long solution(int a, int b) {
        long sum = 0;

        // a가 b보다 크면 두 값을 바꿈
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        // a부터 b까지 합을 계산
        for (int i = a; i <= b; i++) {
            sum += i;
        }

        return sum;
    }
}