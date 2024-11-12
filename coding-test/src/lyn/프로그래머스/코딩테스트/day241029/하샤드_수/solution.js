function solution(x)
{
    var answer = true;
    let prev = 0;
    // String(x).split("").forEach(num => {
    //         sum += parseInt(num, 10)}) //10진수로 해석해줭
    // // 스트링으로 바꿔서 숫자 다 자르기
    //
    prev = String(x).split("").reduce((prev, cur) => Number(prev) + Number(cur))
    return x % prev === 0;
    // return x % String(x).split("").reduce((prev, cur) => Number(prev) + Number(cur)) === 0;
}