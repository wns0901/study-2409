function solution(a, b) {
    return a.reduce((a, c, i) => c * b[i] + a, 0);
}