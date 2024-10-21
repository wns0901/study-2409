function solution(n)
{
    let answer = 0;
    const str = String(n);

    for(let i = 0; i < str.length; i++) {
        answer += Number(str[i]);
    }

    return answer;
}