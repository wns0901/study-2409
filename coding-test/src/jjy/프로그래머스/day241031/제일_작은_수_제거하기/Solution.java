package jjy.프로그래머스.day241031.제일_작은_수_제거하기;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[] {-1};

        IntStream stream = Arrays.stream(arr);
        int min = stream.min().getAsInt();

        stream = Arrays.stream(arr);
        return stream.filter(e -> e != min).toArray();
    }
}
