function solution(n) {
    let answer = 0;
    let digits = n.toString().split("");
    for (let i = 0; i < digits.length; i++) {
        answer += parseInt(digits[i], 10);
    }
    return answer;
}
