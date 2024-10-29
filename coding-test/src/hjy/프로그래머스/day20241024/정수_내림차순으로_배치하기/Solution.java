package hjy.프로그래머스.day20241024.정수_내림차순으로_배치하기;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

/*
* 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터
* 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.*/
class Solution {
    public long solution(long n) {
        long answer = 0;

        Object[] arrNum = Stream.of(String.valueOf(n).split("")).toArray();
        System.out.println(Arrays.toString(arrNum));
        Arrays.sort(arrNum, Collections.reverseOrder());
        for (int i = 0; i < arrNum.length ; i++) {
            System.out.print(arrNum[i]);
        }


        return answer;
    }
    //0은 왜 나오는지 모르겠음.
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(3456));
    }
}
