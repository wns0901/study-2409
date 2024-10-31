function solution(n) {
    var answer = 0;
// trim -> 좌우 공백제거, String의 메소드다.
    let arrNum = n.toString().trim().split('');
    return Number(arrNum.sort(function (a, b) {
        return b - a;
    }).join(''))


}

console.log(solution(3452))
