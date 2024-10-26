function solution(x) {
    return x % String(x).split('').reduce((a, b) => Number(a) + Number(b)) === 0;
}