function solution(n)
{
     let answer = 0;
    // let str = str.split('');
    // for (let i = 0; i < str.length; i++) {
    //     answer += n[i]
    // }
    // return answer;
    return n.toString().split('').reduce((sum, num) => {
       parseInt(sum) + parseInt(num);
    }, 0 )
}
console.log(solution(123));