package ldh.프로그래머스.day241114.가운데_글자_가져오기;

class Solution {
    public String solution(String s) {
        int length = s.length();
        int mid = length / 2;
        System.out.println(mid);

        if (length % 2 == 1) {
            return s.substring(mid, mid + 1);
        }
        else {
            return s.substring(mid - 1, mid + 1);
        }

    }
}

