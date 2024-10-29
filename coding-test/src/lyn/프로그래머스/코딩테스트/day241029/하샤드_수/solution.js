function solution(x)
{
    var answer = true;
    let sum = 0;
    String(x).split("").forEach(num => {
            sum += parseInt(num, 10)}) //10진수로 해석해줭
    // 스트링으로 바꿔서 숫자 다 자르기


    return x % sum === 0;
}