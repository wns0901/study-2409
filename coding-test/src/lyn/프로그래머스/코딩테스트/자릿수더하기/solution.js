function solution(n)
{
    answer = 0;
    const arr = String(n).split("");
    // 스트링으로 바꿔서 숫자 다 자르기

    for (let a of arr) {
        //배열 크기 동안 변수 a 반복~
        answer += parseInt(a);
    } // 정수로 바꿔서 다시 다 더하기

    return answer;
}