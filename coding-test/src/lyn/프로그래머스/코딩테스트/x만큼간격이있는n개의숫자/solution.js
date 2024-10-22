function solution(x, n) {
    var answer = [];//리턴할 배열 생성
    for (i=x; answer.length < n; i+=x)
        // x부터 시작해야하니 i=x
        // 배열 길이는 n보다 작을 동안
        // x씩 계속 더하기
        answer.push(i);// x 푸쉬

    return answer;
}

// x만큼 간격이 있는 n개의 숫자
// 정수 x와 자연수 n을 입력 받아,
// x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴

