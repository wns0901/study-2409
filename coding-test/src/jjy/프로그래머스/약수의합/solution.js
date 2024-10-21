function solution(n) {
    let answer = 0;

    for (let i = 1; i <= n; i++) {
        answer += n % i === 0 ? i : 0
    }

    return answer;
}
