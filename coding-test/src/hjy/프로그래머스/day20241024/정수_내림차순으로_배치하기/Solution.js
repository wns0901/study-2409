function solution(n) {
    var answer = 0;

    let arrNum = n.split('').trim();
    arrNum = arrNum.sort(function (a, b) {
        return b- a;
    })
   document.writeln(arrNum)
    return answer;
}
