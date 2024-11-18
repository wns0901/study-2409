function solution(n) {
    return Array(n).fill("").map((c,i) => i % 2 ? "박" : "수").join('')
}