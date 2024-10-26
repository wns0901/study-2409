function solution(absolutes, signs) {
    return absolutes.reduce((a, c, i) => a += signs[i] ? c : (-c), 0)
}