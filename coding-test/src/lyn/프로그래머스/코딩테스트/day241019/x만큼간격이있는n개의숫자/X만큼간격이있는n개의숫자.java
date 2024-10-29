package lyn.프로그래머스.코딩테스트.day241019.x만큼간격이있는n개의숫자;

public class X만큼간격이있는n개의숫자 {
    // x만큼 간격이 있는 n개의 숫자
    // 정수 x와 자연수 n을 입력 받아,
    // x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴

    //int 의 표현 범위는 -21억~+21억이지만, x*n에서 이 범위를 벗어나므로
    // x를 long타입으로 변경해줘야 함.
    class Solution {
        public long[] solution(int x, int n) {
            long[] answer = new long[n]; // n 크기만큼의 배열 생성
            long y = x; // 이거 long 변환 안 해줘서 애먹음...
            for (int i = 0; i < n; i++) {
                answer[i] = y * (i + 1); // 첫번째 곱이 x*0이 되지 않기 위해 +1하고.
                // 1부터 n까지 곱한 수의 나열.
            }
            return answer;
        }
    }
}
