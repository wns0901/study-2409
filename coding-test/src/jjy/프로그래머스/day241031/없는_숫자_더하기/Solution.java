package jjy.프로그래머스.day241031.없는_숫자_더하기;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        IntStream stream = Arrays.stream(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
        List<Integer> list = Arrays.stream(numbers)
                .boxed()
                .toList();
        return stream.filter(e -> !list.contains(e)).reduce(0, Integer::sum);
    }
}


//class Solution {
//    public int solution(int[] numbers) {
//        int sum = 45;
//        for (int i : numbers) {
//            sum -= i;
//        }
//        return sum;
//    }
//}