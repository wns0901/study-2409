function solution(x, n) {
    let answer = new Array(n);
    let num = x;
    for (i = 0; i < answer.length ; i++){
        answer[i] = num;
        num += x;
    }
    return answer;
}
console.log(solution(2,5));
