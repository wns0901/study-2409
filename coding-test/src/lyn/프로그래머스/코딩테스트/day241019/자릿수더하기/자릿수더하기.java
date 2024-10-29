package lyn.프로그래머스.코딩테스트.day241019.자릿수더하기;

public class 자릿수더하기 {
    public int solution(int n) {
        int answer = 0;
        String[] arr = String.valueOf(n).split("");
        // 스트링으로 바꿔서 숫자 다 자르기

        for (String a : arr) {
            //향상된 포문~ 배열 크기 동안 변수 a 반복~
            answer += Integer.parseInt(a);
        } // 정수로 바꿔서 다시 다 더하기
        return answer;
    }
}
