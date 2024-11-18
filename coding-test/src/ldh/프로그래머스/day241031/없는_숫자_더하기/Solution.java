package ldh.프로그래머스.day241031.없는_숫자_더하기;

public class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean[] found = new boolean[10];

        for (int number : numbers) {
            found[number] = true;
        }

        for (int i = 0; i < 10; i++) {
            if (!found[i]) {
                answer += i;
            }
        }

        return answer;
    }
}
