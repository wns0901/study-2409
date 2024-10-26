package jjy.프로그래머스.day241029.하샤드_수;

public class Solution {
    public boolean solution(int x) {
        int n = 0;

        for(String i : Integer.toString(x).split("")) {
            n += Integer.parseInt(i);
        }

        return x % (n) == 0;
    }
}
