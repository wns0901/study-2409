package lyn.프로그래머스.코딩테스트.day241019.평균구하기;

public class 평균구하기 {
        public double solution(int[] arr) {
            double answer = 0;
            int cnt = 0;
            for (int i = 0; i < arr.length; i++) {
                answer += arr[i];
                cnt++;
            }
            answer = answer / cnt;
            return answer;
        }
}
