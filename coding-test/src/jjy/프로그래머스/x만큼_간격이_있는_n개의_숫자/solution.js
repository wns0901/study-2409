function solution(x, n) {
    return new Array(n).fill(x).map((n, i) => n * (i + 1))
}