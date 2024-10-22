function solution(n) {
    let answer = 0;
    for (let i = 0; i <= n; i++) {
        if(n % i === 0){
            answer = answer + i;
        }

    }
    return answer;
}
console.log(solution(12));