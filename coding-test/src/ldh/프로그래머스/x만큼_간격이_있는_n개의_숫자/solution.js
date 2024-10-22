function solution(x, n) {
    var answer = [];
    for (let i = 0; i < n; i++) {
        answer.push((i + 1) * x);
    }
    return answer;
}
