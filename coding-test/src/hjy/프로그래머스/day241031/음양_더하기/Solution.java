package hjy.프로그래머스.day241031.음양_더하기;

/*
* 문제 설명
어떤 정수들이 있습니다. 이 정수들의 절댓값을 차례대로 담은 정수
* 배열 absolutes와 이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다.
* 실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.*/
class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else
                answer -= absolutes[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.solution(new int[]{
//                4, 7, 12}, new boolean[]{'true', 'false', 'true'
//        }));
    }
}