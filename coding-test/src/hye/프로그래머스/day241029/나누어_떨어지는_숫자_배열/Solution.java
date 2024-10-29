package hye.프로그래머스.day241029.나누어_떨어지는_숫자_배열;
import java.util.Arrays;
import java.util.ArrayList;

public class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for(int e : arr) {
            if(e % divisor == 0) {
                list.add(e);
            }
        }
        if(list.isEmpty()) {
            return new int[] {-1};
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);
        return answer;
    }
}
