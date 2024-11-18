function solution(a, b) {
    let answer = 0;
    for (let i in a) {
        answer += a[i] * b[i]
    }
    return answer;
}