package pds.programmers.day241031.제일_작은_수_제거하기;

//class Solution {
//    public int[] solution(int[] arr) {
//        int[] arr1 = {};
//
//        for(int i =0; i< arr.length - 1; i++){
//            arr1[i] += arr[i];
//
//            if(arr.length <= 1){
//                arr1 = {-1};
//                return arr1;
//
//
//            }
//        }
//        return arr1;
//
//    }
//}
// 오류 입니다.



/*-----------------------------------------------------------------------
 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

class Solution {
    public int[] solution(int[] arr) {

    전체적인 큰 흐름



        //배열 길이가 1인 경우 -1 반환
        if(arr.length == 1){
            int[] answer = {-1};
            같은 배열을 지역변수로 사용한거네
            return answer;
        }

        //배열길이가 1보다 클 때 가장 작은 수를 뺀 길이의 배열로
        int[] answer = new int[arr.length-1];
        int[]형 answer를 arr배열의 길이 1보다 작은 배열의 렝스로 int 배열 생성

        int min = arr[0]; //하나의 값을 기준으로 잡음.
        작은  수를 구하기 위해  담는 저장소
        //가장 작은 수 구하기
        for(int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }

        int index = 0;  //반복문용 변수. 가장 작은 수가 여러개 일 수 있기 때문에 사용

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == min) {
                continue;
            }

            answer[index++] = arr[i];
        }

        return answer;

    }

}

*
*
*
*
*
*
*
*
*
* */