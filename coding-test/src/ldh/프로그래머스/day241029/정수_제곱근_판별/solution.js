function solution(n) {
    const sqrtN = Math.sqrt(n);
    return Number.isInteger(sqrtN) ? (sqrtN + 1) ** 2 : -1;
}