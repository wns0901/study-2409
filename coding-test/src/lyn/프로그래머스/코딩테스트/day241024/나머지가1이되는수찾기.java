package lyn.프로그래머스.코딩테스트.day241024;

public class 나머지가1이되는수찾기 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i < n; i++) { //3부터 100만까지랬으니까..
        if (n % i == 1){ //3부터 돌테니 젤 작은게 나오자마자 끝
            answer = i;
            break;
        }
        }
        return answer;
    }
}


/*
function solution(n) {
    var answer = 0;
    answer = Array.from({ length: n - 1 }, (_, i) => i + 1) // 1부터 n-1까지의 배열 생성
        .reduce((prev, cur) => (n % cur === 1 && prev === -1 ? cur : prev), -1);
        // -1을 처음 만족하는 수이며 나머지가 1인 것 둘 다 만족해야함
근데 이해 안 됨... 아오
    return answer;
} */