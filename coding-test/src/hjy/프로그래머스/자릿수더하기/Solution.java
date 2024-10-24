package hjy.프로그래머스.자릿수더하기;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        for (int i = 0; i < str.length() ; i++) {
            answer += Character.getNumericValue(str.charAt(i));

            /*
            * Character.getNumericValue()는 Java의 Character
            * 클래스에 있는 정적 메소드입니다. 이 메소드는 주어진 문자의 숫자 값을 반환합니다.

            주요 특징:
            • **문자를 숫자로 변환**: 예를 들어, '1'은 1로, 'A'는 10으로 변환됩니다.
            • **유니코드 지원**: 다양한 문자 체계의 숫자를 처리할 수 있습니다.
            • **범위 외 문자 처리**: 숫자가 아닌 문자에 대해서는 -1을 반환합니다.*/

       }
        return answer;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(123));
    }
}