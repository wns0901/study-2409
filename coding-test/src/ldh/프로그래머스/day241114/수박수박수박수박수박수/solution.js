function solution(n) {

    let result = "수박".repeat(Math.ceil(n / 2));
    return result.slice(0, n);
}
