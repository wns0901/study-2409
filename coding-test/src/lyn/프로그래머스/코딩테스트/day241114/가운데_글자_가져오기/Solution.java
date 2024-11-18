package lyn.프로그래머스.코딩테스트.day241114.가운데_글자_가져오기;

class Solution {
    public String solution(String s) {
        String answer = "";
        int i = 0;

        if(s.length() % 2 == 0) { //짝수
            i = s.length() / 2;
            answer += s.charAt(i-1); // 중간의 왼쪽꺼 저장
            answer += s.charAt(i); // 중간의 오른쪽꺼 저장

        } else {//홀수
            i = s.length() / 2;
            answer += s.charAt(i); // 걍 가운데꺼 저장
        }
        return answer;
    }
}
//        String s 의 length 갖고 홀짝...


//단어 s의 가운데 글자를 반환하는 함수, solution 을 만들어 보세요.
// 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
//
//제한사항
//s는 길이가 1 이상, 100이하인 스트링입니다.

// abcde  c
// qwer  we