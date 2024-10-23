package jjy.프로그래머스.day241024.두_정수_사이의_합;

public class Solution {
        public long solution(int a, int b) {
            long min = Math.min(a, b);
            long max = Math.max(a, b);

            return (max * (max + 1) - (min - 1) * min) / 2;
        }
    }

