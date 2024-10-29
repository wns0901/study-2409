function solution(x) {
    const k = x.toString().split('').reduce((sum, digit) => sum + Number(digit), 0);
    return x % k === 0;
}
