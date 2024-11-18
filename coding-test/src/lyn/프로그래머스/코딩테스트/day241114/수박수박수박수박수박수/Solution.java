package lyn.프로그래머스.코딩테스트.day241114.수박수박수박수박수박수;

class Solution {
    public String solution(int n) {
        String answer = "";
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                answer += '박';
            } else {
                answer += '수';
            }
        }
        return answer;
    }
}

//길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하라.

//제한 조건
//n은 길이 10,000이하인 자연수입니다.

// 3 "수박수"
// 4 "수박수박"