function solution(arr, divisor) {
    const answer = arr.filter((x) => x % divisor === 0).sort((a, b) => a - b);
    return answer[0] ? answer : [-1];
}