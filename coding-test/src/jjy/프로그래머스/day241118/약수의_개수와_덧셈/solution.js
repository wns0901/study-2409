function solution(left, right) {
    var answer = 0;
    for (let i = left; i <= right; i++) {
        let count = 0;
        for (let z = 1; z <= i; z++) {
            if (i % z === 0) {
                count++;
            }
        }
        if (count % 2 === 0) {
            answer += i;
        } else {
            answer -= i;
        }
    }
    return answer;
}