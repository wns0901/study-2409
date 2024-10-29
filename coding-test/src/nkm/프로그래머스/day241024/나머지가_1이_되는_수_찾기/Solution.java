package nkm.프로그래머스.day241024.나머지가_1이_되는_수_찾기;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int x = 0;
        for (x = 2; x < n; x++) {
            if (n % x == 1)
                return x;
        }
        return answer;
    }
}
