function solution(num, i = 1) {
    if (num === 1) return 0;
     num % 2 === 0 ? num /= 2 : num = num * 3 + 1;
    console.log(i + " : " + num)
    return num === 1 ? i : i === 500 ? -1 : solution(num, ++i)
}



console.log(solution(626331))