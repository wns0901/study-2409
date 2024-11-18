function solution(left, right) {
    let answer = 0;

    for (let i = left; i <= right; i++) {
        let count = 0;
        for (let j = 1; j <= i; j++) {
            if (i % j === 0) count++;
        }
        answer += count % 2 === 0 ? i : -i;
    }

    return answer;
}

/* 완전제곱수라는걸 활용하면 짧아진다...
* function solution (left, right) {
* let result = 0;
* for(let i = left; i <= right; i++) {
* if(Number.isInteger(Math.sqrt(i))) {
* result -= i;
* } else P
* result += i; }
* }
* return result;
* }
*
*
*
* */