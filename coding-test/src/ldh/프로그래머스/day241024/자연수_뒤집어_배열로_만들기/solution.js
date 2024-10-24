function solution(n) {
    var answer = [];

    for (let e of n.toString().split('').reverse()) {
        answer.push(Number(e));
    }

    return answer;
}
