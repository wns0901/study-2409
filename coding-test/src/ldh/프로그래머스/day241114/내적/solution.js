function solution(a, b) {
    return a.reduce((acc, val, i) => acc + val * b[i], 0);
}
