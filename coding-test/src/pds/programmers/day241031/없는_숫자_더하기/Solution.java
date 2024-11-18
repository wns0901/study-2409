package pds.programmers.day241031.없는_숫자_더하기;

/*
*없는 숫자를 배열에서 찾을려면 어떻게 해야하지?
*
* 반복  돌려서 조건식이겠지?
*
* 배열을 돌려서  0~9중에 없는 숫자를 찾는다.
*
* 배열의 인덱스에
* 배열의 길이?
* 근거적인 힌트가 뭐가 있을까?
*
* 9개의 길이 배열을 다 쓰지를 않았잖아
*
* 흐름도를 생각해라
*
* 배열의길이를 선언했어
* 그럼 배열의 인덱스마다 5가 없는지? 아니야 이건 특정 조건이잖아
* 구현해야할게 뭘까?
*
* 배열 인덱스마다  없는 숫자를 더 한것으로return한다.
*
*
* [1,2,3,4,6,7,8,0]	   -5+9  = 14
*
* class Solution {
    public int solution(int[] numbers) {
    *
        int answer = 45;
       for(int num : numbers){
           answer-=num;
      45- 1=  44
      *
      * 44- 2 =42
      *       39,35,29,22,14,14

       }
        return answer;
    }
}
*
* 기능에 집중하지 말고 어떻게 이걸 말로 구현해낼수있을까? 를 집중하기
* */







//++++++++++++++++
// 내가  생각해낸 것.
//class Solution {
//    public int solution(int[] numbers) {
//
////        int[] arr1 = new int[numbers.length];
////        int sum = 0;
////
////        for (int i = 0; i < numbers.length; i++) {
////
////
////        }
////
////    return arr1. ;
////    }
////
////}

//Class Soul


