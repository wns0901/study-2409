package ldh.프로그래머스.day241029.나누어_떨어지는_숫자_배열;

import java.util.*;
public class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer=Arrays.stream(arr).filter(num -> num % divisor == 0).toArray();
        if (answer.length==0) {
            return new int[] {-1};
        }

        Arrays.sort(answer);
        return answer;

    }
}
