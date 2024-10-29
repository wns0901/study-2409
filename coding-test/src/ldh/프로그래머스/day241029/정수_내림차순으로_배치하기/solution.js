function solution(n) {

    numArr=n.toString().split('');
    numArr.sort((a, b) => b - a);
    let answer = parseInt(numArr.join(''), 10);
    return answer;
}

