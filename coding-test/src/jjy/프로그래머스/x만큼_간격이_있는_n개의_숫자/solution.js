function solution(x, n) {
    const answer = [];
    for(let i = 0; i < n; i++) {
        answer[i] = x * (i + 1);
    }
    return answer;
}