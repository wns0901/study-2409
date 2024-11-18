package hye.프로그래머스.day241118.행렬의_덧셈;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        answer = new int [arr1.length][arr1[0].length];
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr1[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }


//    class Solution {
//        public int[][] solution(int[][] arr1, int[][] arr2) {
//            return Arrays.stream(arr1) // arr1의 각 행에 대해
//                    .map(row -> Arrays.stream(row)  // 각 행의 요소에 대해
//                            .map(i -> i + arr2[Arrays.asList(arr1).indexOf(row)][Arrays.asList(arr1[0]).indexOf(i)]) // 합산
//                            .toArray())  // 결과를 다시 배열로 변환
//                    .toArray(int[][]::new);  // 결과 배열로 변환
//        }
//    }

}


