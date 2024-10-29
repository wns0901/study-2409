package lyn.프로그래머스.코딩테스트.day241019.짝수와홀수;

public class 짝수와홀수 {
    public String solution(int num) {
        String answer = "";

        if (num % 2 == 0)
            answer = "Even";

        else if(num % 2 == 1)

            answer = "Odd";

        return answer;
    }
}
