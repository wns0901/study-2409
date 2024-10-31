//package hjy.프로그래머스.day241031.없는_숫자_더하기;
//
//import java.util.Arrays;
//
///*
//* 문제 설명
//0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. numbers에서
//*  찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.*/
//class Solution {
//    public int solution(int[] numbers) {
//        int answer = -1;
//        int result = 0;
// includes 는 문자열 메소드라 number을 문자열로 바꿔야함..
//
//        String number = Integer.toString(numbers);
//        for (int i = 0; i <= 9; i++) {
//            if (!number.includes(i)) {
//                result += i;
//            }
//        }
//
//
//        return result;
//    }
//
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.solution(new int[]{1, 2, 3, 4, 5, 7}));
//    }
//}