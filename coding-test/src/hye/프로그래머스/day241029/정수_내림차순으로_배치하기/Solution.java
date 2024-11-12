package hye.프로그래머스.day241029.정수_내림차순으로_배치하기;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] str = String.valueOf(n).trim().split("");
        Arrays.sort(str, Collections.reverseOrder());
        String string = String.join("", str);
        answer = Long.parseLong(string);
        return answer;
    }
}
